package br.com.alura.audioapp;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;
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

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }

    public boolean isCurtidoPeloUsuario() {
        return curtidoPeloUsuario;
    }

    public void setCurtidoPeloUsuario(boolean curtidoPeloUsuario) {
        this.curtidoPeloUsuario = curtidoPeloUsuario;
    }

    public void mostraFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificacao: " + classificacao);
    }

    public void curtir(){
        if(!curtidoPeloUsuario){
            curtidoPeloUsuario = true;
            curtidas++;
            System.out.println("Você curtiu este título.");
        } else {
            System.out.println("Número de curtidas: " + curtidas);
        }
    }
    public void reproduzir(){
        if(!reproduzir){
            reproduzir = true;
            System.out.println("Now playing");
        }
    }
    public void classificar(double nota){
        System.out.println("Sua nota: " + nota);
    }
}
