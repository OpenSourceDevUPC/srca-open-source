import java.util.Scanner;

public class Main {
  // Metodo
  public static void saludar(String nombre){
    System.out.println("Hola " + nombre + ", genial tenerte aqui!");
  }
  //POO
  //Clases
  static class Mascota{
    //atributos
    String nombre;
    int edad;
    //constructor
    Mascota(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;
    }
    //metodo
    void presentar(){
      System.out.println("Tu mascota se llama " + nombre + " y tiene " + edad + " años.");
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe tu nombre: ");
    String nombreUsuario = sc.nextLine();
    saludar(nombreUsuario);
    // Crear un objeto Mascota (POO)
    System.out.print("\n¿Cómo se llamará tu mascota?: ");
    String nombreMascota = sc.nextLine();

    System.out.print("¿Cuántos años tiene tu mascota?: ");
    int edadMascota = sc.nextInt();
    sc.nextLine();

    //Instanciar
    Mascota m = new Mascota(nombreMascota, edadMascota);

    System.out.println("¡Mascota creada exitosamente!");
    m.presentar();
  }
}
