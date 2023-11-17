public class PessoaFisica extends Cliente{
    private String cpf;
    public PessoaFisica(String nome, String telefone, String endereco, int limite, boolean especial, String cpf) {
        super(nome, telefone, endereco, 3, false);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
