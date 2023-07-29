package br.com.alura.audioapp;

public class Musicas extends Audio {
    private String nomeArtista;
    private String album;
    private boolean lancamento = false;
    private int anoLancamento;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void ehLancamento(){
        if(anoLancamento == 2023){
            lancamento = true;
            System.out.println("Esta música é um lançamento.");
        } else {
            System.out.println("Esta música é antiga.");
        }
    }
    public void mostraFichaTecnica(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Nome do artista: " + nomeArtista);
        System.out.println("Álbum: " + album);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificacao: " + getClassificacao());
        ehLancamento();
    }
}
