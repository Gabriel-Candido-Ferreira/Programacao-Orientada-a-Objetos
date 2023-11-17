public class Produto {
  private String nome;
  private int qtd;
  private double preco;

  public Produto(String nome, int qtd, double preco) {
    this.nome = nome;
    this.setQtd(qtd);
    this.preco = preco;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQtd() {
    return this.qtd;
  }

  public void setQtd(int qtd) {
    if(qtd <= 0){
      this.qtd = 1;
    }else{
      this.qtd = qtd;
    }
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }


}
