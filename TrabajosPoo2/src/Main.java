import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    int opcionSoldados;
    int contador = 0;
    Object [] arregloSoldados;
    String c = "nombre";

    do {

    menu();
    opcion = sc.nextInt();

    if (opcion == 1){
        SoldadoEjercito.menuSoldados();
        contador++;
        arregloSoldados = new Object [contador];
        opcionSoldados = sc.nextInt();

        switch (opcionSoldados){
            case 1:
                arregloSoldados[contador-1] = new Cabo();
                System.out.println(arregloSoldados[0]);

                break;
            case 2:
                arregloSoldados[contador-1] = new Sargento();
                System.out.println(arregloSoldados[0]);

                break;
            case 3:
                arregloSoldados[contador-1] = new Subteniente();
                System.out.println(arregloSoldados[0]);

                break;
            case 4:
                arregloSoldados[contador-1] = new Teniente();
                System.out.println(arregloSoldados[0]);

                break;
            case 5:
                arregloSoldados[contador-1] = new Mayor();
                System.out.println(arregloSoldados[0]);

                break;
            case 6:
                arregloSoldados[contador-1] = new General();
                System.out.println(arregloSoldados[0]);
                break;
        }
    }else if(opcion == 2){

    }else{
       continue;
    }

    }while (opcion != 3);

        System.out.println(SoldadoEjercito.cantidadSoldados);

    }

    public static void menu(){
        System.out.println("1. Ingresar soldado nuevo");
        System.out.println("2. Eliminar soldado");
        System.out.println("3. Salir");
        System.out.println("-------------------------------------");
    }

}
