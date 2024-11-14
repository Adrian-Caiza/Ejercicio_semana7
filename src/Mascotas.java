public class Mascotas {
    String nombre;
    int edad;

    public Mascotas() {
    }

    public Mascotas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarMascotas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
