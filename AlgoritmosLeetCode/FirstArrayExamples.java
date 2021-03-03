package AlgoritmosLeetCode;

public class FirstArrayExamples {

    public static void main(String[] args) {
        int[] squareNumbers = new int[10];

        // Percorre todos os indices de 0 a 9.
        for (int i = 0; i < 10; i++) {
            // Atribui a square o valor da raiz quadrada de i
            // E atribui ao indice [i]
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }

        for (int square: squareNumbers) {
            System.out.println(square);
        }

    }
}
