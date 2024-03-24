package Usuarios;

import Infra.Endereco;
import Interface.InterfaceCadastro;
import UserControl.PessoaJuridica;

public class Cliente extends PessoaJuridica implements InterfaceCadastro {

    Endereco enderecoCobranca;
    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    @Override
    public void entrar(){

        super.entrar();

        System.out.print("Limite de Crédito: ");
        double novoLimite = leia.nextDouble();
        setLimiteCredito(novoLimite);

        System.out.println("Endereço de Cobrança: ");
        enderecoCobranca.entrar();

    }

    @Override
    public void imprimir(){
        System.out.println("Limite de Crédito: " + getLimiteCredito());
        System.out.println("Endereço de Cobrança: " + getEnderecoCobranca());
    }
}
