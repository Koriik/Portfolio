package com.game;


public class Wizard implements GameInterface {
  

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

   public Wizard(String characterName, int health, int armor, int mana, int rage,
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

   /** 
    * @return String
    */
    public String getCharacterName() {
      return this.characterName;
   }

   
   /** 
    * @return int
    */
   public int getHealth() {
      return this.health;
   }

   
   /** 
    * @return int
    */
   public int getArmor() {
      return this.armor;
   }

   
   /** 
    * @return int
    */
   public int getMana() {
      return this.mana;
   }

   
   /** 
    * @return int
    */
   public int getRage() {
      return this.rage;
   }

   
   /** 
    * @return String
    */
   public String getGearSlotOne() {
      return this.gearSlotOne;
   }

   
   /** 
    * @return String
    */
   public String getGearSlotTwo() {
      return this.gearSlotTwo;
   }

   
   /** 
    * @return String
    */
   public String getGearSlotThree() {
      return this.gearSlotThree;
   }

   
   /** 
    * @return String
    */
   public String getGearSlotFour() {
      return this.gearSlotFour;
   }

   
   /** 
    * @return int
    */
   public int getMoney() {
      return this.money;
   }

   
   /** 
    * @return String
    */
   public String getWeapon() {
      return this.weapon;
   }

   
   /** 
    * @return String
    */
   public String getYear() {
      return this.year;
   }


   /** 
    * @return String
    */
   public String getHorse() {
      return this.horse;
   }


   /** 
    * @return String
    */
   public String getPetCreature() {
      return this.petCreature;
   }


   /** 
    * @return int
    */
   public int getLevels() {
      return this.levels;
   }


   /** 
    * @return String
    */
   public String getSpells() {
      return this.spells;
   }


   /** 
    * @return int
    */
   public int getMeleeAttack() {
      return this.meleeAttack;
   }


   /** 
    * @return String
    */
   public String getSex() {
      return this.sex;
   }

   public void setHealth(int newHealth) {
      this.health = newHealth;
   }

}
