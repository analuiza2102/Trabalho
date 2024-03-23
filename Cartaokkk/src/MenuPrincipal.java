import Financeiro.Pagar;
import Financeiro.Receber;
import Usuarios.Cliente;
import Usuarios.Fornecedor;
import Usuarios.Funcionario;

public class MenuPrincipal {
    private Cliente cliente;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Receber receber;
    private Pagar pagar;

    public MenuPrincipal(Cliente cliente, Fornecedor fornecedor, Funcionario funcionario, Receber receber, Pagar pagar) {
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        this.funcionario = funcionario;
        this.receber = receber;
        this.pagar = pagar;
    }

}
