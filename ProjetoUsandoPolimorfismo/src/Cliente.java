public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private int limite;
    private boolean especial;

    public Cliente(String nome, String telefone, String endereco, int limite, boolean especial) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limite = limite;
        this.especial = especial;
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

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
