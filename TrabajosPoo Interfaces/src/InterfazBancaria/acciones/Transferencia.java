package InterfazBancaria.acciones;

import InterfazBancaria.Usuario;

import java.util.ArrayList;

public interface Transferencia extends Transaccion{
    void realizarTrasferencia(ArrayList<Usuario> usuariosBanco);
}
