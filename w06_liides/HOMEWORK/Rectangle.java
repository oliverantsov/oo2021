public class Rectangle implements Calculations {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
	}

    @Override
    public String GetPerimeter() {
        double perimeter = 2 * (a + b);
        return "Ristküliku ümbermõõt on: " + perimeter;
    }

    @Override
    public String GetArea() {
        double fullArea = a * b;
        return "Ristküliku pindala on: " + fullArea;
    }
}
