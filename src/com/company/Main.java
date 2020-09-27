package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {

        HavingSuperAbility[] superAbilitiesOfHero = {new Warrior(), new Magic(), new Medic()};
        for (int i = 0; i < superAbilitiesOfHero.length; i++) {
            superAbilitiesOfHero[i].methodReal();
        }
    }
}


