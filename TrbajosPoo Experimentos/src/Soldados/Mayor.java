package Soldados;

public class Mayor extends Teniente{
    protected boolean dirigirPeloton = true;
    protected static int cantidadMayor = 0;

    public Mayor(String nombre, String rango) {
        super(nombre, rango);
        if (rango == "Mayor"){
            cantidadMayor++;
        }
    }

    public static int getCantidadMayor() {
        return cantidadMayor;
    }
}
