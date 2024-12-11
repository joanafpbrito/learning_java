package Ex_03_02;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private MarcaBarco marca;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, MarcaBarco marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe (Peixe peixeNovo) {
        if ( this.capacidadeCarga >= calcularCargaAtual()+ peixeNovo.getPeso()) {
            this.peixePescado.add(peixeNovo);
            System.out.println(peixeNovo.getEspecie() + " carregado com sucesso!");
        }else {
            System.out.println(calcularCargaAtual() + peixeNovo.getPeso() + "ultrapassa a capacidade do " + this.nome + " de " + this.capacidadeCarga);
        }
    }

    public void pescarMarisco (Marisco mariscoNovo) {

    }

    public void largarPeixe () {

    }

    public double calcularCargaAtual () {
        double cargaAtual = 0;

        for(Peixe peixeAtual : this.peixePescado) {
            cargaAtual +=peixeAtual.getPeso();
        }

        for (Marisco marsicoAtual : this.mariscoPescado) {
            cargaAtual += marsicoAtual.getPeso();
        }
        return cargaAtual;
    }
}
