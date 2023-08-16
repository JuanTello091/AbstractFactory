package model.heroes.marvel;

import model.heroes.Villain;

public class Thanos implements Villain {
    @Override
    public String getEvilPlan() {
        return "Quiero reunir las gemas del infinito y remodelar el universo!";
    }
}