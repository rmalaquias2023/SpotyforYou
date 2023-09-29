package br.com.alura.spotyforyou.principal;
import br.com.alura.spotyforyou.modelos.Audiobooks;
import br.com.alura.spotyforyou.modelos.MinhasPreferidas;
import br.com.alura.spotyforyou.modelos.Musicas;
import br.com.alura.spotyforyou.modelos.PodCasts;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setNome("Fear of The Dark");
        minhaMusica.setBanda("Iron Maiden");
        minhaMusica.setGenero("Heavy Metal");
        minhaMusica.setPaisDeOrigem("Inglaterra");
        minhaMusica.setDisco("Fear of The Dark");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curte();
        }

        PodCasts meuPodCasts = new PodCasts();
        meuPodCasts.setNome("Estudo do  Livro - O Evangelho Segundo o Espiritismo");
        meuPodCasts.setApresentador("João da Silva");

        for (int i = 0; i < 5000; i++) {
            meuPodCasts.reproduzir();
        }

        for (int i = 0; i < 5000; i++) {
            meuPodCasts.curte();
        }

        Audiobooks meuAudioBook = new Audiobooks();
        meuAudioBook.setNome("O Livro dos Espíritos");
        meuAudioBook.setAutor("Allan Kardek");
        meuAudioBook.setTema("Espiritismo");

        for (int i = 0; i < 5000; i++) {
            meuAudioBook.reproduzir();
        }

        for (int i = 0; i < 5000; i++) {
            meuAudioBook.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuAudioBook);
        preferidas.inclui(meuPodCasts);
        preferidas.inclui(minhaMusica);



    }

}