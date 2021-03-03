package BasicExercises.OrientacaoAObjeto.funcionario;

public class Programa {

    public static void main(String[] args){

        Atendente atendente = new Atendente("Enos", 1000.0) {
        };
        Gerente gerente = new Gerente("Enos", 1000.0) {
        };
        Supervisor supervisor = new Supervisor("Enos", 1000.0) {
        };


        System.out.println(atendente.calcularImposto());
        System.out.println(supervisor.calcularImposto());
        System.out.println(gerente.calcularImposto());
    }
}
