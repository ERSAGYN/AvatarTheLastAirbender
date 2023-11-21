package org.example.characters.characterFactory;

import org.example.bendings.decorators.AirbendingDecorator;
import org.example.bendings.decorators.EarthbendingDecorator;
import org.example.bendings.decorators.FirebendingDecorator;
import org.example.bendings.decorators.WaterbendingDecorator;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.characters.enemies.EnemyDecorator;
import org.example.characters.teachers.TeacherDecorator;

public class CharacterFactory {
    public static ICharacter createCharacter(String name, String bendingAbility, String role, int power) {
        ICharacter character = new Character();
        character.setName(name);
        switch (bendingAbility.toLowerCase()) {
            case "water":
                character = new WaterbendingDecorator(character);
                break;
            case "earth":
                character = new EarthbendingDecorator(character);
                break;
            case "fire":
                character = new FirebendingDecorator(character);
                break;
            case "air":
                character = new AirbendingDecorator(character);
                break;
            default:
                return null;
        }
        switch (role.toLowerCase()) {
            case "teacher":
                character = new TeacherDecorator(character, power);
                break;
            case "enemy":
                character = new EnemyDecorator(character);
                character.setBendingPower(bendingAbility, power);
                break;
            default:
                return null;
        }
        return character;
    }
}
