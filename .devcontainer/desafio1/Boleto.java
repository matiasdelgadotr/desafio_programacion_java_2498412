import java.util.ArrayList;

public class Boleto {
  private int cantidadNumeros = 5;
  private int valorLimite = 50;
  private ArrayList<Integer> numerosDelBoleto;

  public Boleto() {
    this.numerosDelBoleto = new ArrayList<>(this.cantidadNumeros);
  }

  public Boleto(int cantidadNumeros, int valorLimite) {
    this.cantidadNumeros = cantidadNumeros;
    this.valorLimite = valorLimite;
    this.numerosDelBoleto = new ArrayList<>(this.cantidadNumeros);
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

  public String toString() {
    return "Boleto{" +
        "cantidadNumeros=" + cantidadNumeros +
        ", valorLimite=" + valorLimite +
        ", numerosDelBoleto=" + numerosDelBoleto +
        '}';
  }
}
