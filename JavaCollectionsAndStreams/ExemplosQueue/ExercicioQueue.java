package ExemplosQueue;

import java.util.*;

public class ExercicioQueue {

    public static void main(String[] args){

        Queue<String> lane = new LinkedList<>();

        lane.add("Bristleback");
        lane.add("Outworld Devourer");
        lane.add("Magnus");
        lane.add("Ursa");
        lane.add("Batrider");

        for (String hero: lane) {
            System.out.println(hero);
        }
        System.out.println(lane);

        System.out.println(lane.peek());
        System.out.println(lane);
        System.out.println(lane.poll());
        System.out.println(lane);

        lane.add("Invoker");
        System.out.println(lane);
        System.out.println(lane.size());
        System.out.println(lane.isEmpty());
        System.out.println(lane.contains("Bristleback"));

    }

}
