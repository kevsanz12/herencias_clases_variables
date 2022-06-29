public class Herencias_clases_Variables {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.laEdad = 25;
        cliente.elTelefono = 1744309853;
        cliente.nombre = "kevin";
        cliente.credito = 150.55;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.laEdad + " años y mi telefono es " + cliente.elTelefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.elTelefono = 1744309853;
        trabajador.laEdad = 20;
        trabajador.nombre = "paul";
        trabajador.salario = 1600;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.laEdad + " años y mi telefono es " + trabajador.elTelefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}
    class Persona {
        int laEdad;
        String nombre;
        int elTelefono;
    }
    class Cliente extends Persona{
        double credito;
    }

    class Trabajador extends Persona{
    double salario;
    }



