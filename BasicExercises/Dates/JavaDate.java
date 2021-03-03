package BasicExercises.Dates;

import java.util.Date;

public class JavaDate {

    public static void main(String[] args){

        long nascimento = 861245760000L;

        Date dataNascimento = new Date(nascimento);
        System.out.println(dataNascimento);

        Date dataAnterior = new Date (2010, 05, 15);

        boolean eAnterior = dataNascimento.before(dataAnterior);
        boolean ePosterior = dataNascimento.after(dataAnterior);

        System.out.println(eAnterior);
        System.out.println(ePosterior);
    }
}
