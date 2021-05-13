public class BadTryCatch {
    public static void main(String[] args) {
        try {
            int number = 2;
            System.out.println("This is try-catch 1.");
            System.out.println("Making illegal calculation...");
            int division = number / 0;
        } catch (ArithmeticException a) {
            System.out.println("ILLEGAL CALCULATION: " + a.getMessage());
            try {
                String array[] = new String[10];
                System.out.println("This is try-catch 2.");
                System.out.println("Trying to access index that doesn't exist...");
                System.out.println("Index 100 value from array is: " + array[100]);
            } catch (ArrayIndexOutOfBoundsException b) {
                System.out.println("INDEX DOESN'T EXIST: " + b.getMessage());
            }
        }
    }
}




