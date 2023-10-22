package src.excercicios.classes_abstratas_interface.ex_10.classes;

public class TrabalhadorIntegral extends Trabalhador {
    
    public TrabalhadorIntegral(String nome, double salario, int idade, String endereco) {
        super(nome, salario, idade, endereco);
    }

    @Override
    public void calculaSalario() {
        if (super.getSalario() < 30) {
            super.setSalario();
        }
    }
}