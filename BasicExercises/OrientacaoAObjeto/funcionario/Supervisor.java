package BasicExercises.OrientacaoAObjeto.funcionario;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcularImposto(){
        return getSalario() * 0.05;
    }
}
