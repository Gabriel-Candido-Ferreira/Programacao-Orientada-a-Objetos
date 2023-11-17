import java.util.ArrayList;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double totalCompra;

    public CarrinhoDeCompras(Cliente cliente, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public boolean adicionarProduto(Produto produto) {
        if (cliente.isEspecial()) return this.produtos.add(produto);
        if (cliente.getLimite() > 0) {
            cliente.setLimite(cliente.getLimite() - 1);
            return this.produtos.add(produto);
        }
        return false;
    }

    public boolean removerProduto(Produto produto) {
        return this.produtos.remove(produto);
    }

    public double calcularTotalCompra() {
        for(int i=0; i<produtos.size(); i++){
           Produto prod = produtos.get(i);
           return totalCompra += prod.calcularTotal();
        }return 0.0;
    }
}
