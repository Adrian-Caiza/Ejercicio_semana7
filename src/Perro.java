public class Perro extends Mascotas{
    String raza;
    boolean entrenado;

    //sin parametros
    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }

    public void mostrarPerro(){
        System.out.println("Raza: "+raza);
        System.out.println("Entrenado: "+entrenado);
    }
}
