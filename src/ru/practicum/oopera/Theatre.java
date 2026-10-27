package ru.practicum.oopera;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Name1", "Surname1", Gender.MALE, 180);
        Actor actor2 = new Actor("Name2", "Surname2", Gender.MALE, 181);
        Actor actor3 = new Actor("Name3", "Surname3", Gender.MALE, 182);

        Director director1 = new Director("Name4", "Surname4", Gender.MALE, 2);
        Director director2 = new Director("Name5", "Surname5", Gender.MALE, 3);

        MusicAuthor musicAuthor = new MusicAuthor("Name6", "Surname6", Gender.MALE);
        Choreographer choreographer = new Choreographer("Name7", "Surname7", Gender.MALE);

        Show show = new Show("Title1", 60, director1);
        show.addActor(actor1);
        show.addActor(actor2);

        Opera opera = new Opera("Title2", 120, director2, musicAuthor, "LibrettoText1", 10);
        opera.addActor(actor2);
        opera.addActor(actor3);

        Ballet ballet = new Ballet("Title3", 180, director1, musicAuthor, "LibrettoText2", choreographer);
        ballet.addActor(actor3);
        ballet.addActor(actor1);

        printShows(show, opera, ballet);

        opera.swapActor(actor1, "Surname2");
        show.swapActor(actor3, "Surname1");

        printShows(show, opera, ballet);
        ballet.swapActor(actor2, "Noname");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }

    public static void printShows(Show show, Opera opera, Ballet ballet) {
        show.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();
    }
}
