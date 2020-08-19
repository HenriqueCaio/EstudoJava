package com.company.exemplos;

public class MainTestaContas {
    public static void main(String[] args) {

        Conta2 c = new Conta2();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(2000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        cc.saca(20);

        System.out.println("Conta2: " + c.getSaldo());
        System.out.println("Conta corrente:  " + cc.getSaldo());
        System.out.println("Conta poupanca: " + cp.getSaldo());
    }
}
