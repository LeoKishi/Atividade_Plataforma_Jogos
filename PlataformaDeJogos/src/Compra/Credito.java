package Compra;

import Plataforma.Usuario;


public class Credito implements Pagamento {

    @Override
    public boolean validarDados(Usuario usuario) {
        return true;
    }

    @Override
    public boolean realizarPagamento(Usuario usuario) {
        if (validarDados(usuario)) {
            System.out.println("\n* Compra no " + TipoPagamento.CREDITO + " finalizada.");
            enviarRecibo(usuario);
            return true;
        }
        return false;
    }

    @Override
    public void enviarRecibo(Usuario usuario) {
        System.out.println("* Recibo enviado para o e-mail: " + usuario.getEmail());
    }
}
