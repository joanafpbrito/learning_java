package PizzariaLife;

public class Ingredientes {
    private int id;
    private String nome;
    private UnidadesMedida unimedida;
    private int calorias;

    public Ingredientes(int id, String nome, UnidadesMedida unimedida, int calorias) {
        this.id = id;
        this.nome = nome;
        this.unimedida = unimedida;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public UnidadesMedida getUnimedida() {
        return unimedida;
    }

    public int getCalorias() {
        return calorias;
    }
}
