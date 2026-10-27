package ru.practicum.oopera;

import java.util.List;

public class MusicalShow extends Show {

    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
        MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director,
        MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
