package model;

import java.util.Random;
import model.heroes.*;
import model.heroes.dc.DCFactory;
import model.heroes.marvel.MarvelFactory;

public class Launcher {

    public static void main(String[] args) {
        SuperheroFactory factory = null;

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

        if (i < 5) {
            factory = new DCFactory();
        } else {
            factory = new MarvelFactory();
        }

        Superhero superhero = factory.createHero();
        Villain villain = factory.createVillain();

        System.out.println(superhero.getSuperPower());
        System.out.println(villain.getEvilPlan());
    }
}