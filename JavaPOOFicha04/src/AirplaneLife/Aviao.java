package AirplaneLife;

public class Aviao {
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double pesoKg;
    private double compfuselagem;
    private double envAsas;
    private double altCauda;
    private int numMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double pesoKg, double compfuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.compfuselagem = compfuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }
}
