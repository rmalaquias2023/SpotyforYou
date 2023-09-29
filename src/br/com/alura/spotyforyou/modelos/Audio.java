package br.com.alura.spotyforyou.modelos;

import br.com.alura.spotyforyou.calculos.Classificavel;

public class Audio implements Classificavel {
    private String nome;
    private int totalDeReproducao;
    private double numeroDeCurtidas;


    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public double getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void curte() {
        this.numeroDeCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducao += 1;
    }

    @Override
    public double getClassificacao() {
        double mediaCurtidas = (this.getNumeroDeCurtidas() / getTotalDeReproducao()) * 100;
        if (mediaCurtidas <=25 ) {
            return 3;
        } else if (mediaCurtidas<=50){
            return 5;
        } else if (mediaCurtidas<= 75) {
            return 7.5;
        } else{
            return 100;
        }
    }
}