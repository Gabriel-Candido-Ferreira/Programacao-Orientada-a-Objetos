public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int emprestimo;

    public Pessoa(String nome, String telefone, String endereco, int emprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.emprestimo = emprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
    }
}
