package model;

public class Caminhao extends Veiculo {
    ;
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidade, int quantidadeEixos) {
        super(placa, capacidade);
        this.setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos(){
        return this.quantidadeEixos;
    }

    private void setQuantidadeEixos(int quantidadeEixos){
        this.quantidadeEixos = quantidadeEixos;
    }
}

