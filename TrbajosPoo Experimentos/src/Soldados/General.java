package Soldados;

public class General extends Mayor{
    private final boolean discursosTv = true;
    protected static int cantidadGenerales = 0;

    public General(String nombre, String rango) {
        super(nombre, rango);
        if (rango == "General"){
            cantidadGenerales++;
        }
    }

    public static int getCantidadGenerales() {
        return cantidadGenerales;
    }
}
