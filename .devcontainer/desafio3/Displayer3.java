import java.util.ArrayList;

public class Displayer3 {
  public static void main(String[] args) {
    TableroBingo tablero = new TableroBingo();
    ArrayList<Grupo> numerosDelTablero = tablero.getNumeros();
    System.out.println("Bienvenido al juego de Bingo!");
    System.out.println("Los números del tablero son: ");

    for (Grupo grupo : numerosDelTablero) {
      System.out.println(grupo.getNumeros());
    }
  }
}
