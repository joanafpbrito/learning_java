package PizzariaLife;

import java.util.ArrayList;

public class Pizza {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizzas tamanho;
    private ArrayList<IngrePizza> ingredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizzas tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngrePizza>();
    }
}
