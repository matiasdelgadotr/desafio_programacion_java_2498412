import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormateadorFecha {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Indique el formato de fecha: ");
      String patron = s.nextLine();
      try {
        SimpleDateFormat sdf = new SimpleDateFormat(patron);
        String ahora = sdf.format(new Date());
        System.out.println("La fecha actual es: " + ahora);
      } catch (IllegalArgumentException iae) {
        System.err.println(String.format("El patron indicado '%s' no es valido", patron));
      }
    }
  }
}
