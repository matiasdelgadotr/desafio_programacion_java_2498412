import java.util.ArrayList;

public class ContadorLetras {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Falta algun argumento");
    }
    String palabra = args[0].toLowerCase();
    ArrayList<Character> letrasVerificadas = new ArrayList<>();

    for (int i = 0; i < palabra.length(); i++) {
      char letra = palabra.charAt(i);
      Integer contador = 0;
      if (!letrasVerificadas.contains(letra)) {
        letrasVerificadas.add(letra);
        for (int j = i; j < palabra.length(); j++) {
          if (palabra.charAt(j) == letra) {
            contador++;
          }
        }
        System.out.println("La cantidad de veces de la letra " + letra + " es: " + contador.toString());
      }
    }
  }
}
