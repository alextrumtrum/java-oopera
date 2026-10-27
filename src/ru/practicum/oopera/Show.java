package ru.practicum.oopera;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this(title, duration, director);
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.print("Actors: ");
        for (Actor actor : listOfActors) {
            System.out.print(actor + " ");
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Error! Invalid actor");
            return;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Error " + actor + " is already present");
            return;
        }

        listOfActors.add(actor);
    }

    public void swapActor(Actor newActor, String oldActorSurname) {
        if (oldActorSurname == null || oldActorSurname.isBlank() || newActor == null) {
            System.out.println("Error! Invalid actor");
            return;
        }

        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldActorSurname)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Error " + oldActorSurname + " is not present");
            return;
        }

        if (listOfActors.contains(newActor)) {
            System.out.println("Error " + newActor + " is already present");
            return;
        }

        listOfActors.set(index, newActor);
    }
}
