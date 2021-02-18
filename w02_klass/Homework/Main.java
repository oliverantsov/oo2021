public class Main {
    public static void main(String[] args) {
        cars();
    }

    public static void cars(){
        Car car1 = new Car();
        car1.company_name = "Ford";
        car1.model_name = "Mondeo ST";
        car1.model_year = 2003;
        car1.fuel = "Petrol";
        car1.engine_displacement = 3.0;
        car1.engine_power = 166;

        System.out.println("----------------------------------------------------------");
        System.out.println("FIRST CAR DATA:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Company:" + " " + car1.company_name);
        System.out.println("Model:" + " " + car1.model_name);
        System.out.println("Model year:" + " " + car1.model_year);
        System.out.println("Fuel type:" + " " + car1.fuel);
        System.out.println("Engine displacement:" + " " + car1.engine_displacement);
        System.out.println("Engine power (kW):" + " " + car1.engine_power);

        Car car2 = new Car();
        car2.company_name = "Volkswagen";
        car2.model_name = "Passat";
        car2.model_year = 1998;
        car2.fuel = "Petrol";
        car2.engine_displacement = 1.8;
        car2.engine_power = 92;

        System.out.println("----------------------------------------------------------");
        System.out.println("SECOND CAR DATA:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Company:" + " " + car2.company_name);
        System.out.println("Model:" + " " + car2.model_name);
        System.out.println("Model year:" + " " + car2.model_year);
        System.out.println("Fuel type:" + " " + car2.fuel);
        System.out.println("Engine displacement:" + " " + car2.engine_displacement);
        System.out.println("Engine power (kW):" + " " + car2.engine_power);
    }
}
