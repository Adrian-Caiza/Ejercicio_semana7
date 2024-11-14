public class Tortuga extends Mascotas {
    String raza;
    int velocidad;

    //solo padre
    public Tortuga() {
    }

    public Tortuga(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getRaza() {
        return raza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void mostrarTortuga() {
        System.out.println("Raza: " +raza);
        System.out.println("Velocidad: " +velocidad);
    }
}
