public class MainPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.dimensaoX = 55;
        porta.dimensaoY = 30;
        porta.dimensaoZ = 15.7;

        porta.mostra();
        porta.pinta("preto");
        porta.abre();
        porta.mostra();
        porta.fecha();
        porta.mostra();
        boolean aberto = porta.estaAberta();
        System.out.println(aberto);
    }
}
