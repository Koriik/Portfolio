package com.game;


public interface InterfaceKnightBuilder {
    InterfaceKnightBuilder setCharacterName(String characterName);
    InterfaceKnightBuilder setHealth(int health);
    InterfaceKnightBuilder setArmor(int armor);
    InterfaceKnightBuilder setMana(int mana);
    InterfaceKnightBuilder setRage(int rage);
    InterfaceKnightBuilder setGearSlotOne(String gearSlotOne);
    InterfaceKnightBuilder setGearSlotTwo(String gearSlotTwo);
    InterfaceKnightBuilder setGearSlotThree(String gearSlotThree);
    InterfaceKnightBuilder setGearSlotFour(String gearSlotFour);
    InterfaceKnightBuilder setMoney(int money);
    InterfaceKnightBuilder setWeapon(String weapon);
    InterfaceKnightBuilder setYear(String year);
    InterfaceKnightBuilder setHorse(String horse);
    InterfaceKnightBuilder setPetCreature(String petCreature);
    InterfaceKnightBuilder setLevels(int levels);
    InterfaceKnightBuilder setSpells(String spells);
    InterfaceKnightBuilder setMeleeAttack(int meleeAttack);
    InterfaceKnightBuilder setSex(String sex);
    InterfaceKnight build();
}