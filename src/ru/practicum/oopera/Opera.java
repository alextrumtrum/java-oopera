package ru.practicum.oopera;

import java.util.List;

public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors, MusicAuthor musicAuthor,
        String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText,
        int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
