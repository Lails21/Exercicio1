public class Triangle extends Figures {

    public double b;
    public double h;

    public double area() {
        return (b * h) / 2;
    }

    public Triangle(double h, double b) {
        this.b = b;
        this.h = h;

    }
}
