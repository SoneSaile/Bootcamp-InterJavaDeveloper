package JavaCollectionsAndStreams.ExemplosStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseStreamAPI {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();

        heroes.add(new Hero("Leshrac", "STR", 23));
        heroes.add(new Hero("Invoker", "INT", 22));
        heroes.add(new Hero("Riki", "AGI", 17));
        heroes.add(new Hero("Luna", "AGI", 15));
        heroes.add(new Hero("Dark Willow", "INT", 20));
        heroes.add(new Hero("Axe", "STR", 20));
        heroes.add(new Hero("Mirana", "AGI", 19));
        heroes.add(new Hero("Dragon Knight", "STR", 15));

        System.out.println(heroes);

        System.out.println("Número de heróis: " + heroes.stream().count());

        System.out.println("Herois com level igual ou superior a 20: " + heroes.stream()
                .filter((hero) -> hero.getLevel() >= 20)
                .collect(Collectors.toList()));

        heroes.forEach(System.out::println);

        System.out.println("Heróis que possuem a letra E no nome" + heroes.stream().filter((hero) ->
                hero.getName().toUpperCase().contains("E")).collect(Collectors.toList()));

        System.out.println("Existe algum herói com a letra B no nome? " + heroes.stream().anyMatch((hero) ->
                hero.getName().contains("B")));

        System.out.println("Herói de maior level = " + heroes.stream().max(Comparator.comparingInt(Hero::getLevel)));
        System.out.println("Herói de menor level = " + heroes.stream().min(Comparator.comparingInt(Hero::getLevel)));

    }
}
