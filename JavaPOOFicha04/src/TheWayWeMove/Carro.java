package TheWayWeMove;

public class Carro extends Veiculo{
    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100Km, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100Km);
        this.quantPassageiros = quantPassageiros;
    }
}
