import java.util.ArrayList;
import java.util.Random;

public class ComprobadorSimple {

  private ArrayList<Integer> nrosGanadores;

  public ComprobadorSimple() {
    Random random = new Random();
    nrosGanadores = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      nrosGanadores.add(random.nextInt(99) + 1);
    }
  }

  public void comprobarBoletoSimple(Boleto boleto) {
    int cantCoincidencias = 0;
    System.out.println("Comprobando boleto");
    System.out.println("Los nros del boleto son: ");
    for (Integer nro : boleto.getNumerosDelBoleto()) {
      System.out.println(nro);
    }
    System.out.println("Los nros ganadores del sorteo son: ");
    for (Integer nroGanador : nrosGanadores) {
      System.out.println(nroGanador);
    }
    System.out.println("Verificacion de coincidencias");
    for (Integer nro : boleto.getNumerosDelBoleto()) {
      if (nrosGanadores.contains(nro)) {
        System.out.println("El nro " + nro + " coincide.");
        cantCoincidencias++;
      }
    }
    System.out.println("La cantidad total de coincidencias del boleto es: " + cantCoincidencias);
  }
}
