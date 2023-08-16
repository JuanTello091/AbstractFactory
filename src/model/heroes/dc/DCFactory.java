package model.heroes.dc;

import model.heroes.SuperheroFactory;
import model.heroes.Superhero;
import model.heroes.Villain;

public class DCFactory implements SuperheroFactory {
    @Override
    public Superhero createHero() {
        return new Superman();
    }

    @Override
    public Villain createVillain() {
        return new Joker();
    }
}
