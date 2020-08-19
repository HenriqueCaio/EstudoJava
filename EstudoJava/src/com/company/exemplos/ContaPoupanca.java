package com.company.exemplos;

public class ContaPoupanca extends Conta2 {

    @Override
    public void atualiza(double taxa) {

        this.saldo = this.saldo * (taxa * 3);
    }
}
