public abstract class Produto {
    private String nome;
    private double preco;
    private int quant;
    private double total;

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calcularTotal(){
        this.total =  this.preco * this.quant;
        return total;
   }
}
