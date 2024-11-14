public class Gato extends Mascotas{
    String raza;
    String ronroneo;

    //padre e hija

    public Gato(String raza, String ronroneo) {
        this.raza = raza;
        this.ronroneo = ronroneo;
    }

    public Gato(String nombre, int edad, String raza, String ronroneo) {
        super(nombre, edad);
        this.raza = raza;
        this.ronroneo = ronroneo;
    }

    public String getRaza() {
        return raza;
    }

    public String getRonroneo() {
        return ronroneo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setRonroneo(String ronroneo) {
        this.ronroneo = ronroneo;
    }

    public void mostrarGato(){
        System.out.println("Raza: " + raza);
        System.out.println("Ronroneo: " + ronroneo);
    }
}
