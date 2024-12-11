package AirplaneLife;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double pesoKg, double compfuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, pesoKg, compfuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal=new ArrayList<Arma>();
    }

    public void adicionarArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
            System.out.println(armaNova + " adicionada ao arsenal.");
        } else {
            System.out.println("Arsenal Cheio. Falha ao adicionar " + armaNova);
        }
    }

    public void detalhes(){
        System.out.println("********** Arsenal **********");
        System.out.println(this.arsenal);
    }
}
