package Financeiro;

import Interface.InterfaceCadastro;
import Usuarios.Fornecedor;

public class Pagar extends Financeiro implements InterfaceCadastro {

    private String boleto;
    Fornecedor fornecedor;

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double calcularTotal() {
        return getValor() + getJuros() - getDesconto();
    }

    @Override
    public void entrar(){
        super.entrar();

        System.out.println("Boleto: ");
        String novoBoleto = leia.next();
        setBoleto(novoBoleto);

        System.out.println("Fornecedor");
        fornecedor.entrar();
    }

    @Override
    public void imprimir(){

        if (getBoleto() == null || getFornecedor() == null) {
            System.out.println("Não há dados suficientes para exibir o Fluxo de Caixa.");
            return;
        }

        System.out.println("Boleto: " + getBoleto());
        System.out.println("Fornecedor: " + getFornecedor());
        System.out.println("Total a Pagar: " + calcularTotal());
    }
}
