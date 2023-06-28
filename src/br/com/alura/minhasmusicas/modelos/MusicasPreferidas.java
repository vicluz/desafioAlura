package br.com.alura.minhasmusicas.modelos;

public class MusicasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+ " È uma das Programações Preferidas.");
        }else {
            System.out.println(audio.getTitulo() + " Está no meu top 20");

        }
    }

}
