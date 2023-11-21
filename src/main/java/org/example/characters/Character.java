package org.example.characters;

import org.example.bendings.IBending;
import org.example.events.Event;
import org.example.events.ICharacterObserver;

import java.util.ArrayList;

public class Character implements ICharacter, ICharacterObserver {
    String name;

    public ArrayList<IBending> bendings = new ArrayList<IBending>();

    public Character() {
        Event.addObserver(this);
    }

    @Override
    public void setBendingPower(String bendingName, double power) {
        if(!hasBending(bendingName)) System.out.println(name + " doesn't have " + bendingName + " bending");
        for (IBending bending : bendings) {
            if (bending.getBendingName().equals(bendingName)) {
                bending.setBendingPower(power);
            }
        }
    }

    @Override
    public double getBendingPower(String bendingName) {
        for (IBending b: bendings) {
            if(b.getBendingName().equals(bendingName)) {
                return b.getBendingPower();
            }
        }
        return 0;
    }

    @Override
    public boolean hasBending(String bending) {
        for (IBending b: bendings) {
            if(b.getBendingName().equals(bending)) return true;
        }
        return false;
    }

    public void introduce() {
        System.out.print("Hello! I am");
    }

    public String getName() {
        return name;
    }

    @Override
    public void addBending(IBending bending) {
        bendings.add(bending);
    }

    @Override
    public boolean isTeacher() {
        return false;
    }

    @Override
    public void teach(ICharacter character, String bendingName) {
        System.out.print(name + " is not a teacher");
    }

    @Override
    public boolean isEnemy() {
        return false;
    }

    @Override
    public boolean attack(ICharacter character) {
        System.out.print(name + " is not an enemy");
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onEvent(String eventName) {

    }
}
