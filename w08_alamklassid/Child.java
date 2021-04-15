public class Child extends Parent {

    public Child(String name, String dream, String country) {
        super(name, dream, country);
    }
    
    @Override
    public void firstThingIDo() {
        super.firstThingIDo();
        System.out.println("I get up to mischief.");
    }

    @Override
    public void howISpendMyEvenings() {
        System.out.println("I run around.");
    }

    @Override
    public void myFavoriteFoodsAre() {
        super.myFavoriteFoodsAre();
        System.out.println("BUT, I also like sweet stuff such as Oreo cookies and apple pies!");
    }
}
