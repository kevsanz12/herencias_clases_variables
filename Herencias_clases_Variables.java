public class Herencias_clases_Variables {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.laEdad = 25;
        cliente.elTelefono = 1744309853;
        cliente.nombre = "kevin";

        Trabajador trabajador = new Trabajador();
        trabajador.elTelefono =1744309853;
        trabajador.laEdad = 25;
        trabajador.nombre = "kevin";
    }
}
    class Persona {
        int laEdad;
        String nombre;
        int elTelefono;
    public Persona(){
        System.out.println("datos de las personas");
    }
    }
    class Cliente extends Persona{
        int credito;
    }

    class Trabajador extends Persona{
    int salario;
    }



