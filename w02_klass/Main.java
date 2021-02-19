import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        lists();
    }

    public static void characters(){
        GameCharacter character1 = new GameCharacter("Juku", GameCharacterType.RANGER);

        System.out.println(
            character1.name + " " +
            character1.getSecret());

        character1.setSecret("My new secret");

        System.out.println(character1.getSecret());

        GameCharacter character2 = new GameCharacter("Kati", GameCharacterType.WARRIOR);

        System.out.println(character1);
        System.out.println(character2);

        System.out.println(character1.getXY()[0]);
    }

    public static void human(){
        Human human1 = new Human();
        System.out.println(human1.legs + " " + human1.name);

        human1.legs = 5;
        human1.name = "Juku";

        System.out.println(human1.legs + " " + human1.name);

        Human human2 = new Human("Kati");

        System.out.println(human2.name);
        human2.legs = 10;

        System.out.println(human1.legs + " " + human2.legs);
    }

    public static void lists(){
        String[] stringArray = new String[5];
        int[] numberArray = new int[5];

        ArrayList<String> stringList = new ArrayList<>();

        numberArray[0] = 5;

        stringList.add(0, "Hello");
        stringList.add("Yellow");
        stringList.add(1, "Orange");

        for(String entry : stringList){
            System.out.println(entry);
        }

        System.out.println(stringList.get(1));
    }

    public static void linkedlist(){
        System.out.println("Available colors in the store:");
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red" + " " + "(2x)");
        colors.add("Yellow" + " " + "(0x)");
        colors.add("Black" + " " + "(5x)");
        colors.add("White" + " " + "(7x)");
        colors.add("Blue" + " " + "(10x)");
        for (String i : colors){
            System.out.println(i);
        }
        System.out.println("There are" + " " + colors.size() + " " + "different color options in the store.");
    }

    public static void hashset(){
        System.out.println("First names which were represented in the event:");
        HashSet<String> attendees = new HashSet<String>();
        attendees.add("Oliver");
        attendees.add("Martin");
        attendees.add("Juku");
        attendees.add("Martin");
        attendees.add("Tom");
        attendees.add("Oliver");
        attendees.add("Oliver");
        attendees.add("Juss");
        attendees.add("Juku");
        for (String i : attendees){
            System.out.println(i);
        }
    }
    
}