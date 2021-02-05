public class First {
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{ "Hello", "world", "!" }; // algväärtustamisega

        String name = "Oliver";
        
        // primitiivtüübid
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE; 
        byte myByte = Byte.MAX_VALUE; // -128 to 127
        short myShort = Short.MAX_VALUE;
        double myDouble = 3.4;
        float myFloat = 3.4f;
        boolean flag = true; // false
        char character = 'F'; 
        
        // for tsükkel (algus; kaua; mis juhtub iga korraga)
        for (int i = 0; i < greetingsArray.length; i++){ // args.length
            System.out.println(greetingsArray[i]); // args[i]
        }
        
        // for-each tsükkel
        for (String text : greetingsArray){ // : args
            System.out.println(text);
        }

        // while tsükkel
        int length = greetingsArray.length; // args.length
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }
        
        int year = 2021;

        if (year == 2021){
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal to or larger than 2021");
        }
        
        // console.log, echo
        String hello = "Hello world!";
        System.out.println(hello);
        System.out.println("Test one");
        System.out.println("Test two");
    }
}

// function main(args){ }

// ALT+SHIFT+A (multi-comment out)

// javac First.java
// java First
// java First 1 2 3 4 5 6 7