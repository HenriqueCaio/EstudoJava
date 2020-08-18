public class Funcionario {
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }

    // atributos da classe funcionario
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // metodo recebe aumento
    public void recebeAumento(double valor) {
        salario = salario + valor;
    }

    // metodo calculo ganho anual
    public void calculoGanhoAnual() {
        salario = salario * 12;
    }

    // metodo para mostrar todos os atributos do funcionario
    public void mostra() {
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Departamento do funcionario: " + departamento);
        System.out.println("Salario do funcionario: " + salario);
        System.out.println("Data de entrada no banco: " + dataEntrada.getDia() + "-" + dataEntrada.getMes() + "-" + dataEntrada.getAno());
        System.out.println("Rg do funcionario: " + rg);
    }
}
