import java.util.Scanner;

public class SoldadoEjercito {
    private String nombre;
    protected int edad;
    protected String rango;
    protected double salario = 1000000;
    public static int cantidadSoldados;

    public SoldadoEjercito() {
        pedirDatos();
        cantidadSoldados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre del soldado: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingresa su edad: ");
        this.edad = sc.nextInt();

    }
    public static void menuSoldados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué soldado quiere ingresar?");
        System.out.println("1. Cabo");
        System.out.println("2. Sargento");
        System.out.println("3. Subteniente");
        System.out.println("4. Teniente");
        System.out.println("5. Mayor");
        System.out.println("6. General");

    }
}
