package org.example;

import org.example.bendings.adapter.AirAdapter;
import org.example.bendings.adapter.EarthAdapter;
import org.example.bendings.adapter.FireAdapter;
import org.example.bendings.adapter.WaterAdapter;
import org.example.bendings.decorators.AirbendingDecorator;
import org.example.bendings.decorators.EarthbendingDecorator;
import org.example.bendings.decorators.FirebendingDecorator;
import org.example.bendings.decorators.WaterbendingDecorator;
import org.example.characters.Avatar;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.characters.characterFactory.CharacterFactory;
import org.example.characters.strategies.AirStrategy;
import org.example.characters.strategies.EarthStrategy;
import org.example.characters.strategies.FireStrategy;
import org.example.characters.strategies.WaterStrategy;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static ArrayList<ICharacter> enemies = new ArrayList<>();
    static ArrayList<ICharacter> defeatedEnemies = new ArrayList<>();
    static ArrayList<ICharacter> teachers = new ArrayList<>();
    static String redCode = "\u001B[31m";
    static String greenCode = "\u001B[32m";
    static String yellowCode = "\u001B[33m";
    static String blueCode = "\u001B[34m";
    static String magentaCode = "\u001B[35m";
    static String cyanCode = "\u001B[36m";
    static String crossedOutCode = "\u001B[9m";
    static String resetCode = "\u001B[0m";

    public static void main(String[] args) {

//        ICharacter a = new Character();
//        a = new EarthbendingDecorator(a);
//        a = new AirbendingDecorator(a);
//        ICharacter b = new Character();
//        b = new FirebendingDecorator(b);
//        b = new WaterbendingDecorator(b);
//        b = new AirbendingDecorator(b);
//        System.out.println(a.hasBending("earth"));
//        System.out.println(a.hasBending("air"));
//        a.introduce();
//        System.out.println(b.hasBending("earth"));
//        System.out.println(b.hasBending("air"));
//        System.out.println(b.hasBending("water"));
//        System.out.println(b.hasBending("fire"));
//        b.introduce();
//        b.setBendingPower("fire", 100);
//        System.out.println(b.getBendingPower("fire"));

//        ICharacter b = Avatar.getInstance();
//        b = new EarthbendingDecorator(b);
//        b.introduce();
//        a = new FirebendingDecorator(a);
//        ICharacter teacher = new TeacherDecorator(a,10);
//        b.setName("ERSA");
//        a.setName("TeacherA");
//        b = new FirebendingDecorator(b);
//        teacher.teach(b, "fire");
//        System.out.println(b.getBendingPower("air"));
//        System.out.println(b.getBendingPower("fire"));
//        System.out.println(teacher.isTeacher() + " " +b.isTeacher() + " " + a.isTeacher());
//        System.out.println(teacher.isEnemy() + " " +b.isEnemy() + " " + a.isEnemy());
//        System.out.println(b.getName());
//        ICharacter d = new Character();
//        d = new AirbendingDecorator(d);
//        d = new FirebendingDecorator(d);
//        d.setName("ERRE");
//        System.out.println(d.getBendingPower("air"));
//        Event.makeEvent("Ersa");
//        System.out.println(d.getBendingPower("air"));

//        ICharacter c = CharacterFactory.createCharacter("Azula", "fire", "enemy", 10);
//        System.out.println(c.hasBending("fire") + " " + c.hasBending("earth") + " " + c.isTeacher() + " " + c.isEnemy() + " " + c.getName());
//        FireBendingAdapter(c).getBendingPower("fire") > f.g;
//        c.getBendingPower("fire") > FirePowerAdapter(c, "water");

//        ICharacter zuko = new Character();
//        zuko = new FirebendingDecorator(zuko);
//        zuko.setName("Zuko");
//        zuko.setBendingPower("fire", 100);
//
//        ICharacter katara = new Character();
//        katara = new WaterbendingDecorator(katara);
//        katara.setName("Katara");
//        katara.setBendingPower("water", 100);
//
//        System.out.println(katara.getBendingPower("water") + " in water " + new WaterAdapter(zuko, "fire").getBendingPower() + " in water");
//
//        ICharacter avatar = Avatar.getInstance();
//        avatar = new EarthbendingDecorator(avatar);
//        avatar = new FirebendingDecorator(avatar);
//        avatar.setBendingPower("fire",149);
//        System.out.println(avatar.hasBending("fire") + " " + avatar.hasBending("earth") + " " + avatar.hasBending("water") + " " + avatar.hasBending("air"));
//        avatar.setStrategy(new FireStrategy(avatar));
//        System.out.println(avatar.attack(katara));


        ICharacter avatar = Avatar.getInstance();
        avatar.setName("Aang");
        avatar = new AirbendingDecorator(avatar);
        avatar.setBendingPower("air", 10);
        ICharacter ozai = CharacterFactory.createCharacter("Ozai", "fire", "enemy", 100);
        teachers.add(CharacterFactory.createCharacter("Katara", "water", "teacher", 10));
        teachers.add(CharacterFactory.createCharacter("Toph", "earth", "teacher", 10));
        teachers.add(CharacterFactory.createCharacter("Gyatso", "air", "teacher", 10));
        teachers.add(CharacterFactory.createCharacter("FriendlyZuko", "fire", "teacher", 10));
        enemies.add(CharacterFactory.createCharacter("UnfriendlyZuko", "fire", "enemy", 10));
        enemies.add(CharacterFactory.createCharacter("Long Feng", "earth", "enemy", 20));
        enemies.add(CharacterFactory.createCharacter("Hama", "water", "enemy", 30));
        enemies.add(CharacterFactory.createCharacter("Zhao", "fire", "enemy", 40));
        enemies.add(CharacterFactory.createCharacter("Azula", "fire", "enemy", 70));
        enemies.add(ozai);





        Scanner scanner = new Scanner(System.in);
        instructions();
        while(true) {
            if(defeatedEnemies.contains(ozai)) {
                System.out.println(cyanCode + "You successfully defeated all enemies and won the game!");
                return;
            }
            int temp;
            printOutCharacters();
            info(avatar);
            System.out.println(blueCode + "Choose action: \n1. Learn bending from teacher\n2. Fight enemy\n3. Instructions\n4. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Select teacher to learn from (by number): ");
                    printOutTeachers();
                    temp = scanner.nextInt();
                    ICharacter teacher = teachers.get(temp - 1);
                    teacher.teach(avatar, getBending(teacher));

                    break;
                case 2:
                    System.out.println(blueCode + "Choose bending strategy: \n1. Air\n2. Water\n3. Earth\n4. Fire");
                    switch (scanner.nextInt()) {
                        case 1:
                            avatar.setStrategy(new AirStrategy(avatar));
                            break;
                        case 2:
                            avatar.setStrategy(new WaterStrategy(avatar));
                            break;
                        case 3:
                            avatar.setStrategy(new EarthStrategy(avatar));
                            break;
                        case 4:
                            avatar.setStrategy(new FireStrategy(avatar));
                            break;
                        default: avatar.setStrategy(new AirStrategy(avatar));
                    }
                    ICharacter enemy = enemies.get(0);
                    if(avatar.attack(enemy)) {
                        System.out.println("You win!");
                        enemies.remove(0);
                        defeatedEnemies.add(enemy);
                    }
                    else System.out.println("You lose");
                    break;
                case 3:
                    instructions();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static String getBending(ICharacter character) {
        if(character.hasBending("fire")) return "fire";
        if(character.hasBending("water")) return "water";
        if(character.hasBending("air")) return "air";
        if(character.hasBending("earth")) return "earth";
        return "non-bender";
    }

    public static void info(ICharacter character) {
        System.out.println(magentaCode + "Character's bendings: ");
        if(character.hasBending("fire")) System.out.println("Fire: " + character.getBendingPower("fire") + "(which is equal to "
                + new WaterAdapter(character, "fire").getBendingPower() + " water, "
                + new EarthAdapter(character, "fire").getBendingPower() + " earth,"
                + new AirAdapter(character, "fire").getBendingPower() + " air"
                + ")");
        if(character.hasBending("water")) System.out.println("Water: " + character.getBendingPower("water") + "(which is equal to "
                + new FireAdapter(character, "water").getBendingPower() + " fire, "
                + new EarthAdapter(character, "water").getBendingPower() + " earth,"
                + new AirAdapter(character, "water").getBendingPower() + " air"
                + ")");
        if(character.hasBending("air")) System.out.println("Air: " + character.getBendingPower("air") + "(which is equal to "
                + new WaterAdapter(character, "air").getBendingPower() + " water, "
                + new EarthAdapter(character, "air").getBendingPower() + " earth,"
                + new FireAdapter(character, "air").getBendingPower() + " fire"
                + ")");
        if(character.hasBending("earth")) System.out.println("Earth: " + character.getBendingPower("earth") + "(which is equal to "
                + new WaterAdapter(character, "earth").getBendingPower() + " water, "
                + new FireAdapter(character, "earth").getBendingPower() + " fire,"
                + new AirAdapter(character, "earth").getBendingPower() + " air"
                + ")");
    }

    public static void printOutCharacters() {
        printOutTeachers();

        System.out.println(redCode + "Enemies: ");
        for(int i = 0; i < defeatedEnemies.size(); i++) {
            ICharacter c = defeatedEnemies.get(i);
            System.out.println(crossedOutCode + redCode + c.getName() + " " + c.getBendingPower(getBending(c)) + ", " + getBending(c) + resetCode);
        }
        for(int i = 0; i < enemies.size(); i++) {
            ICharacter c = enemies.get(i);
            System.out.println(redCode + (i + 1) + ". " + c.getName() + " " + c.getBendingPower(getBending(c)) + ", " + getBending(c));
        }
    }

    public static void printOutTeachers() {
        System.out.println(greenCode + "Teachers: ");
        for(int i = 0; i < teachers.size(); i++) {
            ICharacter c = teachers.get(i);
            System.out.println(greenCode + (i + 1) + ". " + c.getName() + " " + c.getBendingPower(""));
        }
    }

    public static void instructions() {
        System.out.println(yellowCode + "Welcome to the fighting simulator. In this game your main purpose is to defeat Ozai." +
                "\nBut to reach him you must defeat all the enemies on your way! " +
                "\nYour bending abilities may be weak, so you have to learn some skills from teachers." +
                "\nDon't forget to use right bending, your fire bending may be weak, but air bending could defeat the enemy." +
                "\nGood luck!");
    }
}