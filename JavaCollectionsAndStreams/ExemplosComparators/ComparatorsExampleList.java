package JavaCollectionsAndStreams.ExemplosComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante ("Pedro", 19));
        estudantes.add(new Estudante ("Enos", 23));
        estudantes.add(new Estudante ("Karina", 24));
        estudantes.add(new Estudante ("Mariana", 17));
        estudantes.add(new Estudante ("Lucas", 25));
        estudantes.add(new Estudante ("Karoline", 29));
        estudantes.add(new Estudante ("Ana", 23));

        System.out.println(" --- Ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--- Ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- Ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- Ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("--- Ordem reversa dos números - idade (method reference) reversed ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("--- Ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());

        System.out.println("--- Ordem reversa dos números - idade )interface Comparator) ---");
        System.out.println(estudantes);
    }
}
