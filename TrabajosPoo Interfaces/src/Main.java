/*
* Trabajo interfaces POO
* Jorge Andres Agualimpia Caicedo
* Andres Escobar Echeverri
* Jhonny Samuell Aponte
*/



import InterfazBancaria.Cajero;
import InterfazBancaria.Telefono;
import InterfazBancaria.Usuario;
import InterfazBancaria.Web;
import design.UInterfacesAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList <Usuario> baseDeDatosBanco = generacionUsuarios();

        do {
            UInterfacesAplicacion.menuInterfazPrincipal();
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    Cajero usuarioCajero = new Cajero(baseDeDatosBanco);
                    baseDeDatosBanco = usuarioCajero.BaseDatosmodificada(baseDeDatosBanco);
                    break;
                case 2:
                    Telefono usuarioTelefono = new Telefono(baseDeDatosBanco);
                    baseDeDatosBanco = usuarioTelefono.BaseDatosmodificada(baseDeDatosBanco);
                    break;
                case 3:
                    Web usuarioWeb = new Web(baseDeDatosBanco);
                    if (usuarioWeb.BaseDatosmodificada(baseDeDatosBanco, usuarioWeb.getUsuarioTransferirDinero()) != null){
                        baseDeDatosBanco = usuarioWeb.BaseDatosmodificada(baseDeDatosBanco, usuarioWeb.getUsuarioTransferirDinero());
                    }
                    break;
            }
        } while(opcion != 4);
    }

    public static ArrayList<Usuario> generacionUsuarios(){
        ArrayList <Usuario> baseDeDatosBanco = new ArrayList<Usuario>();

        baseDeDatosBanco.add(new Cajero(1119, 3801427, 7800, 9739, 90, 220));
        baseDeDatosBanco.add(new Cajero(1724, 6657843, 32157, 3705, 150, 5000));
        baseDeDatosBanco.add(new Cajero(3159, 4304300, 800, 2205, 12, 150));
        baseDeDatosBanco.add(new Cajero(2197, 3295232, 320000, 2509, 800, 14000));

        return baseDeDatosBanco;
    }
}
