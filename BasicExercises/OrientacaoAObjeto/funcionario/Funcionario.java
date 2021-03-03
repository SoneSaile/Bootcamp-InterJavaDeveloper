package BasicExercises.OrientacaoAObjeto.funcionario;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(final String nome, final double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Double calcularImposto(){
        return this.salario * 0.02;
    }

    public Double getSalario(){
        return this.salario;
    }
}
