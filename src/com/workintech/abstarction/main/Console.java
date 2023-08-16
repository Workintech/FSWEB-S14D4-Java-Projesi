package com.workintech.abstarction.main;

import com.workintech.abstarction.rpg.Basilisk;
import com.workintech.abstarction.rpg.Griffin;
import com.workintech.abstarction.rpg.Monster;

public class Console {

    public static void main(String[] args) {
        Monster basilisk = new Basilisk("Serpent of Slytherin", 500, 60);
        System.out.println(basilisk.attack());

        Monster griffin = new Griffin("Buckbeak", 350, 40);
        System.out.println(griffin.attack());
    }
}
