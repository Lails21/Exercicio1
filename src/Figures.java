abstract public class Figures implements Comparable<Figures> {
   abstract public double area();

   @Override
   public int compareTo(Figures o) {
      return (int) (this.area()-o.area());
   }
}
