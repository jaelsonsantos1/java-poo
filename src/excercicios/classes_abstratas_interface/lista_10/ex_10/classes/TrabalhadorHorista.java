public class TrabalhadorHorista extends Trabalhador {

    private int horasTrabalhadas;
    private double salarioHora;

    public TrabalhadorHorista(String nome, double salario, int idade, String endereco, int horasTrabalhadas, double salarioHora) {
        super(nome, salario, idade, endereco);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public double getSalarioHoras() {
        return this.salarioHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    
}