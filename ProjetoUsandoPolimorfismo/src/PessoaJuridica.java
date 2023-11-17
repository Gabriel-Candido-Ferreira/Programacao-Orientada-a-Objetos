public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String representante;

    public PessoaJuridica(String nome, String telefone, String endereco, int limite, boolean especial,  String cnpj, String representante) {
        super(nome, telefone, endereco, 10, false);
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
