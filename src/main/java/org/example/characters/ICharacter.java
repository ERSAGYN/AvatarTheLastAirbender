package org.example.characters;

import org.example.bendings.IBending;
import org.example.characters.strategies.IAttackStrategy;

public interface ICharacter {
    void addBending(IBending bending);
    boolean isTeacher();
    void teach(ICharacter character, String bendingName);

    boolean isEnemy();
    void setStrategy(IAttackStrategy strategy);
    boolean attack(ICharacter character);
    void setName(String name);
    String getName();
    void setBendingPower(String bendingName, double power);
    double getBendingPower(String bendingName);
    boolean hasBending(String bendingName);
    void introduce();
}
