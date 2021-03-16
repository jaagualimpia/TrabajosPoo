/*
* Trabajo realizado por
* Jorge Andres Agualimpia
* Andres Escobar Echeverri
* Jhonny Samuell Aponte
* Para la materia de programacion orientada a objetos
* */
import Soldados.SoldadoEjercito;
import Soldados.General;
import Soldados.FuncionesSobreSoldados.*;
import UIsoldados.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionCreacionSoldado;
        int soldadoParaEliminar;
        int costoNomina;
        SoldadoEjercito soldadoinmediato;
        ArrayList<SoldadoEjercito> soldadosDelEjercitoVigentes = new ArrayList<SoldadoEjercito>();

    do { // do while imprime el menu. solo sale de el con la opcion acabar programa
        UIInterfazEleccionSoldados.menuInicial();
        opcion = sc.nextInt();
        switch (opcion){
            case 1: // Caso agregar soldados
                UIInterfazEleccionSoldados.menuCrearSoldado();
                opcionCreacionSoldado = sc.nextInt();
                if(opcionCreacionSoldado > 0 && opcionCreacionSoldado < 7){
                    soldadoinmediato = CreacionSoldado.soldadoCreado(opcionCreacionSoldado);
                    soldadosDelEjercitoVigentes.add(soldadoinmediato);
                }
                break;
            case 2: // Caso dar de baja (eliminar soldados)
                if(!soldadosDelEjercitoVigentes.isEmpty()){ // Valida que se hayan creado soldados
                    System.out.println("Ingresa el numero del soldado que dar de baja:");
                    UIInterfazEleccionSoldados.menuEliminarSoldado(soldadosDelEjercitoVigentes);
                    soldadoParaEliminar = sc.nextInt();
                    if (soldadoParaEliminar < soldadosDelEjercitoVigentes.size()){ // Valida que no se haya dado en devolverse
                        soldadosDelEjercitoVigentes.get(soldadoParaEliminar).eliminar();
                        soldadosDelEjercitoVigentes.remove(soldadoParaEliminar);
                    }
                }else{
                    System.out.println("-----------------------------------------------");
                    System.out.println("No hay soldados enlistados para dar de baja");
                }
                break;
            case 3: // Caso rango con mas soldados
                System.out.println("El rango con mas soldados es: " + RangoConMasSoldados.rangoMasPopular(soldadosDelEjercitoVigentes)+" con "+RangoConMasSoldados.getValorMasAlto() + " soldados");
                break;
            case 4: // Caso obtener costo de la nomina
                costoNomina = (SoldadoEjercito.getSalario()*(SoldadoEjercito.cantidadSoldados - General.getCantidadGenerales()))+((SoldadoEjercito.getSalario()*General.getCantidadGenerales())*2);
                System.out.println("Costo total de la nomina es: "+ costoNomina);
                break;
            case 5: // Caso saber si hay generales
                if(General.getCantidadGenerales() > 0){
                    if(General.getCantidadGenerales() == 1){
                        System.out.println("Solo hay un general");
                    }else{
                        System.out.println("hay " + General.getCantidadGenerales()+" generales");
                    }
                }else{
                    System.out.println("No hay generales");
                }
                break;
        }
    }while(opcion != 6);
        System.out.println("Se acabo el programa");
    }
}