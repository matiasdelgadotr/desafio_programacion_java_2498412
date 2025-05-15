
public class Displayer {
  public static void main(String[] args) {
    GeneradorBoletoSimple generador = new GeneradorBoletoSimple();
    Boleto boletoGenerado = generador.getBoleto();
    ComprobadorSimple comprobador = new ComprobadorSimple();
    comprobador.comprobarBoletoSimple(boletoGenerado);
  }
}
