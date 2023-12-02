package com.game;

public class Validation {
     /*This method check is input matches the regex for character format and if the input is not empty */
     public void isValidCharacterName(String inpuString) {
        // Check if the input contains only letters and is not empty
        if (inpuString.matches("[a-zA-Z]+") && !inpuString.isEmpty()) {
            System.out.println("You have entered a valid name!");
        } 
    }
  
    public boolean verifyCharacter(String holdClass, String characterName) {
        if (holdClass.equalsIgnoreCase("Knight") || holdClass.equalsIgnoreCase("Wizard")) {
            return true; // Character selection is valid
        } else {
            return false; // Character selection is invalid
        }
    }
  
    public boolean verifySex(String holdSex) {
        if (holdSex.equalsIgnoreCase("Male") || holdSex.equalsIgnoreCase("Female")) {
            return true; // Sex selection is valid
        } else {
            return false; // Sex selection is invalid
        }
    }

    

}
