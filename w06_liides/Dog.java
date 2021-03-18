public class Dog implements AnimalBehaviour {

    @Override
    public String speak() {
        return "Dog says WOOF WOOF";
    }

    @Override
    public String eat() {
        return "Dog likes bones";
    }

    @Override
    public String sleep() {
        return "Dog sleeps on the sofa";
    }

    @Override
    public String beSneaky() {
        return "Dog walks silently";
    }

    @Override
    public String lookAround() {
        return "Dog barks and looks around";
    }

    @Override
    public String attack() {
        return "Dog is angry and ATTACKS!";
    }

    @Override
    public String defend() {
        return "Dog defends the owner";
    }
    
}
