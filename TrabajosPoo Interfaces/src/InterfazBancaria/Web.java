package InterfazBancaria;

import InterfazBancaria.acciones.Transferencia;
import design.UInterfacesAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Web extends Usuario implements Transferencia {
    Scanner sc = new Scanner(System.in);
    private int idDestinatario;
    private int indexDestinatario;
    private int dineroTransferencia;
    private Usuario usuarioTransferirDinero;

    public Web(ArrayList<Usuario> usuariosBanco) {
        super.validacionCredenciales();

        if(super.validarUsuario(usuariosBanco)){
            procesoPaginaWeb(usuariosBanco);
        }else{
            System.out.println("No se ha ingresado un usuario correcto");
        }
    }

    private void seleccionOpcionWeb(){
        UInterfacesAplicacion.opcionesWeb();
        opcion = sc.nextInt();
    }

    private void procesoPaginaWeb(ArrayList<Usuario> usuariosBanco){
        do{
            seleccionOpcionWeb();
            switch (opcion){
                case 1:
                    consultarDatos();
                    break;
                case 2:
                    realizarTrasferencia(usuariosBanco);
                    break;
                case 3:
                    solicitarCredito();
                    break;
            }
        }while (opcion != 4);
    }

    @Override
    public void definicionDestinatario() {
        System.out.println("Ingresa el Id de la cuenta del destinatario");
        this.idDestinatario = sc.nextInt();
    }

    @Override
    public void realizarTrasferencia(ArrayList<Usuario> usuariosBanco) {
        definicionDestinatario();
        if(validacionDestinatario(usuariosBanco)){
            System.out.println("----------------------------------------------------------");
            System.out.println("Cuanto dinero deseas enviar");
            System.out.println("Saldo actual: " + dineroDisponible + " USD");
            dineroTransferencia = sc.nextInt();
            dineroDisponible -= dineroTransferencia;
            usuarioTransferirDinero.dineroDisponible += dineroTransferencia;
        }else{
            System.out.println("Id de destinatario no valida");
        }

    }

    private void consultarDatos() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Saldo actual de la cuenta: " + dineroDisponible + " USD");
        System.out.println("Credito adeudado: " + cantidadCredito + " USD");
    }

    private void solicitarCredito(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresa cuanto dinero necesitas");
        System.out.println("Credito adeudado: " + cantidadCredito + "USD");
        cantidadCredito += sc.nextInt();
        System.out.println("Credito adeudado: " + cantidadCredito + "USD");
    }

    private boolean validacionDestinatario(ArrayList<Usuario> usuariosBanco){
        for (Usuario usuarioTransferencia : usuariosBanco) {
            if(usuarioTransferencia.idUsuario == idDestinatario){
                usuarioTransferirDinero = usuarioTransferencia;
                indexDestinatario = usuariosBanco.indexOf(usuarioTransferencia);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Usuario> BaseDatosmodificada(ArrayList<Usuario> usuariosBanco, Usuario usuarioTransferencia) {
        if (usuarioTransferencia != null){
            usuariosBanco.remove(this.indexUsuario);
            usuariosBanco.remove(indexDestinatario);

            usuariosBanco.add(new Cajero(this.idUsuario, this.numeroTelefono, this.dineroDisponible, this.clave, this.minutos, this.cantidadCredito));
            usuariosBanco.add(new Cajero(usuarioTransferencia.idUsuario, usuarioTransferencia.numeroTelefono, usuarioTransferencia.dineroDisponible, usuarioTransferencia.clave, usuarioTransferencia.minutos, usuarioTransferencia.cantidadCredito));
        }
        return usuariosBanco;
    }

    public Usuario getUsuarioTransferirDinero() {
        return usuarioTransferirDinero;
    }

}