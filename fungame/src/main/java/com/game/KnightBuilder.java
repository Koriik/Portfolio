package com.game;

public class KnightBuilder implements InterfaceBuilder {
    private static final int HEALTH = 100;
    private static final int ARMOR = 100;
    private static final int MANA = 50;
    private static final int RAGE = 0;
    private static final int MONEY = 50;
    private static final int LEVELS = 1;
    private static final int MELEE_ATTACK = 5;
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

    @Override
    public InterfaceBuilder setCharacterName(String characterName) {
        if (characterName == null || characterName.trim().isEmpty()) {
            throw new IllegalArgumentException("Character name cannot be null or empty");
        } else {
            System.out.println("Character successfully Initalized!");
        }
        this.characterName = characterName;
        return this;
    }
    @Override
    public InterfaceBuilder setHealth(int health) {
        if (health != HEALTH ) {
            throw new IllegalArgumentException("Health should be equal to 100");
        } else {
            System.out.println("Health successfully Initalized!");
        }
        this.health = health;
        return this;
    } 

    public InterfaceBuilder setArmor(int armor) {
        if (armor != ARMOR ) {
            throw new IllegalArgumentException("Armor should be equal to 100");
        } else {
            System.out.println("Armor successfully Initalized!");
        }
        this.armor = armor;
        return this;
    }

    public InterfaceBuilder setMana(int mana) {
        if (mana != MANA ) {
            throw new IllegalArgumentException("Mana should be equal to 50");
        } else {
            System.out.println("Mana successfully Initalized!");
        }
        this.mana = mana;
        return this;
    }

    public InterfaceBuilder setRage(int rage) {
        if (rage != RAGE ) {
            throw new IllegalArgumentException("Rage should be equal to 0");
        } else {
            System.out.println("Rage successfully Initalized!");
        }
        this.rage = rage;
        return this;
    }

    public InterfaceBuilder setGearSlotOne(String gearSlotOne) {
        if (gearSlotOne == null || gearSlotOne.trim().isEmpty() ) {
            throw new IllegalArgumentException("GearSlot1 cannot be null or empty");
        } else {
            System.out.println("GearSlot1 successfully Initalized!");
        }
        this.gearSlotOne = gearSlotOne;
        return this;
    }

    public InterfaceBuilder setGearSlotTwo(String gearSlotTwo) {
        if (gearSlotTwo == null || gearSlotTwo.trim().isEmpty() ) {
            throw new IllegalArgumentException("GearSlot2 cannot be null or empty");
        } else {
            System.out.println("GearSlot2 successfully Initalized!");
        }
        this.gearSlotTwo = gearSlotTwo;
        return this;
    }

    public InterfaceBuilder setGearSlotThree(String gearSlotThree) {
        if (gearSlotThree == null || gearSlotThree.trim().isEmpty() ) {
            throw new IllegalArgumentException("GearSlot3 cannot be null or empty");
        } else {
            System.out.println("GearSlot3 successfully Initalized!");
        }
        this.gearSlotThree = gearSlotThree;
        return this;
    }

    public InterfaceBuilder setGearSlotFour(String gearSlotFour) {
        if (gearSlotFour == null || gearSlotFour.trim().isEmpty()) {
            throw new IllegalArgumentException("GearSlot4 cannot be null or empty");
        } else {
            System.out.println("GearSlot4 successfully Initalized!");
        }
        this.gearSlotFour = gearSlotFour;
        return this;
    }

    public InterfaceBuilder setMoney(int money) {
        if (money != MONEY ) {
            throw new IllegalArgumentException("Money should be equal to 50");
        } else {
            System.out.println("Money successfully Initalized!");
        }
        this.money = money;
        return this;
    }

    public InterfaceBuilder setWeapon(String weapon) {
        if (weapon == null || weapon.trim().isEmpty()) {
            throw new IllegalArgumentException("Weapon cannot be null or empty");
        } else {
            System.out.println("Weapon successfully Initalized!");
        }
        this.weapon = weapon;
        return this;
    }

    public InterfaceBuilder setYear(String year) {
        if (year == null || year.trim().isEmpty() ) {
            throw new IllegalArgumentException("Year cannot be null or empty");
        } else {
            System.out.println("Year successfully Initalized!");
        }
        this.year = year;
        return this;
    }

    public InterfaceBuilder setHorse(String horse) {
        if ( horse == null || horse.trim().isEmpty() ) {
            throw new IllegalArgumentException("Horse cannot be null or empty");
        } else {
            System.out.println("Horse successfully Initalized!");
        }
        this.horse = horse;
        return this;
    }

    public InterfaceBuilder setPetCreature(String petCreature) {
        if (petCreature == null || petCreature.trim().isEmpty() ) {
            throw new IllegalArgumentException("Pet Creature cannot be null or empty");
        } else {
            System.out.println("Pet Creature successfully Initalized!");
        }
        this.petCreature = petCreature;
        return this;
    }

    public InterfaceBuilder setLevels(int levels) {
        if (levels != LEVELS ) {
            throw new IllegalArgumentException("Levels should be equal to 1");
        } else {
            System.out.println("Levels successfully Initalized!");
        }
        this.levels = levels;
        return this;
    }

    public InterfaceBuilder setSpells(String spells) {
        if (spells == null || spells.trim().isEmpty() ) {
            throw new IllegalArgumentException("Spells cannot be null or empty");
        } else {
            System.out.println("Spells successfully Initalized!");
        }
        this.spells = spells;
        return this;
    }

    public InterfaceBuilder setMeleeAttack(int meleeAttack) {
        if ( meleeAttack != MELEE_ATTACK ) {
            throw new IllegalArgumentException("Melee Attack should be equal to 5");
        } else {
            System.out.println("Melee Attack successfully Initalized!");
        }
        this.meleeAttack = meleeAttack;
        return this;
    }

    public InterfaceBuilder setSex(String sex) {
        if (sex == null || sex.trim().isEmpty() ) {
            throw new IllegalArgumentException("Sex cannot be null or empty");
        } else {
            System.out.println("Sex successfully Initalized!");
        }
        this.sex = sex;
        return this;
    }

    public GameInterface build() {
        return new Knight(characterName, health, armor, 
                mana, rage, gearSlotOne, gearSlotTwo, gearSlotThree, 
                gearSlotFour, money, weapon, year, horse, petCreature, 
                levels, spells, meleeAttack, sex);
    }
}
