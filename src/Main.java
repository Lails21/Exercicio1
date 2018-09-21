public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        double base = 10;
        double altura = 3;
        double radio = 5;
        double lado = 2;

        Rectangulo r = new Rectangulo(base, altura);
        Circulo c = new Circulo(radio);
        Triangle t = new Triangle (base, altura);
        Cuadrado q = new Cuadrado(lado);
        Figures[] fs = new Figures[4];
        fs[0] = r;
        fs[1] = c;
        fs [2] = t;
        fs [3] = q;
        double suma;
        suma = FiguresGeometriques.Suma(fs);
        System.out.println(suma);
    }
}
