package org.example.characters.strategies;

import org.example.bendings.adapter.EarthAdapter;
import org.example.bendings.adapter.FireAdapter;
import org.example.characters.ICharacter;

public class EarthStrategy implements IAttackStrategy{
    ICharacter character;

    public EarthStrategy(ICharacter character) {
        this.character = character;
    }


    @Override
    public boolean attack(ICharacter character) {
        if(character.getBendingPower("earth") > this.character.getBendingPower("earth")) return false;
        if(new EarthAdapter(character, "water").getBendingPower() > this.character.getBendingPower("earth")) return false;
        if(new EarthAdapter(character, "air").getBendingPower() > this.character.getBendingPower("earth")) return false;
        if(new EarthAdapter(character, "fire").getBendingPower() > this.character.getBendingPower("earth")) return false;
        return true;
    }
}
