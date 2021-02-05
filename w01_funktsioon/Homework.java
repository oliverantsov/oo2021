import java.util.Scanner; // importin Scanner classi

public class Homework {
    public static void main(String[] args) {
        currencyConversion();
    }

    public static void currencyConversion(){
        System.out.println("EUR -> DOLLAR CONVERTING FUNCTION");
        Scanner myObj = new Scanner(System.in); // küsin kasutaja inputi Scanneri abil
        System.out.print("Enter EUR: ");
        Double amountToConvert = myObj.nextDouble(); // convertin inputi sisestatud summa double-tüübiks
        Double endDollarAmount = (Double) amountToConvert * 1.204; // teen convertimise tehte (antud korrutise arvu võib ka muuta, vastavalt siis hetkese kursi hinnale)
        System.out.print("Money converted to DOLLARS: " + endDollarAmount);
    }
}