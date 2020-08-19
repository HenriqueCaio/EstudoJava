package com.company.exemplos;

public class ContaCorrente extends Conta2 {
    @Override
    public void atualiza(double taxa) {
        this.saldo = this.saldo * (taxa * 2);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor - 0.10;
    }

    public void saca (double valor) {
        this.saldo = this.saldo - valor;
    }
}
