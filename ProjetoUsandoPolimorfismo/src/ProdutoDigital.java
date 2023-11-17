public class ProdutoDigital extends Produto{
    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quant, int tamanhoArquivo) {
        super(nome, preco, quant);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public double calcularTotal(){
        super.setTotal(getPreco()*getQuant()*1);
        return getTotal();
    }
}
