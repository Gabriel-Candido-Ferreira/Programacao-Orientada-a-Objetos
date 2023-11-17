public class PessoaEspecial extends Cliente{
    private String docIdentificacao;

    public PessoaEspecial(String nome, String telefone, String endereco, int limite, boolean especial, String docIdentificacao) {
        super(nome, telefone, endereco, 999, true);//999 seria pr
        this.docIdentificacao = docIdentificacao;
    }

    public String getDocIdentificacao() {
        return docIdentificacao;
    }

    public void setDocIdentificacao(String docIdentificacao) {
        this.docIdentificacao = docIdentificacao;
    }
}
