import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        currencyConversion();
    }

    public static void currencyConversion(){
        System.out.println("EUR -> DOLLAR CONVERTING FUNCTION");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter EUR: ");
        Double amountToConvert = myObj.nextDouble();
        Double endDollarAmount = (Double) amountToConvert * 1.204;
        System.out.print("Money converted to DOLLARS: " + endDollarAmount);
    }
}