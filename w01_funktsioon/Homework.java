import java.util.Scanner; // importin Scanner classi input-lausete kasutamiseks

public class Homework {
    public static void main(String[] args) {
        currencyConversion();
    }

    public static void currencyConversion(){
        System.out.println("--------------------------------------------------");
        System.out.println("CURRENCY CONVERTER FUNCTION");
        System.out.println("--------------------------------------------------");

        System.out.print("Enter amount to convert: ");
        Scanner inputCurrency = new Scanner(System.in); // küsin kasutajalt soovitud "algsumma" inputi Scanneri abil
        Double amountToConvert = inputCurrency.nextDouble(); // convertin "algsumma" input-lausesse sisestatud arvu double-tüübiks

        System.out.print("Enter desired currency conversion rate: ");
        Scanner inputRate = new Scanner(System.in); // küsin kasutajalt soovitud lõppvaluuta kursi inputi Scanneri abil
        Double convertedRate = inputRate.nextDouble(); // convertin lõppvaluuta kursi input-lausesse sisestatud arvu double-tüübiks

        Double endCurrencyAmount = amountToConvert * convertedRate; // teen convertimise tehte (sisestatud "algsumma" kogus * sisestatud lõppvaluuta kurss)
        System.out.println("--------------------------------------------------");
        System.out.println("Converted final amount of money: " + endCurrencyAmount);
        System.out.println("--------------------------------------------------");
    }
}