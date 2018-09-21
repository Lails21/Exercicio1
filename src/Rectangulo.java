public class Rectangulo extends Figures {

    public double b;
    public double h;

    public double area() {
        return b*h;
    }

    public Rectangulo (double h, double b) {
        this.b = b;
        this.h = h;
    }

}
