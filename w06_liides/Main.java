public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("50004110267");
        FinnishID fin = new FinnishID("110400A003K");
        //FinnishID fin = new FinnishID("241299-003K");
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("ESTONIAN ID:");
        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getMonth());
        System.out.println(est.getDay());

        System.out.println("FINNISH ID:");
        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getMonth());
        System.out.println(fin.getDay());

        System.out.println("DOG INTERFACE:");
        System.out.println(dog.speak());
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.beSneaky());
        System.out.println(dog.lookAround());
        System.out.println(dog.attack());
        System.out.println(dog.defend());

        System.out.println("CAT INTERFACE:");
        System.out.println(cat.speak());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.beSneaky());
        System.out.println(cat.lookAround());
        System.out.println(cat.attack());
        System.out.println(cat.defend());
    }
}
