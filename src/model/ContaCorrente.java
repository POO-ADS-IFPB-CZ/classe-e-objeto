package model;

public class ContaCorrente {
    private static int contContas;
    private final int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(String titular){
        this.numero = ++contContas;
        this.titular = titular;
        saldo = 0;
    }

    public static int getContContas(){
        return contContas;
    }

    public boolean depositar(float valor){
        if(valor > 10000) return false;
        if(valor < 0) return false;
        saldo += valor;
        return true;
    }

    public boolean sacar(float valor){
        if(valor < 0) return false;
        if(valor > saldo) return false;
        if(saldo == 0) return false;
        saldo -= valor;
        return true;
    }

    public boolean transferir(ContaCorrente destino, float valor){
        if(valor < 0) return false;
        if(valor > 10000) return false;
        if(valor > saldo) return false;
        saldo -= valor;
        destino.saldo += valor;
        return true;
    }

    public float getSaldo(){
        return saldo;
    }

}
