package oo.movie;

import java.util.Arrays;

public class Studio {
    private String nume;

    public Film[] getFilme() {
        return filme;
    }

    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }
}
