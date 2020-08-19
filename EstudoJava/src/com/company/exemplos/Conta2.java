package com.company.exemplos;

public class Conta2 {
    // atributo saldo da classe conta2
    protected double saldo;

    public double getSaldo () {
        return this.saldo;
    }

    public void deposita (double valor){
        this.saldo = this.saldo + valor;
    }

    public void saca (double valor) {
        this.saldo = this.saldo - valor;
    }

    public void atualiza (double taxa) {
        this.saldo = this.saldo * taxa;
    }
}
