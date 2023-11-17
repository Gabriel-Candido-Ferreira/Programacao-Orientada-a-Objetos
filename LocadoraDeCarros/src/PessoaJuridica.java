public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String representante;
    public PessoaJuridica(String nome, String telefone, String endereco, int emprestimo, String cnpj, String representante) {
        super(nome, telefone, endereco, -1);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}