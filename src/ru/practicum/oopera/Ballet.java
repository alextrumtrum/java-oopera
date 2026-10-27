package ru.practicum.oopera;

import java.util.List;

public class Ballet extends MusicalShow {

    private Choreographer choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> listOfActors,
        MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText,
        Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
