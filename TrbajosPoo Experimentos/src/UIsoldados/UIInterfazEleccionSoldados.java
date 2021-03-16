package UIsoldados;

import Soldados.SoldadoEjercito;

import java.util.ArrayList;

public class UIInterfazEleccionSoldados {
    private static int opcionDevolverse;

    public static void menuInicial(){
        System.out.println("-----------------------------------------------");
        System.out.println("1. Agregar soldado.");
        System.out.println("2. Eliminar soldado.");
        System.out.println("3. Consultar rango que posee mas soldados.");
        System.out.println("4. Costo de la nomina de la organizacion.");
        System.out.println("5. Saber si hay generales.");
        System.out.println("6. Salir del programa.");
    }

    public static void menuCrearSoldado(){
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese que tipo de soldado quiere agregar:\n");
        System.out.println("1. Cabo");
        System.out.println("2. Sargento");
        System.out.println("3. Subteniente");
        System.out.println("4. Teniente");
        System.out.println("5. Mayor");
        System.out.println("6. General");
        System.out.println("7. Devolverse");
    }

    public static void menuEliminarSoldado(ArrayList<SoldadoEjercito> soldadosVigentes){
        System.out.println("------------------------------------------------");
        for (int i = 0; i < soldadosVigentes.size(); i++) {
            System.out.println(i+". Nombre: "+ soldadosVigentes.get(i).getNombre()+", Rango: " + soldadosVigentes.get(i).getRango());
        }
        int opcionDevolverse = soldadosVigentes.size() + 1;
        System.out.println(opcionDevolverse + ". Devolverse");
    }
}
