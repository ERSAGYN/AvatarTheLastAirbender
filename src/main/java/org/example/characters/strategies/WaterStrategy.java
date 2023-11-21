package org.example.characters.strategies;

import org.example.bendings.adapter.FireAdapter;
import org.example.characters.ICharacter;

public class WaterStrategy implements IAttackStrategy{
    ICharacter character;

    public WaterStrategy(ICharacter character) {
        this.character = character;
    }

    @Override
    public boolean attack(ICharacter character) {
        if(character.getBendingPower("water") > this.character.getBendingPower("water")) return false;
        if(new FireAdapter(character, "fire").getBendingPower() > this.character.getBendingPower("water")) return false;
        if(new FireAdapter(character, "earth").getBendingPower() > this.character.getBendingPower("water")) return false;
        if(new FireAdapter(character, "air").getBendingPower() > this.character.getBendingPower("water")) return false;
        return true;
    }
}
