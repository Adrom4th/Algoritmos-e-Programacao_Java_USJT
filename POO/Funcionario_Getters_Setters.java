public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];

    //Comando Set define o valor da variável privada da classe
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    //Comando Get retorna o valor atribuído à variável privada da classe
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalario() {
        return this.salario;
    }
}
