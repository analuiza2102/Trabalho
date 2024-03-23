package Financeiro;

import Interface.InterfaceCadastro;
import Usuarios.Cliente;

public class Receber extends Financeiro implements InterfaceCadastro {

    private String nota_fiscal;
    Cliente cliente;

    public Receber(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros, double multa, double desconto, double total, String nota_fiscal, Cliente cliente) {
        super(id, numero, emissao, vencimento, pagamento, valor, juros, multa, desconto, total);
        this.nota_fiscal = nota_fiscal;
        this.cliente = cliente;
    }


    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularTotal() {
        return getValor() + getJuros() - getDesconto();
    }
    @Override
    public void entrar(){
        super.entrar();

        System.out.println("Nota Fiscal: ");
        String novaNota = leia.next();
        setNota_fiscal(novaNota);

        System.out.println("Cliente: ");
        cliente.entrar();
    }

    @Override
    public void imprimir(){

        if (getNota_fiscal() == null || getCliente() == null) {
            System.out.println("Não há dados suficientes para exibir o Fluxo de Caixa.");
            return;
        }

        System.out.println("Nota Fiscal: " + getNota_fiscal());
        System.out.println("Cliente: " + getCliente());
        System.out.println("Total a Receber: " + calcularTotal());
    }
}
