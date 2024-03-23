package Usuarios;

import Infra.Endereco;
import Infra.Telefone;
import Interface.InterfaceCadastro;
import UserControl.PessoaJuridica;

public class Cliente extends PessoaJuridica implements InterfaceCadastro {

    Endereco enderecoCobranca;
    private double limiteCredito;

    public Cliente(int id, String nome, String email, Telefone telefone, Endereco endereco, String cnpj, String inscricaoEstadual, String contato, Endereco enderecoCobranca, double limiteCredito) {
        super(id, nome, email, telefone, endereco, cnpj, inscricaoEstadual, contato);
        this.enderecoCobranca = enderecoCobranca;
        this.limiteCredito = limiteCredito;
    }


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
        String logradouro = leia.next();
        String numero = leia.next();
        String complemento = leia.next();
        String bairro = leia.next();
        String cidade = leia.next();
        String estado = leia.next();
        int cep = leia.nextInt();
        Endereco novoEnderecoCobranca = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
        setEnderecoCobranca(novoEnderecoCobranca);
    }

    @Override
    public void imprimir(){
        System.out.println("Limite de Crédito: " + getLimiteCredito());
        System.out.println("Endereço de Cobrança: " + getEnderecoCobranca());
    }
}
