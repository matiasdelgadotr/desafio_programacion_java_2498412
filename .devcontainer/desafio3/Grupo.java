import java.util.ArrayList;

public enum Grupo {

  B(1, 15, 5),
  I(16, 30, 5),
  N(31, 45, 4),
  G(46, 60, 5),
  O(61, 75, 5);

  private ArrayList<Integer> numeros = new ArrayList<Integer>();
  private int numeroMinimo;
  private int numeroMaximo;
  private int cantidadNumeros;

  Grupo(int numeroMinimo, int numeroMaximo, int cantidadNumeros) {
    this.numeroMinimo = numeroMinimo;
    this.numeroMaximo = numeroMaximo;
    this.cantidadNumeros = cantidadNumeros;

    for (int i = 0; i < this.cantidadNumeros; i++) {
      int numeroAleatorio = getNumeroAleatorio(this.numeroMinimo, this.numeroMaximo);
      if (!this.numeros.contains(numeroAleatorio)) {
        this.numeros.add(numeroAleatorio);
      } else {
        i--; // Si el número ya existe, decrementa i para repetir la iteración
      }
    }
    this.numeros.sort(null); // Ordena los números de menor a mayor
  }

  private int getNumeroAleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  public ArrayList<Integer> getNumeros() {
    return this.numeros;
  }
}
