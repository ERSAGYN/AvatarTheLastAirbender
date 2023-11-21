package org.example.bendings.decorators;

import org.example.bendings.IBending;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.events.ICharacterObserver;

public abstract class BendingDecorator extends Character {
    ICharacter character;
    IBending bending;

    public BendingDecorator(ICharacter character, IBending bending) {
        this.character = character;
        this.bending = bending;
        character.addBending(bending);
    }


    @Override
    public double getBendingPower(String bendingName) {
        double power = character.getBendingPower(bendingName);
        if (power == 0 && bending.getBendingName().equals(bendingName)) {
            return bending.getBendingPower();
        }
        return power;
    }

    @Override
    public void setName(String name) {
        character.setName(name);
    }

    @Override
    public String getName() {
        return character.getName();
    }

    @Override
    public void setBendingPower(String bendingName, double power) {
        character.setBendingPower(bendingName, power);
        if (bending.getBendingName().equals(bendingName)) {
            bending.setBendingPower(power);
        }
    }

    @Override
    public boolean hasBending(String bendingName) {
        return character.hasBending(bendingName) || bending.getBendingName().equals(bendingName);
    }

    @Override
    public void teach(ICharacter character, String bendingName) {
        this.character.teach(character, bendingName);
    }

    @Override
    public boolean isTeacher() {
        return character.isTeacher();
    }

    @Override
    public void addBending(IBending bending) {
        character.addBending(bending);
    }

    @Override
    public boolean isEnemy() {
        return character.isEnemy();
    }

    @Override
    public boolean attack(ICharacter character) {
        return this.character.attack(character);
    }

    @Override
    public void introduce() {
        character.introduce();
    }
}
