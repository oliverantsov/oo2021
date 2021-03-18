public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(8, 10, 12);
        Rectangle rectangle1 = new Rectangle(4, 5);
        Square square1 = new Square(8);

        System.out.println("------------------------------------------");
        System.out.println("KOLMNURK:");
        System.out.println(" ");
        System.out.println(triangle1.GetPerimeter());
        System.out.println(triangle1.GetArea());
        System.out.println("------------------------------------------");
        System.out.println("RISTKÜLIK:");
        System.out.println(" ");
        System.out.println(rectangle1.GetPerimeter());
        System.out.println(rectangle1.GetArea());
        System.out.println("------------------------------------------");
        System.out.println("RUUT:");
        System.out.println(" ");
        System.out.println(square1.GetPerimeter());
        System.out.println(square1.GetArea());
        System.out.println("------------------------------------------");
    }
}