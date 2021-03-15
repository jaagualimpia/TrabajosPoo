package Soldados.FuncionesSobreSoldados;

import Soldados.*;
import UIsoldados.UIInterfazEleccionSoldados;

import java.util.Scanner;

public class CreacionSoldado {
    private static String nombreRellenar;

    private static SoldadoEjercito soldadoCreadoNuevo;

    public static SoldadoEjercito soldadoCreado (int eleccion){

        preguntaDatosSoldado();
        switch (eleccion){
            case 1:
                soldadoCreadoNuevo = new Cabo(nombreRellenar, "Cabo");
                break;
            case 2:
                soldadoCreadoNuevo = new Sargento(nombreRellenar, "Sargento");
                break;
            case 3:
                soldadoCreadoNuevo = new Subteniente(nombreRellenar, "Subteniente");
                break;
            case 4:
                soldadoCreadoNuevo = new Teniente(nombreRellenar, "Teniente");
                break;
            case 5:
                soldadoCreadoNuevo = new Mayor(nombreRellenar, "Mayor");
                break;
            case 6:
                soldadoCreadoNuevo = new General(nombreRellenar, "General");
                break;
            case 7:
                soldadoCreadoNuevo = null;
                System.gc();
                break;
        }
        return soldadoCreadoNuevo;
    }

    private static void preguntaDatosSoldado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del soldado a enlistar: ");
        nombreRellenar = sc.nextLine();
    }
}