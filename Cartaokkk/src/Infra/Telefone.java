package Infra;

import Interface.InterfaceCadastro;

public class Telefone implements InterfaceCadastro {

    private int ddd;
    private long numero;

    public Telefone(int ddd, long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }


    @Override
    public void entrar() {
        System.out.println("DDD: ");
        int novoDdd = leia.nextInt();
        setDdd(novoDdd);

        System.out.println("Número: ");
        long novoNumero = leia.nextLong();
        setNumero(novoNumero);
    }

    @Override
    public void imprimir() {
        System.out.println("DDD: " + getDdd());
        System.out.println("Número: " + getNumero());
    }
}
