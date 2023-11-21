package org.example.characters;

import org.example.bendings.IBending;

public interface ICharacter {
    void addBending(IBending bending);
    boolean isTeacher();
    void teach(ICharacter character, String bendingName);

    boolean isEnemy();
    boolean attack(ICharacter character);
    void setName(String name);
    String getName();
    void setBendingPower(String bendingName, double power);
    double getBendingPower(String bendingName);
    boolean hasBending(String bendingName);
    void introduce();
}
