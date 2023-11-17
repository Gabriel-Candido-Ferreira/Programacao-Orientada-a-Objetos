public class Teses extends Publicacoes {
    private String resumo;
    private String numeroDapagina;
    private String dataDeDefesa;
    private String instituicao;

    public Teses(String titulo, String dataDePublicacao, double multa, boolean disponivel, String resumo, String numeroDapagina, String dataDeDefesa, String instituicao) {
        super(titulo, dataDePublicacao, multa, disponivel);

        this.resumo = resumo;
        this.numeroDapagina = numeroDapagina;
        this.dataDeDefesa = dataDeDefesa;
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public boolean addAutor(Autor autor) {
        if (super.getAutores().size() == 1) {
            return false;
        }
        return this.getAutores().add(autor);

    }
}