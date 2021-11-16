package br.ufpb.dcx.aps.atividades.a01;
import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();

    public void  addProduto (Produto produto, int quant) {
        if (this.itens.quantProdutos > 0){
            ItemPedido x = new ItemPedido(produto, quant);
            this.itens.add(x);
        } else {
            throw new RuntimeException("a quantidade tem que ser maior zero");
        }

   }
    public void addProduto (Produto produto){
        if (produto != null) {
            ItemPedido y = new ItemPedido(produto);
            this.itens.add(y);
        } else {
            throw new RuntimeException("a quantidade tem que ser maior zero");

        }

   }
    public int quantProdutos (){
        int temp = 0 ;
        for (IntPedido w : this.itens){
            temp += 1;
        }
        return temp; 
   }
    public List<ItemPedido> getItens(){
        return this.itens;

        
    }
   
}
