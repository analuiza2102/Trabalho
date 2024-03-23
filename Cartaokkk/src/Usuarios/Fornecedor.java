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

    }

    @Override
    public void imprimir(){

    }
}
