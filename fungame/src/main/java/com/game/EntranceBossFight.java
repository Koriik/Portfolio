package com.game;

public class EntranceBossFight {
    private GameInterface knightInterface;
    private static final int BOSS_HEALTH = 100;
    private static final int BOSS_DAMAGE = 2;
    
    public EntranceBossFight(GameInterface knighInterface) {
        this.knightInterface = knighInterface;
    }
    
    public void bossInfo() {

        System.out.println("This beast hails from one of the darkest"
        + " places in the underworld where there is torrental rain of flames"
        + " and screams of those whom burn for eternity, The sky permanatly filled with red"
        + " clouds of demise, that are impenatrable to any known mortal");
        damageFromBoss();
    }

    public void damageFromBoss() {
       int knightHealth = knightInterface.getHealth() - BOSS_DAMAGE;
       knightInterface.setHealth(knightHealth);
       System.out.println(knightInterface.getHealth());
    }

    public void attackBoss() {
        int knightAttack = knightInterface.getMeleeAttack();
    }

    public void defendBoss() {
        int knightArmor = knightInterface.getArmor();
    }

    public void lootBoss() {

    }
}
