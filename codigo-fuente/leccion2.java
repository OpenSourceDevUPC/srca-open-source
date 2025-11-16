public class Main {
  public static void main(String[] args) {
    // enteros
    int edad = 15;
    int año = 2025;
    // decimales
    double altura = 1.75;
    // texto
    String nombre = "Juan";
    String apellido = "Perez";
    // booleanos
    boolean meGustaLaMusica = true; // Verdadero
    boolean meGustaBailar = false; // Falso

    // concatenar texto
    System.out.println("Hola: " + nombre + " " + apellido);

    // Sumar
    System.out.println("La suma de 5 + 3 es: " + (5 + 3));
    int edadProximoAño = edad + 1;
    System.out.println("La edad del usuario el proximo año sera: " + edadProximoAño);

    // Restar
    System.out.println("La resta de 5 - 3 es: " + (5 - 3));
    System.out.println("La resta de 2.55 - 1.22 es: " + (2.55 - 1.22));
    double precioMaiz = 100.50;
    double precioArroz = 50.25;
    System.out.println("La diferencia de precio entre el maiz y el arroz es: " + (precioMaiz - precioArroz));

    // Multiplicar
    System.out.println("La multiplicacion de 5 * 3 es: " + (5 * 3));
    System.out.println("La multiplicacion de 2.55 * 1.22 es: " + (2.55 * 1.22));
    int cantidadDeManzanas = 5;
    double precioPorManzana = 1.50;
    System.out.println("El precio total de las manzanas es: " + (cantidadDeManzanas * precioPorManzana));

    // Dividir
    System.out.println("La division de 5 / 3 es: " + (5 / 3));
    int cantidadDeManzanas2 = 15;
    double cantidadDePersonas = 7.00;
    System.out.println("La cantidad de manzanas por persona es: " + (cantidadDeManzanas2 / cantidadDePersonas));

    // Modulo
    System.out.println("El modulo de 5 % 3 es: " + (5 % 3));

    // Operadores de comparacion
    System.out.println("5 == 3: " + (5 == 3)); //Igual
    System.out.println("5 != 3: " + (5 != 3)); //No es igual
  }
}