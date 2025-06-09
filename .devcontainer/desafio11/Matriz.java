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

  public int[][] sumar(Matriz m1, Matriz m2) {
    int filasM1 = m1.getMatriz().length;
    int filasM2 = m2.getMatriz().length;
    int columnasM1 = m1.getMatriz()[0].length;
    int columnasM2 = m2.getMatriz()[0].length;
    int[][] suma = new int[filasM1][columnasM1];
    if (filasM1 == filasM2 && columnasM1 == columnasM2) {
      for (int i = 0; i < filasM1; i++) {
        for (int j = 0; j < columnasM2; j++) {
          suma[i][j] = m1.getMatriz()[i][j] + m2.getMatriz()[i][j];
        }
      }
    }
    return suma;
  }

  public void mostrar(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j]);
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
    matriz.mostrar(matriz.getMatriz());
    int[][] suma = matriz.sumar(matriz, matriz);
    System.out.println("aca esta la suma: ");
    matriz.mostrar(suma);

  }
}
