import java.util.ArrayList;

public abstract class Publicacoes {
    private String titulo;
    private String dataDePublicacao;
    private double multa;
    private boolean locado;
    private ArrayList<Autor> autores;
    private ArrayList<Publicacoes> referencias;

    public Publicacoes(String titulo, String dataDePublicacao, double multa) {
        this.titulo = titulo;
        this.dataDePublicacao = dataDePublicacao;
        this.multa = multa;
        this.locado = false;
        this.autores = new ArrayList<Autor>();
        this.referencias = new ArrayList<Publicacoes>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(String dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public boolean addAutor(Autor autor){
        return this.autores.add(autor);
    }

    public boolean removeAutor(Autor autor){
        return this.autores.remove(autor);
    }

    public boolean addPublicacao(Publicacoes publi){
        return this.referencias.add(publi);
    }

    public boolean removePublicacao(Publicacoes publi){
        return this.referencias.remove(publi);
    }

    public Publicacoes getNomeDoLivro(String nomeDoLivro){
        for(int i=0; i<referencias.size(); i++){
            Publicacoes c = referencias.get(i);
            if(c.getTitulo().equals(nomeDoLivro)){
                return c;
            }
        }
        return null;
    }
}