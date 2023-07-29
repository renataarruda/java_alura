package br.com.alura.audioapp.modelos;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean reproduzir = false;
    private boolean curtidoPeloUsuario = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public boolean isCurtidoPeloUsuario() {
        return curtidoPeloUsuario;
    }

    public void mostraFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificacao: " + classificacao);
    }

    public void curtir(){
        this.curtidas++;
    }
    public void reproduzir(){
        if(!this.reproduzir){
            this.reproduzir = true;
            System.out.println("Now playing");
            this.totalDeReproducoes++;
        }
    }
    public void classificar(double nota){
        System.out.println("Sua nota: " + nota);
    }
}
