import java.util.ArrayList;

public class GeneradorBoletoSimple {

  private Boleto boleto;

  public GeneradorBoletoSimple() {
    this.boleto = new Boleto();
  }

  public Boleto getBoleto() {
    for (int i = 0; i < this.boleto.getCantidadNumeros(); i++) {
      int numeroAleatorio = getNumeroAleatorio(1, this.boleto.getValorLimite());
      if (!this.boleto.getNumerosDelBoleto().contains(numeroAleatorio)) {
        this.boleto.getNumerosDelBoleto().add(numeroAleatorio);
      } else {
        i--; // Si el número ya existe, decrementa i para repetir la iteración
      }
    }
    return this.boleto;
  }

  private int getNumeroAleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  public void mostrarBoleto() {
    System.out.println("Los números del boleto son: " + this.boleto.getNumerosDelBoleto());
  }
}