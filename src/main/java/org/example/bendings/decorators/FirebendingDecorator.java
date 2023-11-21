package org.example.bendings.decorators;

import org.example.bendings.Firebending;
import org.example.characters.ICharacter;
import org.example.events.ICharacterObserver;

public class FirebendingDecorator extends BendingDecorator {

    public FirebendingDecorator(ICharacter character) {
        super(character, new Firebending());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" a firebender");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("Ersa")) character.setBendingPower("fire", character.getBendingPower("fire") + 200);
    }
}
