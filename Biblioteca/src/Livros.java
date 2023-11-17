public class Livros extends Publicacoes {
    private String numeroDeEdicao;
    private String nomeDaEditora;
    private String isbn;


    public Livros(String titulo, String dataDePublicacao, double multa, boolean disponivel, String numeroDeEdicao, String nomeDaEditora,String isbn) {
        super(titulo, dataDePublicacao, multa, disponivel);
        this.numeroDeEdicao = numeroDeEdicao;
        this.nomeDaEditora = nomeDaEditora;
        this.isbn = isbn;
    }

    public String getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(String numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public String getNomeDaEditora() {
        return nomeDaEditora;
    }

    public void setNomeDaEditora(String nomeDaEditora) {
        this.nomeDaEditora = nomeDaEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
