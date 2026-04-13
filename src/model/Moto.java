package model;

public class Moto extends Veiculo {

    private boolean isPossuiBau;

    public Moto(String placa, double capacidade, boolean isPossuiBau) {
        super(placa, capacidade);
        this.isPossuiBau = isPossuiBau;
    }

    public boolean isPossuiBau(){
        return this.isPossuiBau;
    }
}
