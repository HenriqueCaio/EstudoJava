public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Caio Henrique Ferreira da Silva";
        pessoa.idade = 23;

        System.out.println("Nome do aniversariante: " + pessoa.nome);
        System.out.println("Idade atual: " + pessoa.idade);

        pessoa.fazAniversario();
        System.out.println("Ano que vem, Caio terá: " + pessoa.idade + " anos");

    }
}
