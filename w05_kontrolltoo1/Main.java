import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        divisionMethod1();
        primeNumberMethod2();
        createPrimeArrayMethod3();
    }
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
    public static void divisionMethod1() {
        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("                         TASK 1");
        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter random whole number: ");
        Scanner scannerInput = new Scanner(System.in);
        int inputNumber = scannerInput.nextInt();

        if(inputNumber % 2 == 0){
            System.out.println("---------------------------------------------------------");
            System.out.println("Entered number divides with 2.");
        }
        if(inputNumber % 3 == 0){
            System.out.println("---------------------------------------------------------");
            System.out.println("Entered number divides with 3.");
        }
        if(inputNumber % 5 == 0){
            System.out.println("---------------------------------------------------------");
            System.out.println("Entered number divides with 5.");
        }
        if(inputNumber % 7 == 0){
            System.out.println("---------------------------------------------------------");
            System.out.println("Entered number divides with 7.");
        }
        if((inputNumber % 2 != 0) && (inputNumber % 3 != 0) && (inputNumber % 5 != 0) && (inputNumber % 7 != 0)){
            System.out.println("---------------------------------------------------------");
            System.out.println("Entered number doesn't divide with either 2, 3, 5 or 7.");
        }
    }
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
    public static void primeNumberMethod2() {
        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("                         TASK 2");
        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter random whole number: ");
        Scanner scannerInput = new Scanner(System.in);
        int inputNumber = scannerInput.nextInt();

        for(int x = 2; x <= (inputNumber / 2); x++){
            if(x >= (inputNumber / 2)){
                System.out.println("---------------------------------------------------------");
                System.out.println("Entered number IS a prime number.");
            }
            if(inputNumber % x == 0){
                System.out.println("---------------------------------------------------------");
                System.out.println("Entered number IS NOT a prime number.");
                break;
            }
        }
        scannerInput.close();
    }
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
    public static boolean isNumberPrime(int randomNumber){
        for (int y = 2; y <= (randomNumber/2); y++){
            if (randomNumber % y == 0){
                return false; 
            }
        }
        return true;
    }
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------
    public static void createPrimeArrayMethod3() {
        int arrayCount = 0;
        int number = 2;
        int[] primeArray;
        primeArray = new int[1000];

        while(arrayCount < 1000) {
            if(isNumberPrime(number)){
                primeArray[arrayCount] = number;
                arrayCount++;
            }
            number++;
        }

        // PRINT OUT WHOLE ARRAY TO 1000TH PRIME NUMBER:
        
        /*for (int i = 0; i < primeArray.length; i++){
            System.out.print(primeArray[i] + " ");
        }*/

        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("                         TASK 3");
        System.out.println("---------------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------");
        System.out.println("10 highest-valued prime numbers before 1000th squared prime number:");
        System.out.println("---------------------------------------------------------");
        int counter = 0;
        int lastNumberInArray = primeArray[999];
        int lastNumberInSquare = lastNumberInArray * lastNumberInArray;

        for(int a = lastNumberInSquare; counter < 10; a--){
            for(int b = 0; b <= 999; b++){
                if(a % primeArray[b] == 0){
                    break;
                }
                if(b == 999){
                    counter++;
                    System.out.println(a);
                    System.out.println("---------");
                }
            }
        }
    }

    
}