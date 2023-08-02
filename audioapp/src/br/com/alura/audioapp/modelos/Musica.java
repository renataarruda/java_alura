package br.com.alura.audioapp.modelos;

public class Musica extends Audio {
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
        ehLancamento();
    }
    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes() > 2000){
            return 10;
        } else {
            return 8;
        }
    }
}
