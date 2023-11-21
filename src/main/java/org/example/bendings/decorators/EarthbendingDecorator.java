package org.example.bendings.decorators;

import org.example.bendings.Earthbending;
import org.example.characters.ICharacter;

public class EarthbendingDecorator extends BendingDecorator{

    public EarthbendingDecorator(ICharacter character) {
        super(character, new Earthbending());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" an earthbender");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("earthquake")) character.setBendingPower("earth", character.getBendingPower("earth") + 17);
    }
}
