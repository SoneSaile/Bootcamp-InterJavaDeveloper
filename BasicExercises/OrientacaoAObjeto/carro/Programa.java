package BasicExercises.OrientacaoAObjeto.carro;

public class Programa {

    public static void main(String[] args){

        Carro mustang = new Carro("Ford", "Mustang", 2020, "GT500");

        System.out.println("Meu carro é um " + mustang.getMarca() + " " + mustang.getModelo() + " "
                + mustang.getVariante() + " ano " + mustang.getAno());
    }
}
