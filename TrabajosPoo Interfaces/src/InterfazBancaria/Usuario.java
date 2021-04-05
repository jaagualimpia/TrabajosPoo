package InterfazBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Usuario {
    Scanner sc = new Scanner(System.in);

    protected int idUsuario;
    protected int numeroTelefono;
    protected int dineroDisponible;
    protected int clave;
    protected int opcion;
    protected int minutos;
    protected int indexUsuario;
    protected int idDestino;
    protected int cantidadCredito;

    public Usuario(int idUsuario, int numeroTelefono, int dineroDisponible, int clave, int minutos, int cantidadCredito) {
        this.idUsuario = idUsuario;
        this.numeroTelefono = numeroTelefono;
        this.dineroDisponible = dineroDisponible;
        this.clave = clave;
        this.minutos = minutos;
        this.cantidadCredito = cantidadCredito;
    }

    public Usuario() {
    }

    protected void validacionCredenciales(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingrese el ID de su cuenta");
        this.idUsuario = sc.nextInt();
        System.out.println("Ingrese la clave de su cuenta");
        this.clave = sc.nextInt();
    }

    protected boolean validarUsuario(ArrayList<Usuario> usuariosBanco){
        boolean validacion = false;
        for (Usuario usuarioParticular: usuariosBanco) {
            if (usuarioParticular.idUsuario == this.idUsuario && usuarioParticular.clave == this.clave){
                validacion = true;
                this.indexUsuario = usuariosBanco.indexOf(usuarioParticular);
                asignacionDatos(usuarioParticular);
                break;
            }else{
                continue;
            }
        }
        return validacion;
    }

    protected void asignacionDatos(Usuario usuarioParticular){
        this.idUsuario = usuarioParticular.idUsuario;
        this.dineroDisponible = usuarioParticular.dineroDisponible;
        this.numeroTelefono = usuarioParticular.numeroTelefono;
        this.minutos = usuarioParticular.minutos;
        this.cantidadCredito = usuarioParticular.cantidadCredito;
    }

    public ArrayList<Usuario> BaseDatosmodificada (ArrayList<Usuario> usuariosBanco){
        ArrayList<Usuario> nuevaBaseDatos = usuariosBanco;

        nuevaBaseDatos.remove(this.indexUsuario);
        nuevaBaseDatos.add(new Cajero(this.idUsuario, this.numeroTelefono, this.dineroDisponible, this.clave, this.minutos, this.cantidadCredito));

        return nuevaBaseDatos;
    }
}
