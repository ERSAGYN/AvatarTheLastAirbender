package org.example.bendings.adapter;

import org.example.bendings.IBending;
import org.example.characters.ICharacter;

public class FireAdapter implements IBending {
    ICharacter character;
    String bending;

    public FireAdapter(ICharacter character, String bending) {
        this.character = character;
        this.bending = bending;
    }

    @Override
    public double getBendingPower() {
        double power;
        switch (bending) {
            case "water":
                power = character.getBendingPower("water") * 1.5;
                break;
            case "air":
                power = character.getBendingPower("air") / 1.5;
                break;
            case "earth":
                power = character.getBendingPower("earth") * 1.5;
                break;
            default: return character.getBendingPower("fire");
        }
        return power;
    }

    @Override
    public void setBendingPower(double bendingPower) {

    }

    @Override
    public String getBendingName() {
        return null;
    }
}
