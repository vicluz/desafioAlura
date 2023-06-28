package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.MusicasPreferidas;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo(" Love Love");
        minhaMusica.setNomeDoCantor("Mc Melody Ft Naldo Benny");



        minhaMusica.exibeFichaTecnica();



        for (int i=0; i < 1000; i++ ) {
            minhaMusica.reproduz();

        }
        for (int i=0; i<50 ; i++){
            minhaMusica.curte();

        }

        Podcast podcast = new Podcast();
        podcast.setTitulo(" Flow Podcast ");
        podcast.setNomeDoApresentador("Igor 3K");
        podcast.exibeFichaTecnicaPodCast();


        for (int i=0; i < 5000; i++ ) {
            podcast.reproduz();

        }
        for (int i=0; i<1000 ; i++){
            podcast.curte();

        }

        MusicasPreferidas preferidas = new MusicasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);

    }


}
