package UserControl;

import Infra.Endereco;
import Infra.Telefone;
import Interface.InterfaceCadastro;

public class Pessoa implements InterfaceCadastro {

    public int id;
    public String nome;
    public String email;
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

    }

    @Override
    public void imprimir() {

    }
}
