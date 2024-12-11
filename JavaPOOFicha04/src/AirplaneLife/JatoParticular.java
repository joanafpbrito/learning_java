package AirplaneLife;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacoes> listaInstalacoes;

    public JatoParticular(int numSerie, String modelo, int anoFabrico, double pesoKg, double compfuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, pesoKg, compfuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.listaInstalacoes = new ArrayList<Instalacoes>();
    }

    public void adicionarInstalacao(Instalacoes instalacaoNova) {
        this.listaInstalacoes.add(instalacaoNova);
        System.out.println(instalacaoNova + " instalada com sucesso.");
    }

    public void detalhes() {
        System.out.println("********** Instalações **********");
        System.out.println(this.listaInstalacoes);
    }

}
