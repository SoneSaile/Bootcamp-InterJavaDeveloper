package BasicExercises.JavaAlgoritmosBasicos;

import BasicExercises.JavaAlgoritmosBasicos.imc.CalculadorIMC;
import BasicExercises.JavaAlgoritmosBasicos.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args){

        final Pessoa enos = new Pessoa("Enos", 100.0, 1.83);

        CalculadorIMC calculatorIMC = new CalculadorIMC();
        var imc = calculatorIMC.calcular(enos);
        System.out.println("O IMC do " + enos.getNome() + " = " + imc);

    }
}
