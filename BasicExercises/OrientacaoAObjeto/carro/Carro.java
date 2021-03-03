package BasicExercises.OrientacaoAObjeto.carro;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro(final String marca, final String modelo, final Integer ano, final String variante){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }
    public Carro(final String marca, final String modelo, final Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVariante() {
        return variante;
    }
}
