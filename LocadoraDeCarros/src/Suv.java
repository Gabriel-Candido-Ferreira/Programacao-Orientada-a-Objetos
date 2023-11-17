public class Suv extends Carro{
    private double tamanhoDoPortaMalas;
    private String tipoDeTracao;
    private String tipoDoCombustivel;
    public Suv(String marca, String modelo, String placa, int ano, double valorDeLocacao, double valorAdicional, double tamanhoDoPortaMalas, String tipoDeTracao, String tipoDoCombustivel) {
        super(marca, modelo, placa, ano, valorDeLocacao, valorAdicional, 3);
        this.tamanhoDoPortaMalas = tamanhoDoPortaMalas;
        this.tipoDeTracao = tipoDeTracao;
        this.tipoDoCombustivel = tipoDoCombustivel;
    }

    public double getTamanhoDoPortaMalas() {
        return tamanhoDoPortaMalas;
    }

    public void setTamanhoDoPortaMalas(double tamanhoDoPortaMalas) {
        this.tamanhoDoPortaMalas = tamanhoDoPortaMalas;
    }

    public String getTipoDeTracao() {
        return tipoDeTracao;
    }

    public void setTipoDeTracao(String tipoDeTracao) {
        this.tipoDeTracao = tipoDeTracao;
    }

    public String getTipoDoCombustivel() {
        return tipoDoCombustivel;
    }

    public void setTipoDoCombustivel(String tipoDoCombustivel) {
        this.tipoDoCombustivel = tipoDoCombustivel;
    }

    @Override
    public void devolver(){
        super.setDisponivel(true);
        super.setCotaDeRenovacao(3);
    }
}
