public class Main {
    public static void main(String[] args) {
//------------------------------------------------------------------------------------------------------------------------------
// Preliminaries
        int counter = 0;
        String string = "mina olen oliver";
//------------------------------------------------------------------------------------------------------------------------------
// For-cycle to loop through the alphabet     
		for (char symbol = 'a'; symbol <= 'z'; symbol++) {
//------------------------------------------------------------------------------------------------------------------------------
// For-cycle to loop through the sentence
			for (int x = 0; x < string.length(); x++) {
//------------------------------------------------------------------------------------------------------------------------------
// If-sentence to update counter by 1 whenever character at the specified index equals to the specified letter in the alphabet
				if (string.charAt(x) == symbol) {
					counter++;
				}
            }
//------------------------------------------------------------------------------------------------------------------------------
// If-sentence to print out the letter if its counter is bigger than 0
			if (counter > 0) {
				System.out.println("Letter" + " " + symbol + ": " + counter);
				counter = 0;
			}
		}
    }
}