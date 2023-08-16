package model.heroes.marvel;

import model.heroes.SuperheroFactory;
import model.heroes.Superhero;
import model.heroes.Villain;

public class MarvelFactory implements SuperheroFactory {
    @Override
    public Superhero createHero() {
        return new IronMan();
    }

    @Override
    public Villain createVillain() {
        return new Thanos();
    }
}