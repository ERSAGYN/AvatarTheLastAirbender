package org.example.characters.strategies;

import org.example.bendings.adapter.AirAdapter;
import org.example.bendings.adapter.FireAdapter;
import org.example.characters.ICharacter;

public class AirStrategy implements IAttackStrategy{
    ICharacter character;

    public AirStrategy(ICharacter character) {
        this.character = character;
    }

    @Override
    public boolean attack(ICharacter character) {
        if(character.getBendingPower("air") > this.character.getBendingPower("air")) return false;
        if(new AirAdapter(character, "water").getBendingPower() > this.character.getBendingPower("air")) return false;
        if(new AirAdapter(character, "earth").getBendingPower() > this.character.getBendingPower("air")) return false;
        if(new AirAdapter(character, "fire").getBendingPower() > this.character.getBendingPower("air")) return false;
        return true;
    }
}
