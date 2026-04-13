package model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacote, Veiculo veiculoUtilizado){
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public void iniciarRota() {
        if(this.pacote.getPesoEmKg() > this.veiculoUtilizado.getCapacidadeEmKg()){
            System.out.println("❌ Erro: Rota cancelada! O pacote de " + this.pacote.getPesoEmKg() +
                    "kg excede a capacidade do veículo de " + this.veiculoUtilizado.getCapacidadeEmKg() + "kg.");
        }

        System.out.println("\n--- RESUMO DA ROTA ---");
        System.out.println("Iniciando entrega do pacote: " + this.pacote.getCodigoRastreio());
        System.out.println("Veículo alocado: Placa: " + this.veiculoUtilizado.getPlaca());
        System.out.println("------------------------\n");
    }
}

