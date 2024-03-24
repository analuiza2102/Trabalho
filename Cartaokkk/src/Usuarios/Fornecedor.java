package Usuarios;

import Interface.InterfaceCadastro;
import UserControl.PessoaJuridica;

public class Fornecedor extends PessoaJuridica implements InterfaceCadastro {

    private String dataCadastro;
    private String  site;
    private double limiteCompra;

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public void entrar(){
        System.out.println("Data de Cadastro: ");
        String novaData = leia.next();
        setDataCadastro(novaData);

        System.out.println("Site: ");
        String novoSite = leia.next();
        setSite(novoSite);

        System.out.println("Limite da Compra: ");
        double novoLimite = leia.nextDouble();
        setLimiteCompra(novoLimite);
    }

    @Override
    public void imprimir(){
        System.out.println("Data de Cadastro: " + getDataCadastro());
        System.out.println("Site: " + getSite());
        System.out.println("Limite da Compra: " + getLimiteCompra());
    }
}
