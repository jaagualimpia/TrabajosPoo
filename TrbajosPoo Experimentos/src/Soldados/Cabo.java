package Soldados;

public class Cabo extends SoldadoEjercito{
    protected static int cantidadCabos = 0;
    protected boolean derechoPension = true;

    public Cabo(String nombre, String rango) {
        super(nombre, rango);
        if (rango == "Cabo"){
            cantidadCabos++;
        }
    }

     public static int getCantidadCabos() {
        return cantidadCabos;
    }
}
