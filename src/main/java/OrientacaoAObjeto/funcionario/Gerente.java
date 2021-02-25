package OrientacaoAObjeto.funcionario;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcularImposto(){
        return getSalario() * 0.1;
    }
}
