import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];

        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter random integer! ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Squared array numbers that are ODD: ");
        //System.out.println(Arrays.toString(myArray));
        IntStream.of(myArray)
            .map(e -> e * e)
            .filter(e -> e % 2 != 0)
            .forEach(e -> System.out.print(" - " + e + " - "));

        scanner.close();
    }
}
