public class Hamster extends Mascotas{
    String raza;
    boolean nocturno;

    //solo hija

    public Hamster(String raza, boolean nocturno) {
        this.raza = raza;
        this.nocturno = nocturno;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isNocturno() {
        return nocturno;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNocturno(boolean nocturno) {
        this.nocturno = nocturno;
    }

    public void mostrarHamster() {
        System.out.println("Raza: " + raza);
        System.out.println("Nocturno: " + nocturno);
    }
}
