package oo.movie;

import java.util.Arrays;

public class Film {
    private int anAparitie;
    private String name;
    private Actor[] actori;

    public Film(int anAparitie, String name, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actori = actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparitie=" + anAparitie +
                ", name='" + name + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }

    public int getAnAparitie() {
        return anAparitie;
    }

}
