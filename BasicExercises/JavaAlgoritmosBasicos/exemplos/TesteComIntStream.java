package BasicExercises.JavaAlgoritmosBasicos.exemplos;

import java.util.stream.IntStream;

public class TesteComIntStream {
    public static void main(String[] args){
        IntStream.range(0,3).forEach(n -> {
            n++;
            System.out.println("Número = "+ n);
        });
    }
}
