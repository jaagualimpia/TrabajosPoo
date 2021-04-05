package InterfazBancaria;

import InterfazBancaria.acciones.RecargaMovil;
import design.UInterfacesAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefono extends Usuario implements RecargaMovil {
    Scanner sc = new Scanner(System.in);

    private int minutosDeseados;

    public Telefono(int idUsuario, int numeroTelefono, int dineroDisponible, int clave, int minutos, int cantidadCredito) {
        super(idUsuario, numeroTelefono, dineroDisponible, clave, minutos, cantidadCredito);
    }

    public Telefono (ArrayList<Usuario> usuariosBanco){
        validacionCredenciales();
        if(validarUsuario(usuariosBanco)){
            procesoTelefono();
        }else{
            System.out.println("No se ha ingresado un usuario correcto");
        }
    }

    @Override
    protected void validacionCredenciales() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingrese su numero de telefono");
        this.numeroTelefono = sc.nextInt();
        System.out.println("Ingrese la clave de su cuenta");
        this.clave = sc.nextInt();
    }

    private void seleccionOpcionTelefono(){
        UInterfacesAplicacion.opcionesTelefono();
        this.opcion = sc.nextInt();
    }

    private void procesoTelefono(){
        do {
            seleccionOpcionTelefono();
            if(opcion == 1){
                realizarRecargaMinutos();
            }
        }while(opcion != 2);
    }

    @Override
    public void realizarRecargaMinutos() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Saldo: " + dineroDisponible + "USD");
        System.out.println("Minutos actuales: " + minutos);
        System.out.println("(Marque cuantos) Cuantos minutos quieres comprar? (1 USD = 5 MIN)");
        minutosDeseados = sc.nextInt();
        minutos += minutosDeseados;
        dineroDisponible = dineroDisponible - (Math.round(minutosDeseados/5));
        System.out.println("Minutos actuales: " + minutos);
        System.out.println("Saldo actual: " + dineroDisponible + "USD");
    }

    @Override
    protected boolean validarUsuario(ArrayList<Usuario> usuariosBanco) {
        boolean validacion = false;
        for (Usuario usuarioParticular: usuariosBanco) {
            if (usuarioParticular.numeroTelefono == this.numeroTelefono && usuarioParticular.clave == this.clave){
                validacion = true;
                this.indexUsuario = usuariosBanco.indexOf(usuarioParticular);
                super.asignacionDatos(usuarioParticular);
                break;
            }else{
                continue;
            }
        }
        return validacion;
    }
}
