package Infra;

import Interface.InterfaceCadastro;

import javax.sound.midi.Soundbank;

public class Endereco implements InterfaceCadastro {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public void entrar() {
        System.out.println("Logradouro: ");
        String novoLogradouro = leia.next();
        setLogradouro(novoLogradouro);

        System.out.println("Número: ");
        String novoNumero = leia.next();
        setNumero(novoNumero);

        System.out.println("Complemento: ");
        String novoComplemento = leia.next();
        setComplemento(novoComplemento);

        System.out.println("Bairro: ");
        String novoBairro = leia.next();
        setBairro(novoBairro);

        System.out.println("Cidade: ");
        String novaCidade = leia.next();
        setCidade(novaCidade);

        System.out.println("Estado: ");
        String novoEstado = leia.next();
        setEstado(novoEstado);

        System.out.println("CEP: ");
        int novoCep = leia.nextInt();
        setCep(novoCep);
    }

    @Override
    public void imprimir() {
        System.out.println("Logradouro: " + getLogradouro());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("CEP: " + getCep());
    }
}
