public class Triangle implements Calculations {
    public int a;
    public int b;
    public int c;

	public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
	}

    @Override
    public String GetPerimeter() {
        double perimeter = a + b + c;
        return "Kolmnurga ümbermõõt on: " + perimeter;
    }

    @Override
    public String GetArea() {
        double halfArea = (a + b + c)/2;
        double areaCalculation = halfArea * (halfArea - a) * (halfArea - b) * (halfArea - c);
        double fullArea = Math.sqrt(areaCalculation);
        return "Kolmnurga pindala on: " + fullArea;
    }
    
}
