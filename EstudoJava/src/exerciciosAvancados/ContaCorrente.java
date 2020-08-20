package exerciciosAvancados;

public class ContaCorrente implements ContaTributavel {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo = this.saldo + (taxaSelic * this.saldo);
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;

    }


}
