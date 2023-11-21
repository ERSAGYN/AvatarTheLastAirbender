package org.example;

import org.example.bendings.adapter.FireAdapter;
import org.example.bendings.adapter.WaterAdapter;
import org.example.bendings.decorators.FirebendingDecorator;
import org.example.bendings.decorators.WaterbendingDecorator;
import org.example.characters.Character;
import org.example.characters.ICharacter;
import org.example.characters.characterFactory.CharacterFactory;

public class Main {
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

        ICharacter zuko = new Character();
        zuko = new FirebendingDecorator(zuko);
        zuko.setName("Zuko");
        zuko.setBendingPower("fire", 100);

        ICharacter katara = new Character();
        katara = new WaterbendingDecorator(katara);
        katara.setName("Katara");
        katara.setBendingPower("water", 100);

        System.out.println(katara.getBendingPower("water") + " in water " + new WaterAdapter(zuko, "fire").getBendingPower() + " in water");
    }
}