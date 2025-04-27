
public class Displayer {
  public static void main(String[] args) {
    GeneradorBoletoSimple generador = new GeneradorBoletoSimple();
    Boleto boletoGenerado = generador.getBoleto();
    generador.mostrarBoleto();
    System.out.println(boletoGenerado.toString());
  }
}
