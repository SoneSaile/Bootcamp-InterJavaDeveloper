package BasicExercises.JavaAlgoritmosBasicos.exemplos;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("A B C D E F G".toCharArray());

        String str = new String("Have a cigar");

        char[] array = str.toCharArray();

        for (char n: array) {
            System.out.print(n);
        }
    }
}
