package exerciciosAvancados;

public class ContaPoupanca implements Conta {
    private double saldo;

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void saca(double valor) {
        this.saldo = this.saldo - valor;
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo = this.saldo + (this.saldo * 0.05);
    }
}
