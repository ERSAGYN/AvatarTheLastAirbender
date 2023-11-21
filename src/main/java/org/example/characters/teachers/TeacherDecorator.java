package org.example.characters.teachers;

import org.example.bendings.IBending;
import org.example.bendings.decorators.DecoratorFactory;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.characters.strategies.IAttackStrategy;

public class TeacherDecorator extends Character {

    ICharacter character;
    int teachingSkills;

    public TeacherDecorator(ICharacter character, int teachingSkills) {
        this.character = character;
        this.teachingSkills = teachingSkills;
    }


    @Override
    public double getBendingPower(String bendingName) {
        return teachingSkills;
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
    public boolean hasBending(String bendingName) {
        return character.hasBending(bendingName);
    }

    @Override
    public void introduce() {
        character.introduce();
        System.out.println(" a teacher");
    }

    @Override
    public void teach(ICharacter character, String bendingName) {
        if(hasBending(bendingName)) {
            if(character.hasBending(bendingName)) character.setBendingPower(bendingName, character.getBendingPower(bendingName) + teachingSkills);
            else character = DecoratorFactory.createDecorator(bendingName,character);
        }
        else System.out.println(this.character.getName() + " teacher doesn't have " + bendingName + " bending");
    }

    @Override
    public boolean isEnemy() {
        return false;
    }

    @Override
    public void setStrategy(IAttackStrategy strategy) {

    }

    @Override
    public void addBending(IBending bending) {
        character.addBending(bending);
    }

    @Override
    public boolean isTeacher() {
        return true;
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("Ersa")) character.setBendingPower("air", character.getBendingPower("air") + 10);
    }
}
