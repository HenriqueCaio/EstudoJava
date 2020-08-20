package exerciciosAvancados;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(100);
        cc.deposita(500);
        cc.saca(300);
        cc.atualiza(0.1);
        System.out.println("Saldo da Conta Corrente é: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(400);
        cp.deposita(500);
        cp.saca(100);
        cp.atualiza(0.05);
        System.out.println("Saldo da Conta Poupança é: " + cp.getSaldo());
        
    }
}
