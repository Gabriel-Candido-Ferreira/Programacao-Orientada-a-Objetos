import java.time.LocalDateTime;
import java.time.Period;

public class Emprestimo {
    private Publicacoes publicacoes;
    private Usuario usuario;
    private LocalDateTime dataDeSaida;
    private LocalDateTime dataDeEntrada;
    private int maxRenovacao;
    private LocalDateTime hoje;

    public Emprestimo(Publicacoes publicacoes, Usuario usuario) {
        this.publicacoes = publicacoes;
        this.usuario = usuario;
        this.hoje = LocalDateTime.now();
    }

    public Publicacoes getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacoes publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(LocalDateTime dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public LocalDateTime getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDateTime dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public int getMaxRenovacao() {
        return maxRenovacao;
    }

    public void setMaxRenovacao(int maxRenovacao) {
        this.maxRenovacao = maxRenovacao;
    }

    public boolean alugar(Usuario usuario, Publicacoes publicacoes){
        if (usuario.getClass().equals(UsuarioPadrao.class)){
            UsuarioPadrao usuarioPadrao = (UsuarioPadrao)usuario;
            if (usuarioPadrao.getMaxDelocacao()<1){
                if(publicacoes.isLocado()==false){
                    publicacoes.setLocado(true);
                    usuarioPadrao.setMaxDelocacao(1);
                    this.dataDeEntrada = LocalDateTime.now();
                    this.dataDeSaida = this.dataDeEntrada.plusDays(7);
                    return true;
                }else return false;
            }return false;
        }
        UsuarioEspecial usuarioEspecial = (UsuarioEspecial)usuario;
        if (publicacoes.isLocado()==false){
            publicacoes.setLocado(true);
            this.dataDeEntrada = LocalDateTime.now();
            this.dataDeSaida = this.dataDeEntrada.plusDays(7);
            return true;
        }
        return true;
    }
    public boolean renovar(Publicacoes publicacoes){
        if (this.maxRenovacao<=3){
            this.maxRenovacao++;
            this.dataDeSaida = LocalDateTime.now().plusDays(7);
            return true;
        }return false;
    }
    public boolean devolver(Usuario usuario, Publicacoes publicacoes){

        if (publicacoes.isLocado()==true){
            if (usuario.getClass().equals(UsuarioPadrao.class)){
                UsuarioPadrao usuarioPadrao = (UsuarioPadrao)usuario;
                usuarioPadrao.setMaxDelocacao(usuarioPadrao.getMaxDelocacao()-1);
                publicacoes.setLocado(false);
                multa();
                return true;
            }
            publicacoes.setLocado(true);
            multa();
            return true;

        }return false;
    }
    public double multa(){
        Period periodo = Period.between(dataDeSaida.toLocalDate(), hoje.toLocalDate());
        if (periodo.getDays()<0){
            return -periodo.getDays()* publicacoes.getMulta();
        }
        return 0.0;
    }
}