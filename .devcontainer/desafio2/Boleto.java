import java.util.ArrayList;

public class Boleto {

  private int cantidadNumeros = 6;
  private int valorLimite = 49;
  private int numeroReintegro;

  private ArrayList<Integer> numerosDelBoleto;

  public Boleto() {
    this.numerosDelBoleto = new ArrayList<>(this.cantidadNumeros);
    this.numeroReintegro = (int) (Math.random() * 10) + 1;
  }

  public Boleto(int cantidadNumeros, int valorLimite) {
    this.cantidadNumeros = cantidadNumeros;
    this.valorLimite = valorLimite;
    this.numerosDelBoleto = new ArrayList<>(this.cantidadNumeros);
    this.numeroReintegro = (int) (Math.random() * 10) + 1;
  }

  public int getCantidadNumeros() {
    return cantidadNumeros;
  }

  public int getValorLimite() {
    return valorLimite;
  }

  public ArrayList<Integer> getNumerosDelBoleto() {
    return numerosDelBoleto;
  }

  public int getNumeroReintegro() {
    return numeroReintegro;
  }

  public String toString() {
    return "Boleto{" +
        "cantidadNumeros=" + cantidadNumeros +
        ", valorLimite=" + valorLimite +
        ", numerosDelBoleto=" + numerosDelBoleto +
        ", numeroReintegro=" + numeroReintegro +
        '}';
  }
}
