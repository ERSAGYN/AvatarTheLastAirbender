package org.example.bendings.decorators;

import org.example.bendings.Waterbending;
import org.example.characters.ICharacter;

public class WaterbendingDecorator extends BendingDecorator{

    public WaterbendingDecorator(ICharacter character) {
        super(character, new Waterbending());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" a waterbender");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("Ersa")) character.setBendingPower("water", character.getBendingPower("water") + 10);
    }
}
