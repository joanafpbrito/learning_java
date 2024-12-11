package TheWayWeMove;

public class Camiao extends Veiculo {
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100Km, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100Km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void viagem (double distancia, double carga) {
        if (this.capacidadeCarga < carga) {
            System.out.println("Limite de carga ultrapassado. Não podemos prosseguir viagem!");
        } else if (this.capacidadeCarga > carga) {
            double totalLitros = (this.getConsumoL100Km() * distancia) / 100;

            while (carga - 100 > 0) {
                totalLitros += 0.1;
                carga = carga -100;
            }

            double totalGasto = totalLitros * 1.95;
            System.out.println("O camião vai gastar " + totalGasto + "€ na viagem.");
        }
    }
}
