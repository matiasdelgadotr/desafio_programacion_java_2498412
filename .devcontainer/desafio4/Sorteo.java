import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sorteo {

  private static final Random random = new Random();
  private ArrayList<Premio> bomboPremios = new ArrayList<Premio>();
  private HashMap<Premio, Integer> ganadorPremio = new HashMap<>();

  public Sorteo() {
    for (Premio premio : Premio.values()) {
      for (int j = 0; j < premio.getNumeroPremios(); j++) {
        this.bomboPremios.add(premio);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Sorteo");
    Sorteo sorteo = new Sorteo();
    sorteo.realizarSorteo();
    System.out.println("los premios son:");
    for (Map.Entry<Premio, Integer> entrada : sorteo.getGanadorPremio().entrySet()) {
      Integer premio = entrada.getKey().getValorPremio();
      Integer valor = entrada.getValue();

      System.out.println("El numero: " + valor + ", Gano: " + premio);
    }

  }

  public void realizarSorteo() {
    while (!bomboPremios.isEmpty()) {
      int premioAleatorio = random.nextInt(bomboPremios.size());
      Premio premio = bomboPremios.remove(premioAleatorio);
      int numeroGanador = random.nextInt(99999);
      ganadorPremio.put(premio, numeroGanador);
    }
  }

  public void ordenarPorNumero() {
    // implement later
  }

  public void ordenarPorPremio() {
    // implement later
  }

  public HashMap<Premio, Integer> getGanadorPremio() {
    return ganadorPremio;
  }
}
