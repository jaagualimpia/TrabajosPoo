package Soldados.FuncionesSobreSoldados;

import Soldados.General;
import Soldados.*;

import java.util.ArrayList;

public class RangoConMasSoldados {
    private static int valorMasAlto;
    private static String rangoConMasMiembros;

    public static int getValorMasAlto() {
        return valorMasAlto;
    }

    public static String rangoMasPopular(ArrayList<SoldadoEjercito> soldadosVigentes){

            valorMasAlto = Math.max(Cabo.getCantidadCabos(), Math.max(Sargento.getCantidadSargento(), Math.max(Subteniente.getCantidadSubteniente(), Math.max(Teniente.getCantidadTeniente(), Math.max(Mayor.getCantidadMayor(), General.getCantidadGenerales())))));

            if(valorMasAlto == Cabo.getCantidadCabos()){
                    rangoConMasMiembros = "Cabo";
            }else if (valorMasAlto == Sargento.getCantidadSargento()){
                    rangoConMasMiembros = "Sargentos";
            }else if (valorMasAlto == Subteniente.getCantidadSubteniente()){
                    rangoConMasMiembros = "Subtenientes";
            }else if (valorMasAlto == Teniente.getCantidadTeniente()){
                    rangoConMasMiembros = "Tenientes";
            }else if(valorMasAlto == Mayor.getCantidadMayor()){
                    rangoConMasMiembros = "Mayores";
            }else if (valorMasAlto == General.getCantidadGenerales()){
                    rangoConMasMiembros = "General";
            }
            else{
                rangoConMasMiembros = "Por el momento no hay ningun soldado";
            }
        return rangoConMasMiembros;
    }
}
