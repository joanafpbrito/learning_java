package AirplaneLife;

public class Main {
    public static void main(String[] args) {
        JatoParticular boeing = new JatoParticular(12345,"Boeing 747",2020,15000,20.5,7.8,2.85,4,2500,950,105950,120,3000,CategoriaJato.HEAVY_JET);
        boeing.adicionarInstalacao(Instalacoes.WC);
        boeing.adicionarInstalacao(Instalacoes.WC);
        boeing.adicionarInstalacao(Instalacoes.WIFI);
        boeing.adicionarInstalacao(Instalacoes.SUITE);
        boeing.adicionarInstalacao(Instalacoes.TOMADAS);

        JatoParticular gulfstream = new JatoParticular(99112,"Gulfstream",1998,1100,7.9,3.5,1.5,2,950,780,90200,12,500,CategoriaJato.LIGHT_JET);
        gulfstream.adicionarInstalacao(Instalacoes.WIFI);
        gulfstream.adicionarInstalacao(Instalacoes.WC);
        gulfstream.adicionarInstalacao(Instalacoes.SUITE);

        AviaoCombate f17 = new AviaoCombate(111,"F17",2005,760,5.2,3,0.9,1,1500,1950,900500,"USA",true);
        f17.adicionarArma(Arma.METRALHADORAS);
        f17.adicionarArma(Arma.FOGUETES);
        f17.adicionarArma(Arma.MISSEIS);
        f17.adicionarArma(Arma.BOMBAS);
    }
}
