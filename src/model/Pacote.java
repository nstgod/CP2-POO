package model;

public class Pacote {

    private String codigoRastreio;
    private double pesoEmKg;
    private String status;

    public Pacote(String codigoRastreio, double pesoEmKg){
        this.codigoRastreio = codigoRastreio;
        setPesoEmKg(pesoEmKg);
        this.status = "Pendente";
    }

    public String getCodigoRastreio(){
        return this.codigoRastreio;
    }

    public double getPesoEmKg(){
        return this.pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg){
        if (pesoEmKg > 0) {
            this.pesoEmKg = pesoEmKg;
        } else {
            System.out.println("ERRO: Peso inválido");
        }
    }

    public String getStatus(){
        return this.status;
    }

    public void atualizarStatus(String novoStatus) {
        status = novoStatus;
    }
}

