public class PessoaFisica extends Pessoa{
    private String cpf;
    public PessoaFisica(String nome, String telefone, String endereco, int emprestimo, String cpf) {
        super(nome, telefone, endereco, 1);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
