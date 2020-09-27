package com.company;

public class Magic extends Hero {

    @Override
    public void methodReal() {
        System.out.println("Маг применил суперспособность ИСЧЕЗАТЬ");
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Маг использовал глас САУРОНА";
    }
}

