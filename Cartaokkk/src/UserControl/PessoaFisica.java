package UserControl;

import Interface.InterfaceCadastro;


public class PessoaFisica extends Pessoa implements InterfaceCadastro {

    private String cpf;
    private String rg;
    private String emissor;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    @Override
    public void entrar(){

        super.entrar();

        System.out.println("CPF: ");
        String novoCpf = leia.next();
        setCpf(novoCpf);

        System.out.println("RG: ");
        String novoRg = leia.next();
        setRg(novoRg);

        System.out.println("Emissor: ");
        String novoEmissor = leia.next();
        setEmissor(novoEmissor);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
        System.out.println("Emissor: " + getEmissor());
    }
}
