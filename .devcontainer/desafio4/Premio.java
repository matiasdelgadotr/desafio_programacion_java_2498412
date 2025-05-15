enum Premio {
  PEDREA(5, 18),
  OCHO_QUINTOS(300, 8),
  DOS_CUARTOS(1000, 2),
  TERCERO(2500, 1),
  SEGUNDO(6250, 1),
  GORDO(20000, 1);

  private int valorPremio;
  private int numeroPremios;

  Premio(int valorPremio, int numeroPremios) {
    this.valorPremio = valorPremio;
    this.numeroPremios = numeroPremios;
  }

  public int getValorPremio() {
    return valorPremio;
  }

  public int getNumeroPremios() {
    return numeroPremios;
  }
}