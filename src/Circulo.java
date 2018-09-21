public class Circulo extends Figures {

    public double radi;
    public double area() {
        return (radi*radi)*3.14;
    }

    public Circulo (double radi) {
        this.radi = radi;
    }


}
