import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EdadExacta {
  private static final String PATRON = "dd/MM/yyyy";

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Ingresa una fecha de nacimiento para saber la edad exacta, el formato debe ser " + PATRON);
      String fechaLeida = s.nextLine();
      try {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATRON);
        LocalDate fecha = LocalDate.parse(fechaLeida, dtf);
        LocalDate ahora = LocalDate.now();
        Period edad = Period.between(fecha, ahora);
        System.out.println(String.format(
            "La edad es: %d años, %d meses, %d dias",
            edad.getYears(), edad.getMonths(), edad.getDays()));
        if (edad.getMonths() == 0 && edad.getDays() == 0) {
          System.out.println("Feliz cum");
        }
      } catch (DateTimeParseException e) {
        System.err.println(
            String.format("La fecha indicada ('%s') " + "no sigue el patron esperado ('%s')", fechaLeida, PATRON));
      }
    }
  }
}
