package br.ufpb.dcx.aps.atividades.a01;

public class ItemPedido{
    Produto produto;   
    int quantidade; 
   
    public Produto ItemPedido(Produto x){
        this.produto = x;
        this.quantidade = 1;
    
    }
    public Produto ItemPedido(Produto x, int a){
        this.produto = x;
        this.quantidade= a;

    }
    public Produto getProduto();{
        return this.produto;

    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public double getTotal(){
        return this.quantidade * this.produto. getValor();
    }
}
