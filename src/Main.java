//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //sin parametros
        System.out.println("      Valores sin parametro     ");
        Perro perro1=new Perro();
        perro1.mostrarMascotas();
        perro1.mostrarPerro();

        //padre e hija
        System.out.println("  Valores solo con padre e hija     ");
        Gato gato1= new Gato("Silvestre", 4,"perza","agudo");
        gato1.mostrarMascotas();
        gato1.mostrarGato();

        //solo padre
        System.out.println("      Valores solo con padre     ");
        Tortuga tortuga1= new Tortuga("Rayo",10);
        tortuga1.mostrarMascotas();
        tortuga1.mostrarTortuga();

        //solo hija
        System.out.println("      Valores solo con hija     ");
        Hamster hamster1= new Hamster("britanico", true);
        hamster1.mostrarMascotas();
        hamster1.mostrarHamster();

        //sin parametros y seteo
        System.out.println("     Sin valores y seteo     ");
        Pajaro pajaro1= new Pajaro();
        pajaro1.setRaza("rapaz");
        pajaro1.setTamañoPico(2);
        pajaro1.setNombre("Silvestre");
        pajaro1.setEdad(2);
        pajaro1.mostrarMascotas();
        pajaro1.mostrarPajaro();

    }
}

