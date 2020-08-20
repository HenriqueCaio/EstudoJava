package com.company.exemplos;

public class ContaCorrente extends Conta2 implements Tributavel {

    @Override
    public void atualiza(double taxa) {
        this.saldo = this.saldo * (taxa * 2);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor - 0.10;
    }

    @Override
    public void saca (double valor) {

        this.saldo = this.saldo - valor;
    }


    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
