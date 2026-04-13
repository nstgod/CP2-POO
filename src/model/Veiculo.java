package model;

public class Veiculo {
    private String placa;
    private double capacidadeEmKg;

    public Veiculo(String placa, double capacidadeEmKg){
        this.placa = placa;
        setCapacidadeEmKg(capacidadeEmKg);
    }

    public String getPlaca(){
        return this.placa;
    }

    public double getCapacidadeEmKg(){
        return this.capacidadeEmKg;
    }

    private void setCapacidadeEmKg(double capacidadeEmKg){
        if(capacidadeEmKg > 0){
            this.capacidadeEmKg = capacidadeEmKg;
        } else {
            System.out.println("ERRO: Capacidade inválida");
            this.capacidadeEmKg = 0.0;
        }
    }
}
