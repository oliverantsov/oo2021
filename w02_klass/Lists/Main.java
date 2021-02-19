import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        arraylist();
        System.out.println("----------------------------------------------------------");
        linkedlist();
        System.out.println("----------------------------------------------------------");
        hashset();
        System.out.println("----------------------------------------------------------");
    }

    public static void arraylist(){
        String[] stringArray = new String[5];
        int[] numberArray = new int[5];

        ArrayList<String> stringList = new ArrayList<>();

        numberArray[0] = 5;

        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        for(String entry : stringList){
            System.out.println(entry);
        }
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