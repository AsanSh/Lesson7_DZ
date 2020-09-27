package com.company;

public class Warrior extends Hero {


    @Override
    public void methodReal() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior использовал меч Артура";
    }
}

