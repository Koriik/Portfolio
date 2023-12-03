package com.game;

import java.util.Scanner;

public class FunGame {
   private static final int HEALTH = 100;
   private static final int WIZARD_ARMOR = 50;
   private static final int ARMOR = 100;
   private static final int WIZARD_MANA = 100;
   private static final int MANA = 50;
   private static final int RAGE = 0;
   private static final String GEAR_SLOT_ONE = "Mail Helmet";
   private static final String WIZ_GEAR_ONE = "Cloth Shroud";
   private static final String GEAR_SLOT_TWO = "Mail Shoulders";
   private static final String WIZ_GEAR_TWO = "Cloth Shoulders";
   private static final String GEAR_SLOT_THREE = "Mail Chestgaurd";
   private static final String WIZ_GEAR_THREE = "Robe";
   private static final String GEAR_SLOT_FOUR =  "Mail Leggings";
   private static final String WIZ_GEAR_FOUR = "Cloth Leggings";
   private static final int MONEY = 50;
   private static final String WEAPON = "Dull Sword";
   private static final String WIZ_WEP = "Small Dirk";
   private static final String YEAR = "20,000 B.C.";
   private static final String HORSE = "Basic Horse";
   private static final String PET_CREATURE = "Wolf";
   private static final String WIZ_PET = "Mana Wolf";
   private static final int LEVELS = 1;
   private static final String WIZ_SPELL = "Fireball";
   private static final String SPELLS = "Light Flash";
   private static final int WIZ_MELEE_ATTACK = 2;
   private static final int MELEE_ATTACK = 5;
   private DifferentPlayer player;
   private Scanner scanner;
   private Validation validation;
   private String characterName;
   private String holdClass;
   private String holdSex;
   private Boolean startKnight = false;
   private Boolean startWizard = false;

   /*This method instantiates the fungame class and calls the entranceMusic Method */
   public static void main(String[] args) {
      FunGame fungame = new FunGame();
      fungame.run();
   
   }

   public void run() {
      scanner = new Scanner(System.in);
      validation = new Validation();
      entranceMusic();
      welcomeUser(scanner);
      fillerImmersion();
      characterName(scanner);
      fillerImmersion();
      welcomeCharacter();
      fillerImmersion();
      selectCharacter(scanner);
      fillerImmersion();
      selectSex(scanner);
      fillerImmersion();
      choosingYourAdventure();
      fillerImmersion();
      startingAdventure();
   }

   /*This method creates an object of the MusicPlayer Class and calls its startPlaying method */
   public void entranceMusic() {
      player = new DifferentPlayer();
      player.startMusic();
   }

   /*This method welcomes the user into the game and creates astrisks lines for immersion */
   public void welcomeUser(Scanner scanner) {
      System.out.println("Welcome to Aincent Dwellers!! This is a simple adventure to begin with, but can you withstand and outsmart the game?!");
   }

   public void characterName(Scanner scanner) {
      while (true) {
         String inputString;
         System.out.println("Enter your character's name: ");
         inputString = scanner.nextLine();
         characterName = inputString;
      
         validation.isValidCharacterName(inputString);
         break;   
      }
   }


   public void welcomeCharacter() {
      //printing out the characters name and blessing them.
      System.out.println("Welcome: " + characterName + "!!! May the Ancient Dwellers be with you.");
      //creating astrisks lines
   }

   /*this method prints out the character choices of Knight and Wizard with astrisks lines*/
   public void selectCharacter(Scanner scanner) {
      while (true) {
         System.out.println("It's time to choose a character!");
         System.out.println("Your choices are: \n#1: Knight #2: Wizard \nEnter your character: ");
 
         String inputString = scanner.nextLine();
         holdClass = inputString;
 
         if (validation.verifyCharacter(holdClass, characterName)) {
             // Character selection is valid, exit the loop
             System.out.println("Your character choice is valid.");
             break;
         } else {
             // Character selection is invalid, prompt the user again
             System.out.println("Invalid character selection. Please try again.");
         }
     }
   }
   /*This method creates a while (true) loop for verification of input
    * on the sex of the character, it then prints out astrisks
    * then calls the startKnightadventure passing the scanner and sex
    */
   public void selectSex(Scanner scanner) {
      
      while(true) {
         System.out.println("Are you a male or female?");
         String inputString = scanner.nextLine();
         holdSex = inputString;
        
         if (validation.verifySex(holdSex)) {
             // Character selection is valid, exit the loop
             System.out.println("Your sex choice is valid.");
             break;
         } else {
             // Character selection is invalid, prompt the user again
             System.out.println("Invalid sex selection. Please try again.");
         }
      }
   }

