public class Porta {

    // atributos da classe porta
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    // metodo abre
    public void abre() {
        aberta = true;
    }

    // metodo fecha
    public void fecha() {
        aberta = false;
    }
    // metodo pinta
    public void pinta(String tinta) {
        cor = tinta;
    }

    public void mostra() {
        System.out.println("A porta esta aberta: " + aberta);
        System.out.println("A porta tem a cor: " + cor);
        System.out.println("A dimensaoX equivale ao valor de: " + dimensaoX);
        System.out.println("A dimensaoY equivale ao valor de: " + dimensaoY);
        System.out.println("A dimensaoZ equivale ao valor de: " + dimensaoZ);
    }

    public boolean estaAberta() {
        return aberta;
    }

}

