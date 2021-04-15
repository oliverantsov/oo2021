public abstract class Parent {
    public String name;
    public String dream;
    //mõelge kolmas välja
    public String country;

    public Parent(String name, String dream, String country){
        this.name = name;
        this.dream = dream;
        this.country = country;
    }

    public void favoriteHobbyIs(String hobby){
        System.out.println(this.country + "'s " + this.name + " favorite hobby is " + hobby + ".");
    }

    public void firstThingIDo(){
        System.out.println("First thing I do in the morning: brush my teeth.");
    }

    public abstract void howISpendMyEvenings();

    public void myFavoriteFoodsAre(){
        System.out.println("I like pizza, lasagna, meatballs and steaks.");
    }
}