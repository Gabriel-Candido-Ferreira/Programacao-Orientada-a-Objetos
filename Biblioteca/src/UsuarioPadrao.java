public class UsuarioPadrao extends Usuario{
    private int maxDelocacao;
    public UsuarioPadrao(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
        this.maxDelocacao = 0;
    }

    public int getMaxDelocacao() {
        return maxDelocacao;
    }

    public void setMaxDelocacao(int maxDelocacao) {
        this.maxDelocacao = maxDelocacao;
    }
}
