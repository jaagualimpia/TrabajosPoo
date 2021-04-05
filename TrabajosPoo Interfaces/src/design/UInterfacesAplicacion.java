package design;

public class UInterfacesAplicacion {


    public static void menuInterfazPrincipal(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Bienvenido  al banco");
        System.out.println("Ingresa la interfaz desde la cual te estas conectando");
        System.out.println("1. Interfaz Cajero ");
        System.out.println("2. Interfaz Movil");
        System.out.println("3. Interfaz Web");
        System.out.println("4. Salir");
    }

    public static void opcionesCajero(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Interfaz Cajero");
        System.out.println("1. Depositar");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Retirar efectivo");
        System.out.println("4. Salir");
    }

    public static void opcionesTelefono(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Interfaz telefono");
        System.out.println("1. (Marque 1) Recargar minutos");
        System.out.println("2. (Marque 2) Salir");
    }

    public static void opcionesWeb(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Interfaz pagina web");
        System.out.println("1. Consultar estado de la cuenta");
        System.out.println("2. realizar transferencia");
        System.out.println("3. Solicitar credito");
        System.out.println("4. Salir");
    }
}
