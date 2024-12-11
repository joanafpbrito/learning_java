package TheWayWeMove;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    public double getConsumoL100Km() {
        return consumoL100Km;
    }

    public String getMarca() {
        return marca;
    }

    public void ligar() {
        System.out.println("O carro está ligado...");
    }

    public Veiculo corrida( Veiculo adversario) {
        if ( this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;
        }else {

            if(this.cilindrada > adversario.cilindrada) {
                return this;
            } else if ( this.cilindrada < adversario.cilindrada) {
                return adversario;
            } else {

                if (this.anoFabrico > adversario.anoFabrico) {
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    return adversario;
                } else {
                    return null;
                }
            }
        }
    }

    public double calcularConsumo() {
        double consumo = 0;
        switch (this.combustivel) {
            case TipoCombustivel.GASOLINA -> consumo = this.consumoL100Km * 2.10;
            case TipoCombustivel.DIESEL -> consumo = this.consumoL100Km * 1.95;
            case TipoCombustivel.GPL -> consumo = this.consumoL100Km * 1.15;
            case TipoCombustivel.ELETRICO -> consumo = this.consumoL100Km * 0.12;
        }
        return consumo;
    }

    public void detalhes() {
        System.out.println(this.marca + " | " + this.modelo );
    }


}
