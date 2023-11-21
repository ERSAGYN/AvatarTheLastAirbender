package org.example.bendings.decorators;

import org.example.characters.ICharacter;

public class DecoratorFactory {
    BendingDecorator decorator;
    ICharacter character;

    public DecoratorFactory(BendingDecorator decorator, ICharacter character) {
        this.decorator = decorator;
        this.character = character;
    }

    public static BendingDecorator createDecorator(String bendingName, ICharacter character) {
        switch (bendingName) {
            case "fire":
                return new FirebendingDecorator(character);
            case "water":
                return new WaterbendingDecorator(character);
            case "air":
                return new AirbendingDecorator(character);
            case "earth":
                return new EarthbendingDecorator(character);
            default: return null;
        }
    }
}
