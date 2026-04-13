package main;

import model.*;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhaoDoNelson = new Caminhao("ABC-1234", 500, 3);
        Moto motoDoNelson = new Moto("DEF-5678", 20.0, true);

        Pacote pacote1 = new Pacote("BR999",15.0);
        Pacote pacote2 = new Pacote("BR888",2.0);

        System.out.println(">>> ROTA 1 <<<");
        Rota rotaPesada = new Rota(pacote1, caminhaoDoNelson);
        rotaPesada.iniciarRota();

        System.out.println(">>> ROTA 2 <<<");
        Rota rotaExpressa = new Rota(pacote2, motoDoNelson);
        rotaExpressa.iniciarRota();

        pacote1.atualizarStatus("Em transito");
        System.out.println("\nStatus atualizado do pacote " + pacote1.getCodigoRastreio() + ": " + pacote1.getStatus());
        }
    }

