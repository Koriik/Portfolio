package com.game;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;

public class DifferentPlayer {
    private Player player;
    private Thread playerThread;

    public void play(InputStream inputStream) {
        try {
            player = new Player(inputStream);
            playerThread = new Thread(() -> {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    handleMusicError(e);
                }
            });
            playerThread.start();
        } catch (JavaLayerException e) {
            handleMusicError(e);
        }
    }

    public void stop() {
        if (player != null && playerThread != null && playerThread.isAlive()) {
            player.close();
            playerThread.interrupt();
        }
    }

    public void startMusic() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("All Eyes On Me -- Bo Burnham (from _Inside_ - album out now).mp3");
            if (inputStream != null) {
                play(inputStream);
            } else {
                // Handle case when input stream is null (file not found)
                System.out.println("File not found");
            }
        } catch (Exception e) {
            handleMusicError(e);
        }
    }

    private void handleMusicError(Exception e) {
        e.printStackTrace();
        // Error handling logic
    }
}