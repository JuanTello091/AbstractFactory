package model.heroes.dc;

import model.heroes.Villain;

public class Joker implements Villain {
    @Override
    public String getEvilPlan() {
        return "Quiero crear caos y anarquia en Gotham City!";
    }
}