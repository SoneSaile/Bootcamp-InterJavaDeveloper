package JavaAlgoritmosBasicos.imc;

import JavaAlgoritmosBasicos.pessoa.Pessoa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadorIMC {

    public BigDecimal calcular(final Pessoa pessoa){
        final var altura = pessoa.getAltura();
        var imc = pessoa.getPeso() / (altura * altura);

        BigDecimal bd = new BigDecimal(imc).setScale(2, RoundingMode.HALF_EVEN);
        return bd;
    }
}
