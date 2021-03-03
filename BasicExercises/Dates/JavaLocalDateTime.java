package BasicExercises.Dates;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class JavaLocalDateTime {

    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(hoje);
        System.out.println(ontem);

        LocalTime agora = LocalTime.now();
        LocalTime maisUmaHora = agora.plusHours(2);
        System.out.println(agora);
        System.out.println(maisUmaHora);

        LocalDateTime momento = LocalDateTime.of(2010,05,15,10,00,00,00);
        System.out.println(momento);

        LocalDateTime futuro = momento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
