package model.heroes.dc;

import model.heroes.Superhero;

public class Superman implements Superhero {
    @Override
    public String getSuperPower() {
        return "Puedo volar y tener superfuerza!";
    }
}