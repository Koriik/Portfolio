package com.game;

public class WizardEntrance {
     
  
  
   public void entrance(String sex) {
         if (sex.equalsIgnoreCase("Male")) {
             maleWizard();
         } else if (sex.equalsIgnoreCase("Female")) {
             femaleWizard();
         }
     }


    public void maleWizard() {
   System.out.println("You awaken in a medic tent, with the sounds of roars and \nclashing steel in the background. " +
   "\nYou sit up and see the most beautiful nurse of your life tending to your leg." + 
   "\nYou gasp in awe and shock at her beauty, with her breast overfilling her shirt and her prefectly plump cheeks sticking out of the bottom of her silk skirt.");
   
   }

   public void femaleWizard() {
   
   System.out.println("You awaken in a medic tent, with the sounds of roars and \nclashing steel in the background. " + 
   "You sit up and see the most scalpted nurse of your life tending to your leg. " + 
   " You gasp in awe and shock at his sexiness, with his package \noverfilling his pants and his muscles bursting through the seams of his silk shirt.");
  
   }
}
