package JavaCollectionsAndStreams.ExemplosSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args){

        TreeSet<String> treeCidades = new TreeSet<>();

        treeCidades.add("Stormwind");
        treeCidades.add("Orgrimmar");
        treeCidades.add("Ironforge");
        treeCidades.add("Durotar");
        treeCidades.add("Ahn'qiraj");
        treeCidades.add("Dazar'alor");

        System.out.println(treeCidades);

        System.out.println(treeCidades.first());
        System.out.println(treeCidades.last());
        System.out.println(treeCidades.lower("Durotar"));
        System.out.println(treeCidades.higher("Durotar"));
        System.out.println(treeCidades.pollFirst());
        System.out.println(treeCidades.pollLast());

        System.out.println(treeCidades);

        Iterator<String> iterator = treeCidades.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String cidade: treeCidades) {
            System.out.println("--> " + cidade);
        }

        System.out.println(treeCidades.size());
        System.out.println(treeCidades.contains("Durotar"));
    }
}
