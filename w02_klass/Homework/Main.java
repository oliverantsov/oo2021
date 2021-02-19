public class Main {
    public static void main(String[] args) {
        cars();
    }

    public static void cars(){
        Car car1 = new Car();
        car1.companyName = "Ford";
        car1.modelName = "Mondeo ST";
        car1.modelYear = 2003;
        car1.fuel = "Petrol";
        car1.engineDisplacement = 3.0;
        car1.enginePower = 166;

        System.out.println("----------------------------------------------------------");
        System.out.println("FIRST CAR DATA:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Company:" + " " + car1.companyName);
        System.out.println("Model:" + " " + car1.modelName);
        System.out.println("Model year:" + " " + car1.modelYear);
        System.out.println("Fuel type:" + " " + car1.fuel);
        System.out.println("Engine displacement:" + " " + car1.engineDisplacement);
        System.out.println("Engine power (kW):" + " " + car1.enginePower);

        Car car2 = new Car();
        car2.companyName = "Volkswagen";
        car2.modelName = "Passat";
        car2.modelYear = 1998;
        car2.fuel = "Petrol";
        car2.engineDisplacement = 1.8;
        car2.enginePower = 92;

        System.out.println("----------------------------------------------------------");
        System.out.println("SECOND CAR DATA:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Company:" + " " + car2.companyName);
        System.out.println("Model:" + " " + car2.modelName);
        System.out.println("Model year:" + " " + car2.modelYear);
        System.out.println("Fuel type:" + " " + car2.fuel);
        System.out.println("Engine displacement:" + " " + car2.engineDisplacement);
        System.out.println("Engine power (kW):" + " " + car2.enginePower);
    }
}
