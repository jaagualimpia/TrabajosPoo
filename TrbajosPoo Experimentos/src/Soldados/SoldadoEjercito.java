package Soldados;

import static Soldados.Cabo.cantidadCabos;
import static Soldados.General.cantidadGenerales;
import static Soldados.Mayor.cantidadMayor;
import static Soldados.Sargento.cantidadSargento;
import static Soldados.Subteniente.cantidadSubteniente;
import static Soldados.Teniente.cantidadTeniente;

public class SoldadoEjercito {
    protected String nombre, rango;
    protected static int salario = 1000000;
    public static int cantidadSoldados;

    public SoldadoEjercito(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
        cantidadSoldados++;

        System.out.println("El " + rango + " " + nombre + " ha sido añadido a las filas");
        System.out.println("\nCantidad de soldados actual: " + cantidadSoldados);
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public static int getSalario() {
        return salario;
    }

    public void eliminar(){
        cantidadSoldados--;
        System.out.println("Se ha dado de baja al "+ rango + " " + nombre);

        if(rango == "General"){
            cantidadGenerales--;
        }else if(rango == "Cabo"){
            cantidadCabos--;
        }else if(rango == "Sargento"){
            cantidadSargento--;
        }else if (rango == "Subteniente"){
            cantidadSubteniente--;
        }else if (rango == "Teniente"){
            cantidadTeniente--;
        }else if (rango == "Mayor") {
            cantidadMayor--;
        }
    }

}
