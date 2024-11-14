public class Pajaro extends Mascotas{
    String raza;
    int tamañoPico;

    public Pajaro() {
    }

    public String getRaza() {
        return raza;
    }

    public int getTamañoPico() {
        return tamañoPico;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamañoPico(int tamañoPico) {
        this.tamañoPico = tamañoPico;
    }

    public void mostrarPajaro() {
        System.out.println("Raza: " + raza);
        System.out.println("Tamaño del pico: "+ tamañoPico);
    }
}
