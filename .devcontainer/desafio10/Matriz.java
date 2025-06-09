public class Matriz {

  private int[][] matriz;

  public Matriz(int filas, int columnas) {
    this.matriz = new int[filas][columnas];
    rellenar(this.matriz);
  }

  public int[][] getMatriz() {
    return this.matriz;
  }

  private void rellenar(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = i * i + j;
      }
    }
  }

  public void mostrar() {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Falta algun argumento");
    }
    int filas = Integer.valueOf(args[0]);
    int columnas = Integer.valueOf(args[1]);
    Matriz matriz = new Matriz(filas, columnas);
    System.out.println("aca esta la matriz: ");
    matriz.mostrar();
  }
}
