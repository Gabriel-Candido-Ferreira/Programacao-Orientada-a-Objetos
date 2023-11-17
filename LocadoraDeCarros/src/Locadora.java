import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefome;
    ArrayList< Carro> carros;
    ArrayList<Emprestimo> emprestimos;
    ArrayList<Pessoa> pessoas;

    public Locadora(String nome, String endereco, String telefome) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefome = telefome;
        this.carros = new ArrayList<Carro>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.pessoas = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefome() {
        return telefome;
    }

    public void setTelefome(String telefome) {
        this.telefome = telefome;
    }

    public boolean addCarro(Carro carro){
        return this.carros.add(carro);
    }

    public boolean removerCarro(Carro carro){
        return this.carros.remove(carro);
    }

    public boolean addEmprestimo(Emprestimo emprestimo){
        return this.emprestimos.add(emprestimo);
    }

    public boolean removerEmprestimo(Emprestimo emprestimo){
        return this.emprestimos.remove(emprestimo);
    }

    public boolean addPessoa(Pessoa pessoa){
        return this.pessoas.add(pessoa);
    }

    public boolean removerPessoa( Pessoa pessoa){
        return this.pessoas.remove(pessoa);
    }

    public boolean carroDisponivel(){
        for(int i=0; i<carros.size(); i++){
            Carro c = carros.get(i);
            if(c.isDisponivel()){
                return true;
            }
        }
        return false;
    }
}