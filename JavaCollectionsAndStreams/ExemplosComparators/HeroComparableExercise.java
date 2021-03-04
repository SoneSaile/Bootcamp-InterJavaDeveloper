package JavaCollectionsAndStreams.ExemplosComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HeroComparableExercise {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();

        heroes.add(new Hero("Leshrac", "INT", 18));
        heroes.add(new Hero("Axe", "STR", 16));
        heroes.add(new Hero("Mirana", "AGI", 21));
        heroes.add(new Hero("Bristleback", "STR", 21));
        heroes.add(new Hero("Invoker", "INT", 15));
        heroes.add(new Hero("Riki", "AGI", 17));

        System.out.println(heroes);

        heroes.sort((first, second) -> first.getLevel() - second.getLevel());

        System.out.println("--- Lista de heróis em ordem crescente de level ---");
        System.out.println(heroes);

        heroes.sort(Comparator.comparingInt(Hero::getLevel));

        System.out.println("--- Lista de heróis em ordem crescente utilizando Comparator ---");
        System.out.println(heroes);

        heroes.sort(Comparator.comparingInt(Hero::getLevel).reversed());

        System.out.println("--- Lista de heróis em decrescente utilizando Comparator ---");
        System.out.println(heroes);

        Collections.sort(heroes);

        System.out.println("-- Lista de heróis em ordem decrescente utilizando Comparable");
        System.out.println(heroes);

        Collections.sort(heroes, new HeroOrdemLevelReversa());

        System.out.println("-- Lista de heróis em ordem crescente utilizando Comparable");
        System.out.println(heroes);
    }
}
