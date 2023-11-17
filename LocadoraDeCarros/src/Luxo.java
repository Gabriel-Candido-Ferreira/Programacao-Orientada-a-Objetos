public class Luxo extends Carro{
    private int quantidadeDeAirbags;
    private double tamanhoDoProtaMalas;
    private boolean gps;
    public Luxo(String marca, String modelo, String placa, int ano, double valorDeLocacao, double valorAdicional, int quantidadeDeAirbags, double tamanhoDoProtaMalas, boolean gps) {
        super(marca, modelo, placa, ano, valorDeLocacao, valorAdicional, 5);
        this.quantidadeDeAirbags = quantidadeDeAirbags;
        this.tamanhoDoProtaMalas = tamanhoDoProtaMalas;
        this.gps = gps;
    }

    public int getQuantidadeDeAirbags() {
        return quantidadeDeAirbags;
    }

    public void setQuantidadeDeAirbags(int quantidadeDeAirbags) {
        this.quantidadeDeAirbags = quantidadeDeAirbags;
    }

    public double getTamanhoDoProtaMalas() {
        return tamanhoDoProtaMalas;
    }

    public void setTamanhoDoProtaMalas(double tamanhoDoProtaMalas) {
        this.tamanhoDoProtaMalas = tamanhoDoProtaMalas;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public void devolver(){
        super.setDisponivel(true);
        super.setCotaDeRenovacao(5);
    }
}
