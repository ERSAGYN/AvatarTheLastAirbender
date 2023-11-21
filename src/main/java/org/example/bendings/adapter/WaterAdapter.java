package org.example.bendings.adapter;

import org.example.bendings.IBending;
import org.example.characters.ICharacter;

public class WaterAdapter implements IBending {
    ICharacter character;
    String bending;
    public WaterAdapter(ICharacter character,String bending){
        this.character = character;
        this.bending = bending;
    }
    @Override
    public double getBendingPower() {
        double power;
        switch (bending) {
            case "fire":
                power = character.getBendingPower("fire") / 1.5;
                break;
            case "air":
                power = character.getBendingPower("air") / 1.5;
                break;
            case "earth":
                power = character.getBendingPower("earth") * 1.5;
                break;
            default: return character.getBendingPower("water");
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
