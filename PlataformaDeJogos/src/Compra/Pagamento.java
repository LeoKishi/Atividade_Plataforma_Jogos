package Compra;

import Plataforma.Usuario;


public interface Pagamento {
    public boolean validarDados(Usuario usuario);       // simular uma validação de dados
    public boolean realizarPagamento (Usuario usuario); // efetivar a transação
    public void enviarRecibo (Usuario usuario);         // simular envio de recibo via e-mail
}
