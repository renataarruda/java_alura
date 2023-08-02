package br.com.alura.comprasapp.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private double limite;

    private List<Compras> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compras){
        if (this.saldo > compras.getValorDoProduto()){
            this.saldo -= compras.getValorDoProduto();
            this.compras.add(compras);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public List<Compras> getCompras() {
        return compras;
    }


}
