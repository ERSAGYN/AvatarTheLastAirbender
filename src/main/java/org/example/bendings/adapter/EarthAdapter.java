package org.example.bendings.adapter;

import org.example.bendings.IBending;
import org.example.characters.ICharacter;

public class EarthAdapter implements IBending {
    ICharacter character;
    String bending;

    public EarthAdapter(ICharacter character, String bending){
        this.character = character;
        this.bending = bending;
    }
    @Override
    public double getBendingPower() {
        double power;
        switch (bending) {
            case "water":
                power = character.getBendingPower("water") / 1.5;
                break;
            case "air":
                power = character.getBendingPower("air") * 1.5 ;
                break;
            case "fire":
                power = character.getBendingPower("fire") / 1.5;
                break;
            default: return character.getBendingPower("earth");
        }
        return power;
    }

    @Override
    public void setBendingPower(double bendingPower) {
        character.setBendingPower(bending, bendingPower);
    }

    @Override
    public String getBendingName() {
        return character.getName();
    }
}
