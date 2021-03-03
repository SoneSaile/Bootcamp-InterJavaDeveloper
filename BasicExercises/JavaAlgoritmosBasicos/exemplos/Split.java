package BasicExercises.JavaAlgoritmosBasicos.exemplos;

public class Split {
    public static void main(String[] args){
        String frase = "Aula de Java";

        String array[] = new String[3];
        array = frase.split(" ");

        for (String N: array) {

            System.out.print(" " + N);
        }
    }
}
