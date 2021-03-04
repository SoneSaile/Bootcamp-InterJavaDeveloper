package JavaCollectionsAndStreams.ExemplosOptionals;

import java.util.Optional;

public class ExerciseOptional {

    public static void main(String[] args) {

        Optional<String> optionalPresente = Optional.of("Presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        Optional<String> optionalVazio = Optional.empty();

        optionalPresente.ifPresent(System.out::println);
        //optionalVazio.orElseThrow(IllegalStateException::new);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        optionalPresente.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);

        if (optionalPresente.isPresent()) {
            String valor = optionalPresente.get();

            System.out.println(valor);
        }



    }
}
