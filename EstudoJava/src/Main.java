public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta(); // objeto do tipo conta
        c1.deposita(100);
        c1.deposita(1000);
        c1.saca(250);
        c1.saca(400);
        c1.saca(500);

        System.out.println(c1.saldo);




    }
}
