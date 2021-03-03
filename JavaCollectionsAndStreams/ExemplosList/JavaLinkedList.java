package ExemplosList;

import java.util.*;

public class JavaLinkedList {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Karina");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        //Utilizando o element() para jogar uma excesão caso a fila esteja vazia
        //String primeiroCliente = filaBanco.element();
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

    }
}
