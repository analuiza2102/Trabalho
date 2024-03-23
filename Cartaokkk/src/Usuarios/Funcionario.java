package Usuarios;

import Infra.Endereco;
import Infra.Telefone;
import Interface.InterfaceCadastro;
import UserControl.PessoaFisica;

import javax.sound.midi.Soundbank;

public class Funcionario extends PessoaFisica implements InterfaceCadastro  {

    private String dataAdmissao;
    private String dataDemissao;
    private String ctps;
    private double salario;

    public Funcionario(int id, String nome, String email, Telefone telefone, Endereco endereco, String cpf, String rg, String emissor, String dataAdmissao, String dataDemissao, String ctps, double salario) {
        super(id, nome, email, telefone, endereco, cpf, rg, emissor);
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.ctps = ctps;
        this.salario = salario;
    }


    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void entrar() {

        super.entrar();

        System.out.println("Data de Admissão: ");
        String novaDta = leia.next();
        setDataAdmissao(novaDta);

        System.out.println("Data de Demissão: ");
        String novaDtd = leia.next();
        setDataDemissao(novaDtd);

        System.out.println("CTPS: ");
        String novoCtps = leia.next();
        setCtps(novoCtps);

        System.out.println("Salário: ");
        double novoSalario = leia.nextDouble();
        setSalario(novoSalario);
    }

    @Override
    public void imprimir() {
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Data de Demissão: " + getDataDemissao());
        System.out.println("CTPS: " + getCtps());
        System.out.println("Saláiro: " + getSalario());
    }
}
