package Soldados;

public class Sargento extends Cabo{
    protected static int cantidadSargento = 0;
    protected boolean derechoCarro = true;

    public Sargento(String nombre, String rango) {
        super(nombre, rango);
        if (rango == "Sargento"){
            cantidadSargento++;
        }
    }

    public static int getCantidadSargento() {
        return cantidadSargento;
    }
}
