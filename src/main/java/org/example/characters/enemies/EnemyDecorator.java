package org.example.characters.enemies;

import org.example.bendings.IBending;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.characters.strategies.IAttackStrategy;

public class EnemyDecorator extends Character {

    ICharacter character;

    public EnemyDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public void addBending(IBending bending) {
        character.addBending(bending);
    }

    @Override
    public boolean isTeacher() {
        return false;
    }

    @Override
    public void teach(ICharacter character, String bendingName) {
        System.out.println(this.character + " is not a teacher!");
    }

    @Override
    public boolean isEnemy() {
        return true;
    }

    @Override
    public void setStrategy(IAttackStrategy strategy) {
        //if()
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
    }

    @Override
    public double getBendingPower(String bendingName) {
        return character.getBendingPower(bendingName);
    }

    @Override
    public boolean hasBending(String bendingName) {
        return character.hasBending(bendingName);
    }

    @Override
    public void introduce() {
        character.introduce();
        System.out.print(" enemy");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("Ersa")) character.setBendingPower("air", character.getBendingPower("air") + 10);
    }
}
