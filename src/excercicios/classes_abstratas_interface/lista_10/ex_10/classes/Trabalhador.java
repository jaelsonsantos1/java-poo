package src.excercicios.classes_abstratas_interface.ex_10.classes;

public abstract class Trabalhador {
    private String nome;
    private double salario;
    private int idade;
    private String endereco;

    public Trabalhador(String nome, double salario, int idade, String endereco) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() { return this.nome; }
    public int getSalario() { return this.salario; }
    public int getIdade() { return this.idade; }
    public String getEndereco() { return this.endereco; }

    public void setNome(String nome) { this.nome = nome; }
    public void setSalario(double salario) { this.salario = salario; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public abstract void calculaSalario();
}