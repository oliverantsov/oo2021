public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        System.out.println("-----------------------------------------------------");
        System.out.println(word.interfaceMethod());
        System.out.println("-----------------------------------------------------");
        
        Sentence sentence = new Sentence();
        System.out.println(sentence.interfaceMethod());
        System.out.println("-----------------------------------------------------");
        //System.out.println(sentence.fileStuff());
    }
}
