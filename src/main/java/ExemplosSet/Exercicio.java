package ExemplosSet;

import java.util.LinkedHashSet;

public class Exercicio {

    public static void main(String[] args){

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (Integer numero: numeros){
            System.out.println(numero);
        }

    }
}
