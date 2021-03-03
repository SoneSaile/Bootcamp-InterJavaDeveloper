package JavaCollectionsAndStreams.ExemplosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaArrayList {

    public static void main (String[] args){

        List<String> lista = new ArrayList<>();

        lista.add("Tusk");
        lista.add("Mirana");
        lista.add("Lina");
        lista.add("Invoker");
        lista.add("Bristleback");

        for (String nome: lista){
            System.out.println(nome);
        }

        lista.set(2, "Lifestealer");
        System.out.println(lista);
        System.out.println(lista.get(1));
        lista.remove(4);
        System.out.println(lista);
        lista.remove("Leshrac");
        System.out.println(lista);
        System.out.println(lista.size());
        boolean pudgeExiste = lista.contains("Pudge");
        System.out.println(pudgeExiste);

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Lion");
        novaLista.add("Shadow Shaman");
        System.out.println(novaLista);

        lista.addAll(2,novaLista);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        boolean novaListaVazia = novaLista.isEmpty();
        System.out.println(novaListaVazia);
    }
}
