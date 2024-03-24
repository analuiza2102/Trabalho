package UserControl;

import Infra.Endereco;
import Infra.Telefone;
import Interface.InterfaceCadastro;

public class Pessoa implements InterfaceCadastro {

    private int id;
    private String nome;
    private String email;
    Telefone telefone;
    Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public void entrar() {
        System.out.println("ID: ");
        int novoId = leia.nextInt();
        setId(novoId);

        System.out.println("Nome: ");
        String novoNome = leia.next();
        setNome(novoNome);

        System.out.println("Email: ");
        String novoEmail = leia.next();
        setEmail(novoEmail);

        System.out.println("Telefone: ");
        telefone.entrar();

        System.out.println("Endereço: ");
        endereco.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
    }
}
