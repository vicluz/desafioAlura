package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private String nomeDoCantor;
    private String nomeDoApresentador;
    private int totalDeReproducoes;

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return  classificacao;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }



    public void exibeFichaTecnica() {

        System.out.println("Nome da Musica" + titulo);
        System.out.println("Nome do Cantor: " + nomeDoCantor);



    }

    public String getNomeDoApresentador() {
        return nomeDoApresentador;
    }

    public void setNomeDoApresentador(String nomeDoApresentador) {
        this.nomeDoApresentador = nomeDoApresentador;
    }

    public void exibeFichaTecnicaPodCast(){
        System.out.println("Nome do Podcast" + titulo);
        System.out.println("Nome do Apresentador: " + nomeDoApresentador);

    }


    public String getNomeDoCantor() {
        return nomeDoCantor;
    }

    public void setNomeDoCantor(String nomeDoCantor) {
        this.nomeDoCantor = nomeDoCantor;
    }
}
