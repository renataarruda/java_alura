package br.com.alura.comprasapp.modelos;

public class Compras implements Comparable<Compras> {
    private String produto;
    private double valorDoProduto;

    public Compras (String produto, double valorDoProduto){
     this.produto = produto;
      this.valorDoProduto = valorDoProduto;
    }
    public String getProduto() {
        return produto;
    }
    public double getValorDoProduto() {
        return valorDoProduto;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "produto='" + produto + '\'' +
                ", valorDoProduto=" + valorDoProduto +
                '}';
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valorDoProduto).compareTo(Double.valueOf(outraCompra.valorDoProduto));
    }

}
