package Soldados;

public class Teniente extends Subteniente{
    protected static int cantidadTeniente = 0;

    public Teniente(String nombre, String rango) {
        super(nombre, rango);
        if(rango == "Teniente"){
            cantidadTeniente++;
        }
    }

    public static int getCantidadTeniente() {
        return cantidadTeniente;
    }
}
