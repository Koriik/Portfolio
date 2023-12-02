package com.game;

public class Wizard {
   private String characterSelection;
   private int health;
   private int armor;
   private int mana;
   private String gearSlotOne;
   private String gearSlotTwo;
   private String gearSlotThree;
   private String gearSlotFour;
   private int money;
   private String weapon;
   private String year;
   private String horse;
   private String petCreature;
   private int levels;
   private String spells;
   private int meleeAttack;
   private String sex;

   public Wizard() {
     
   }
   
  

   public String getCharacterSelection() {
      return this.characterSelection;
   }

   public void setCharacterSelection(String characterSelection) {
      this.characterSelection = characterSelection;
   }

   public int getHealth() {
      return this.health;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public int getArmor() {
      return this.armor;
   }

   public void setArmor(int armor) {
      this.armor = armor;
   }

   public int getMana() {
      return this.mana;
   }

   public void setMana(int mana) {
      this.mana = mana;
   }

   public String getGearSlotOne() {
      return this.gearSlotOne;
   }

   public void setGearSlotOne(String gearSlotOne) {
      this.gearSlotOne = gearSlotOne;
   }

   public String getGearSlotTwo() {
      return this.gearSlotTwo;
   }

   public void setGearSlotTwo(String gearSlotTwo) {
      this.gearSlotTwo = gearSlotTwo;
   }

   public String getGearSlotThree() {
      return this.gearSlotThree;
   }

   public void setGearSlotThree(String gearSlotThree) {
      this.gearSlotThree = gearSlotThree;
   }

   public String getGearSlotFour() {
      return this.gearSlotFour;
   }

   public void setGearSlotFour(String gearSlotFour) {
      this.gearSlotFour = gearSlotFour;
   }

   public int getMoney() {
      return this.money;
   }

   public void setMoney(int money) {
      this.money = money;
   }

   public String getWeapon() {
      return this.weapon;
   }

   public void setWeapon(String weapon) {
      this.weapon = weapon;
   }

   public String getYear() {
      return this.year;
   }

   public void setYear(String year) {
      this.year = year;
   }

   public String getHorse() {
      return this.horse;
   }

   public void setHorse(String horse) {
      this.horse = horse;
   }

   public String getPetCreature() {
      return this.petCreature;
   }

   public void setPetCreature(String petCreature) {
      this.petCreature = petCreature;
   }

   public int getLevels() {
      return this.levels;
   }

   public void setLevels(int levels) {
      this.levels = levels;
   }

   public String getSpells() {
      return this.spells;
   }

   public void setSpells(String spells) {
      this.spells = spells;
   }

   public int getMeleeAttack() {
      return this.meleeAttack;
   }

   public void setMeleeAttack(int meleeAttack) {
      this.meleeAttack = meleeAttack;
   }

   public String getSex() {
      return this.sex;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }
   public void intializeStats(String holdSex, String characterName) {
      this.setCharacterSelection(characterName);
      this.setHealth(100); 
      this.setArmor(50); 
      this.setMana(100);
      this.setGearSlotOne("Cloth Helmet"); 
      this.setGearSlotTwo("Cloth Shoulders"); 
      this.setGearSlotThree("Cloth Chestgaurd");
      this.setGearSlotFour("Cloth Leggings");
      this.setMoney(50); 
      this.setWeapon("Dull Dagger"); 
      this.setYear("20,000 B.C.");
      this.setHorse("Basic Horse"); 
      this.setPetCreature("Mana Wolf"); 
      this.setLevels(1);
      this.setSpells("Light Flash");
      this.setMeleeAttack(2);
      this.setSex(holdSex);
   }

   public void entrance() {
      
      if (getSex().equals("Male") || getSex().equals("male")) {
         maleWizard();
      } else {
         femaleWizard();
      }

   }

   public void maleWizard() {
      System.out.println("You awaken in a medic tent, with the sounds of roars and clashing steel in the \nbackground. " + 
      " You sit up and see the most beautiful nurse of your life tending to your leg. " +
      " \nYou gasp in awe and shock at her beauty, with her breast overfilling her shirt and her bum cheeks sticking out of the bottom of her silk skirt.");

      for(int x = 0; x < 4; ++x) {
         System.out.println("***************");

         try {
            Thread.sleep(500L);
         } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
         }
      }
     
   }

   public void femaleWizard() {
      System.out.println("You awaken in a medic tent, with the sounds of roars and \nclashing steel in the background. " + 
      "You sit up and see the most scalpted nurse of your life tending to your leg. " + 
      " You gasp in awe and shock at his sexiness, with his package \noverfilling his pants and his muscles bursting through the seams of his silk shirt.");

      for(int x = 0; x < 4; ++x) {
         System.out.println("***************");

         try {
            Thread.sleep(500L);
         } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
         }
      }
      
   }
}
