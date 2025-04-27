
public class Displayer {
  public static void main(String[] args) {
    GeneradorBoleto generador = new GeneradorBoleto();
    Boleto boletoGenerado = generador.getBoleto();
    generador.mostrarBoleto();
    System.out.println(boletoGenerado.toString());
  }
}
