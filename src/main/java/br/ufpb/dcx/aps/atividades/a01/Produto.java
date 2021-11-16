package br.ufpb.dcx.aps.atividades.a01;

public class Produto {
   private String nome;
   private String descricao;
   private Double valor;
 
   
   public Produto ( String nome,String descricao, Double valor){
      this.nome = nome ;
      this.descricao = descricao;
      this.valor = valor;
   }
   public Produto (){
      this.nome = "";
      this.descricao = "" ;
      this.valor = 0 ;
   }
   public String getNome (){
      return this.nome;
   }
   public String getDescricao (){
      return this.descricao; 
   }
   public Double getValor (){
      return this.valor ;
   }
   public void setNome (String nome ){
      this.nome = nome;
   }
   public void setDescricao (String descricao){
      this.descricao = descricao;
   }
   public void setValor (double valor){
      this.valor = valor;
   }
}
