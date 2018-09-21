import java.util.Arrays;

public class FiguresGeometriques {

    public static double Suma (Figures [] f) {
        double suma = 0;
        for (Figures l : f)
        {
            suma += l.area();
        }
        return suma;
    }

    public static void Sort (Figures [] f)
    {
        Arrays.sort(f);

    }
}
