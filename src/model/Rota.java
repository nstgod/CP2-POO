package model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacote, Veiculo veiculoUtilizado){
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public void iniciarRota() {
        System.out.println("\n--- RESUMO DA ROTA ---");
        System.out.println("Iniciando entrega do pacote: " + this.pacote.getCodigoRastreio());
        System.out.println("Veículo alocado: Placa: " + this.veiculoUtilizado.getPlaca());
        System.out.println("------------------------\n");
    }
}

