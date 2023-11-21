package org.example.characters.strategies;

import org.example.bendings.adapter.FireAdapter;
import org.example.characters.ICharacter;

public class FireStrategy implements IAttackStrategy{
    ICharacter character;

    public FireStrategy(ICharacter character) {
        this.character = character;
    }

    @Override
    public boolean attack(ICharacter character) {
        if(character.getBendingPower("fire") > this.character.getBendingPower("fire")) return false;
        if(new FireAdapter(character, "water").getBendingPower() > this.character.getBendingPower("fire")) return false;
        if(new FireAdapter(character, "earth").getBendingPower() > this.character.getBendingPower("fire")) return false;
        if(new FireAdapter(character, "air").getBendingPower() > this.character.getBendingPower("fire")) return false;
        return true;
    }
}
