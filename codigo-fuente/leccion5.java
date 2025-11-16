public class Leccion_cinco {
    public static void main(String[] args) {
        Mascota mascota_uno = new Mascota();
        Mascota mascota_dos = new Mascota("Pepita", 3, "Erizo");
        System.out.println("=======Mascota uno=======\n");
        mascota_uno.mostrarDatos();
        System.out.println("=======Mascota dos=======\n");
        mascota_dos.mostrarDatos();
    }
}

class Mascota {
    //Atributos de la clase Mascota
    private String nombre;
    private int edad;
    private String tipo;

    //Metodos de la clase Mascota

    //Constructor
    public Mascota() {
        this.nombre = "Pepe";
        this.edad = 2;
        this.tipo = "Perro";
    }

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    private void mostrarNombre() {
        System.out.println("Nombre:" + nombre + "\n");
    }

    private void mostrarEdad() {
        System.out.println("Edad:" + edad + "\n");
    }

    private void mostrarTipo() {
        System.out.println("Tipo:" + tipo + "\n");
    }

    public void mostrarDatos() {
        mostrarNombre();
        mostrarEdad();
        mostrarTipo();
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public void setTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }
}