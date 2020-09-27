package com.company;


public class Medic extends Hero {


    @Override
    public void methodReal() {
        System.out.println("Medic применил суперспособность И раздал жинь на халяву всем");
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic использовал ЖИВУЮ ВОДУ";
    }
}
