package Soldados;

public class Subteniente extends Sargento{
    protected boolean elegirCarrera = true;
    protected static int cantidadSubteniente = 0;

    public Subteniente(String nombre, String rango) {
        super(nombre, rango);
        if (rango == "Subteniente"){
            cantidadSubteniente++;
        }
    }

    public static int getCantidadSubteniente() {
        return cantidadSubteniente;
    }
}
