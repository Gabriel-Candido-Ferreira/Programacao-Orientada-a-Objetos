import java.util.ArrayList;

public class Carrinho {
  private Cliente cliente;
  private ArrayList<Produto> produtos;
  private double valorTotal;

  public Carrinho(Cliente cliente){
    this.produtos = new ArrayList<Produto>();
    this.valorTotal = 0;
  }

  public Cliente getCliente(){
    return this.cliente;
  }

  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }

  // public void alterarNomeCliente(String nome){
  //   this.cliente.setNome(nome);
  // }

  public void addProduto(Produto produto){
    //this.produtos.add(produto);
    this.valorTotal += produto.getPreco() * produto.getQtd();
  }

  public void removeProduto(Produto produto){
    //this.produtos.remove(produto);
    this.valorTotal -= produto.getPreco() * produto.getQtd();
  }

  public double getValorTotal(){
    return this.valorTotal;
  }

  public void calcularValorTotal(){
    this.valorTotal = 0;
    // for(int i=0; i<this.produtos.size(); i++){
    //   Produto p = this.produtos.get(i);
    // this.valorTotal += p.getPreco() * p.getQtd();
    // }

    for(Produto p: this.produtos){
      this.valorTotal += p.getPreco() * p.getQtd();
    }
  }

}
