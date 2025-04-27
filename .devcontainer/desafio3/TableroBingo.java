import java.util.ArrayList;

public class TableroBingo {

  private ArrayList<Grupo> numeros = new ArrayList<Grupo>();

  public TableroBingo() {
    numeros.add(Grupo.B);
    numeros.add(Grupo.I);
    numeros.add(Grupo.N);
    numeros.add(Grupo.G);
    numeros.add(Grupo.O);
  }

  public ArrayList<Grupo> getNumeros() {
    return numeros;
  }
}
