package TheWayWeMove;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Veiculo v = new Veiculo("Mercedes","A45",2024,420,3500,TipoCombustivel.GPL,25);
        Carro c = new Carro("Mercedes","A45",2024,420,3500,TipoCombustivel.GPL,25, 4);
        Mota m = new Mota("Mercedes","A45",2024,420,3500,TipoCombustivel.GPL,25);
        Camiao ca = new Camiao("Mercedes","A45",2024,420,3500,TipoCombustivel.GPL,25, 500);

        System.out.println(v.calcularConsumo());
        System.out.println(c.calcularConsumo());
        m.imagem();
        ca.viagem(500, 500);
        ca.viagem(400, 400);

        Veiculo vencedor = ca.corrida(m);

        if ( vencedor == null) {
            System.out.println("Empate!");
        } else {
            System.out.println("Vencedor:");
            vencedor.detalhes();
        }
    }
}
