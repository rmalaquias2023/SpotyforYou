package br.com.alura.spotyforyou.modelos;

public class MinhasPreferidas {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getNome() + " - Este título é considerada uma das preferidas absolutas pelos usuários!");

        } else if (audio.getClassificacao() >= 5) {
            System.out.println(audio.getNome() + " - Este título também é tem bastante curtidas pelos usuários!!");
        } else {
            System.out.println(audio.getNome() + " - Este título não é muito recomendado pelos usuários!!");
        }
    }
}

