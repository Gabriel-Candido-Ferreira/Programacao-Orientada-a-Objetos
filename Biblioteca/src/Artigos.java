public class Artigos extends Publicacoes {
    private String resumo;

    public Artigos(String titulo, String dataDePublicacao, double multa, boolean disponivel, String resumo) {
        super(titulo, dataDePublicacao, multa, disponivel);

        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}