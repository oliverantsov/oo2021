public class Cat implements AnimalBehaviour {

    @Override
    public String speak() {
        return "Cat says MEOW MEOW";
    }

    @Override
    public String eat() {
        return "Cat likes treats";
    }

    @Override
    public String sleep() {
        return "Cat sleeps on the bed";
    }

    @Override
    public String beSneaky() {
        return "Cat sneaks carefully";
    }

    @Override
    public String lookAround() {
        return "Cat looks around";
    }

    @Override
    public String attack() {
        return "Cat growls and ATTACKS!";
    }

    @Override
    public String defend() {
        return "Cat defends the room";
    }

}
