import Soldados.*;
import Soldados.FuncionesSobreSoldados.CreacionSoldado;
import Soldados.FuncionesSobreSoldados.RangoConMasSoldados;
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

    do {
        UIInterfazEleccionSoldados.menuInicial();
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                UIInterfazEleccionSoldados.menuCrearSoldado();
                opcionCreacionSoldado = sc.nextInt();
                if(opcionCreacionSoldado > 0 && opcionCreacionSoldado < 7){
                    soldadoinmediato = CreacionSoldado.soldadoCreado(opcionCreacionSoldado);
                    soldadosDelEjercitoVigentes.add(soldadoinmediato);
                }
                break;
            case 2:
                if(soldadosDelEjercitoVigentes.size() != 0){
                    System.out.println("Ingresa el numero del soldado que quieres eliminar");
                    UIInterfazEleccionSoldados.menuEliminarSoldado(soldadosDelEjercitoVigentes);
                    soldadoParaEliminar = sc.nextInt();
                    soldadosDelEjercitoVigentes.get(soldadoParaEliminar).eliminar();
                    soldadosDelEjercitoVigentes.remove(soldadoParaEliminar);
                }else{
                    System.out.println("-----------------------------------------------");
                    System.out.println("No hay soldados enlistados para eliminar");
                }
                break;
            case 3:
                System.out.println("El rango con mas soldados es: " + RangoConMasSoldados.rangoMasPopular(soldadosDelEjercitoVigentes)+" con "+RangoConMasSoldados.getValorMasAlto() + " soldados");
                break;
            case 4:
                costoNomina = (SoldadoEjercito.getSalario()*(SoldadoEjercito.cantidadSoldados - General.getCantidadGenerales()))+((SoldadoEjercito.getSalario()*General.getCantidadGenerales())*2);
                System.out.println("Costo total de la nomina es: "+ costoNomina);
                break;
            case 5:
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