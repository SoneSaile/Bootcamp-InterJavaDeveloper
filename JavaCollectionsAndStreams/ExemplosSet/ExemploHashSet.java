package JavaCollectionsAndStreams.ExemplosSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args){

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(4.2);
        notasAlunos.add(8.5);
        notasAlunos.add(6.7);
        notasAlunos.add(8.2);
        notasAlunos.add(6.4);
        notasAlunos.add(1.9);
        notasAlunos.add(8.6);
        notasAlunos.add(7.4);

        System.out.println(notasAlunos);

        notasAlunos.remove(1.9);

        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("--> " + nota);
        }
    }
}