   public void choosingYourAdventure() {

      if (holdClass.equalsIgnoreCase("Knight")) {
         System.out.print("One moment while we prepare your Knight adventure!\n");
         startKnight = true;
         System.out.println(startKnight);
      } else if (holdClass.equalsIgnoreCase("Wizard")) {
         System.out.print("One moment while we create your Wizard adventure!\n");
         startWizard = true;
         System.out.println(startWizard);
      }
   }

   public void startingAdventure() {
      if (startKnight != false) {
         startKnightAdventure();
      } else if (startWizard != false) {
         startWizardAdventure();
      }
   }

   /*This method instantiates the Knight constructor setting the Knight stats to it
    * we then call the Knight class and call the entrance knight method from it.
   */
   public void startKnightAdventure() {
      System.out.println("One Moment, your character stats are being created.");
      fillerImmersion();
      InterfaceBuilder knightBuilder = new KnightBuilder();
      GameInterface knighInterface = knightBuilder.setCharacterName(characterName)
                                             .setHealth(HEALTH)
                                             .setArmor(ARMOR)
                                             .setMana(MANA)
                                             .setRage(RAGE)
                                             .setGearSlotOne(GEAR_SLOT_ONE)
                                             .setGearSlotTwo(GEAR_SLOT_TWO)
                                             .setGearSlotThree(GEAR_SLOT_THREE)
                                             .setGearSlotFour(GEAR_SLOT_FOUR)
                                             .setMoney(MONEY)
                                             .setWeapon(WEAPON)
                                             .setYear(YEAR)
                                             .setHorse(HORSE)
                                             .setPetCreature(PET_CREATURE)
                                             .setLevels(LEVELS)
                                             .setSpells(SPELLS)
                                             .setMeleeAttack(MELEE_ATTACK)
                                             .setSex(holdSex)
                                             .build();      
      fillerImmersion();
      System.out.println("Game is starting...");
      fillerImmersion();
      KnightEntrance entrance = new KnightEntrance();
      entrance.entrance(holdSex);
      fillerImmersion();
      
      endGame();
   }

   public void startWizardAdventure() {
      System.out.println("One Moment, your character stats are being created.");
      fillerImmersion();
      InterfaceBuilder wizardBuilder = new WizardBuilder();
      GameInterface wizardInterface = wizardBuilder.setCharacterName(characterName)
                                             .setHealth(HEALTH)
                                             .setArmor(WIZARD_ARMOR)
                                             .setMana(WIZARD_MANA)
                                             .setRage(RAGE)
                                             .setGearSlotOne(WIZ_GEAR_ONE)
                                             .setGearSlotTwo(WIZ_GEAR_TWO)
                                             .setGearSlotThree(WIZ_GEAR_THREE)
                                             .setGearSlotFour(WIZ_GEAR_FOUR)
                                             .setMoney(MONEY)
                                             .setWeapon(WIZ_WEP)
                                             .setYear(YEAR)
                                             .setHorse(HORSE)
                                             .setPetCreature(WIZ_PET)
                                             .setLevels(LEVELS)
                                             .setSpells(WIZ_SPELL)
                                             .setMeleeAttack(WIZ_MELEE_ATTACK)
                                             .setSex(holdSex)
                                             .build();      
      fillerImmersion();
      System.out.println("Game is starting...");
      fillerImmersion();
      WizardEntrance entrance = new WizardEntrance();
      entrance.entrance(holdSex);
      fillerImmersion();
      
      endGame();
   }

   public void fillerImmersion() {
      //creating astrisks lines
      for(int x = 0; x < 4; ++x) {
         System.out.println("***************");

         try {
            Thread.sleep(600L);
         } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
         }
      }
   }

   public void endGame() {
      System.out.println("Press 'Q' or 'q' to quit: ");
      String inputString = scanner.nextLine();

      if (inputString.equalsIgnoreCase("q")) {
         System.out.println("Quiting the program.");
         player.stop();
         scanner.close();
   
      }
   }
  
}