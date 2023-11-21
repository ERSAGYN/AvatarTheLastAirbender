package org.example.characters.strategies;

import org.example.bendings.adapter.FireAdapter;
import org.example.bendings.adapter.WaterAdapter;
import org.example.characters.ICharacter;

public class WaterStrategy implements IAttackStrategy{
    ICharacter character;

    public WaterStrategy(ICharacter character) {
        this.character = character;
    }

    @Override
    public boolean attack(ICharacter character) {
        if(character.getBendingPower("water") > this.character.getBendingPower("water")) return false;
        if(new WaterAdapter(character, "fire").getBendingPower() > this.character.getBendingPower("water")) return false;
        if(new WaterAdapter(character, "earth").getBendingPower() > this.character.getBendingPower("water")) return false;
        if(new WaterAdapter(character, "air").getBendingPower() > this.character.getBendingPower("water")) return false;
        return true;
    }
}
