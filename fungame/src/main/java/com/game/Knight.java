package com.game;


public class Knight implements GameInterface {
  

   private String characterName;
   private int health;
   private int armor;
   private int mana;
   private int rage;
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

   public Knight(String characterName, int health, int armor, int mana, int rage,
         String gearSlotOne, String gearSlotTwo, String gearSlotThree, 
         String gearSlotFour, int money, String weapon, String year,
         String horse, String petCreature, int levels, String spells,
         int meleeAttack, String sex) {
            this.characterName = characterName;
            this.health = health;
            this.armor = armor;
            this.mana = mana;
            this.rage = rage;
            this.gearSlotOne = gearSlotOne;
            this.gearSlotTwo = gearSlotTwo;
            this.gearSlotThree = gearSlotThree;
            this.gearSlotFour = gearSlotFour;
            this.money = money;
            this.weapon = weapon;
            this.year = year;
            this.horse = horse;
            this.petCreature = petCreature;
            this.levels = levels;
            this.spells = spells;
            this.meleeAttack = meleeAttack;
            this.sex = sex;
      
   }

   public String getCharacterName() {
      return this.characterName;
   }

   public int getHealth() {
      return this.health;
   }

   public int getArmor() {
      return this.armor;
   }

   public int getMana() {
      return this.mana;
   }

   public int getRage() {
      return this.rage;
   }

   public String getGearSlotOne() {
      return this.gearSlotOne;
   }

   public String getGearSlotTwo() {
      return this.gearSlotTwo;
   }

   public String getGearSlotThree() {
      return this.gearSlotThree;
   }

   public String getGearSlotFour() {
      return this.gearSlotFour;
   }

   public int getMoney() {
      return this.money;
   }

   public String getWeapon() {
      return this.weapon;
   }

   public String getYear() {
      return this.year;
   }

   public String getHorse() {
      return this.horse;
   }

   public String getPetCreature() {
      return this.petCreature;
   }

   public int getLevels() {
      return this.levels;
   }

   public String getSpells() {
      return this.spells;
   }

   public int getMeleeAttack() {
      return this.meleeAttack;
   }

   public String getSex() {
      return this.sex;
   }

}
