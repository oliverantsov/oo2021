public class Square implements Calculations {
    public int a;

    public Square(int a) {
        this.a = a;
	}

    @Override
    public String GetPerimeter() {
        double perimeter = 4 * a;
        return "Ruudu ümbermõõt on: " + perimeter;
    }

    @Override
    public String GetArea() {
        double fullArea = a * a;
        return "Ruudu pindala on: " + fullArea;
    }
    
}
