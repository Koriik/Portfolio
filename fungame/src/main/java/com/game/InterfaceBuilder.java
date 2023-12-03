package com.game;


public interface InterfaceBuilder {
    InterfaceBuilder setCharacterName(String characterName);
    InterfaceBuilder setHealth(int health);
    InterfaceBuilder setArmor(int armor);
    InterfaceBuilder setMana(int mana);
    InterfaceBuilder setRage(int rage);
    InterfaceBuilder setGearSlotOne(String gearSlotOne);
    InterfaceBuilder setGearSlotTwo(String gearSlotTwo);
    InterfaceBuilder setGearSlotThree(String gearSlotThree);
    InterfaceBuilder setGearSlotFour(String gearSlotFour);
    InterfaceBuilder setMoney(int money);
    InterfaceBuilder setWeapon(String weapon);
    InterfaceBuilder setYear(String year);
    InterfaceBuilder setHorse(String horse);
    InterfaceBuilder setPetCreature(String petCreature);
    InterfaceBuilder setLevels(int levels);
    InterfaceBuilder setSpells(String spells);
    InterfaceBuilder setMeleeAttack(int meleeAttack);
    InterfaceBuilder setSex(String sex);
    GameInterface build();
}