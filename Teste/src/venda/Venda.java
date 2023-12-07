package venda;

import java.util.ArrayList;
import java.util.List;
public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente, List<ItemVenda> itens, double valorVenda, double valorDesconto) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorVenda = valorVenda;
        this.valorDesconto = valorDesconto;
    }

    // Getters e Setters (Métodos de Acesso)
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularTotalComDesconto(){
        return (this.valorVenda - this.valorDesconto);

    }


}
