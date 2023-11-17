public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(String nome, double preco, int quant, double peso) {
        super(nome, preco, quant);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularTotal(){
        if (peso<2) super.setTotal((5+getPreco())*getQuant());
        if (peso>5)super.setTotal(((this.peso*2.5)+getPreco())*getQuant());
        else super.setTotal(((10+getPreco())*getQuant()));
        return getTotal();
    }
}
