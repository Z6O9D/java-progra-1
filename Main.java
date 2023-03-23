import java.util.*;

public class Main {
    public static void main(String[] args) {
      Televisor tv1 = new Televisor();
      Televisor tv2 = new Televisor();
      
      tv1.prender();
     
      tv1.bajarVolumen();
      tv1.bajarVolumen();
      
      for(int i=0; i<101; i++)
         tv1.subirVolumen();
         
      System.out.println("El volumen del tv es: " + tv1.getVolumen());
      
  }
}
