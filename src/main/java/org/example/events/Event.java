package org.example.events;

import java.util.ArrayList;

public class Event {
    private static ArrayList<ICharacterObserver> observers = new ArrayList<>();

    public static void addObserver(ICharacterObserver observer) {
        observers.add(observer);
    }

    public static void removeObserver(ICharacterObserver observer) {
        observers.remove(observer);
    }

    public static void makeEvent(String eventName) {
        for(ICharacterObserver observer: observers) {
            observer.onEvent(eventName);
        }
    }
}
