package InterfazBancaria;

import InterfazBancaria.acciones.Consulta;
import InterfazBancaria.acciones.Deposito;
import InterfazBancaria.acciones.RetiradaEfectivo;
import design.UInterfacesAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Cajero extends Usuario implements RetiradaEfectivo, Consulta, Deposito {
    Scanner sc = new Scanner(System.in);

    public Cajero(ArrayList<Usuario> usuariosBanco){
        super.validacionCredenciales();
        if(super.validarUsuario(usuariosBanco)){
            procesoCajero();
        }else{
            System.out.println("No se ha ingresado un usuario correcto");
        }
    }

    public Cajero(int idUsuario, int numeroTelefono, int dineroDisponible, int clave, int minutos, int cantidadCredito) {
        super(idUsuario, numeroTelefono, dineroDisponible, clave, minutos, cantidadCredito);
    }

    private void seleccionOpcionCajero(){
        UInterfacesAplicacion.opcionesCajero();
        opcion = sc.nextInt();
    }

    private void procesoCajero(){
        do{
            seleccionOpcionCajero();
            switch (opcion){
                case 1:
                    depositar();
                    break;
                case 2:
                    consultarDatos();
                    break;
                case 3:
                    retiradaDinero();
                    break;
            }
        }while (opcion != 4);
    }

    @Override
    public void retiradaDinero() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Saldo actual: " + dineroDisponible + "USD");
        System.out.println("Digita cuanto dinero deseas retirar? (USD)");
        this.dineroDisponible -= sc.nextInt();
        System.out.println("Saldo actual: " + dineroDisponible + " USD");
    }

    @Override
    public void consultarDatos() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Saldo actual de la cuenta: " + dineroDisponible + " USD");
        System.out.println("Credito adeudado: " + cantidadCredito + " USD");
    }

    @Override
    public void depositar() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Saldo actual: " + dineroDisponible);
        System.out.println("Digita cuanto dinero deseas depositar?");
        this.dineroDisponible += sc.nextInt();
        System.out.println("Saldo actual: " + dineroDisponible + " USD");
    }
}
