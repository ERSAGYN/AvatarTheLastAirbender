package org.example.bendings.decorators;

import org.example.bendings.Airbending;
import org.example.characters.ICharacter;
import org.example.events.ICharacterObserver;

public class AirbendingDecorator extends BendingDecorator {


    public AirbendingDecorator(ICharacter character) {
        super(character, new Airbending());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" an airbender");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("storm")) character.setBendingPower("air", character.getBendingPower("air") + 18);
    }
}
