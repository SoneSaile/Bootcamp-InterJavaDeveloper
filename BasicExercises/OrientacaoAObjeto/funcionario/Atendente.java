package BasicExercises.OrientacaoAObjeto.funcionario;

public class Atendente extends Funcionario{

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcularImposto(){
        return getSalario() * 0.01;
    }
}
