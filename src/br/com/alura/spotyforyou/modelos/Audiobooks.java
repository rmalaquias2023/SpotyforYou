package br.com.alura.spotyforyou.modelos;

public class Audiobooks extends Audio {
    private String autor;
    private String tema;
    private int anoDeLancamento;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLançamento) {
        this.anoDeLancamento = anoDeLançamento;
    }
}
