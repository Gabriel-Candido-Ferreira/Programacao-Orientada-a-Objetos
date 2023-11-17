public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorDeLocacao;
    private double valorAdicional;
    private int cotaDeRenovacao;
    private boolean disponivel;

    public Carro(String marca, String modelo, String placa, int ano, double valorDeLocacao, double valorAdicional, int cotaDeRenovacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDeLocacao = valorDeLocacao;
        this.valorAdicional = valorAdicional;
        this.cotaDeRenovacao = cotaDeRenovacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public double getValorDeLocacao() {
        return valorDeLocacao;
    }

    public void setValorDeLocacao(double valorDeLocacao) {
        this.valorDeLocacao = valorDeLocacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getCotaDeRenovacao() {
        return cotaDeRenovacao;
    }

    public void setCotaDeRenovacao(int cotaDeRenovacao) {
        this.cotaDeRenovacao = cotaDeRenovacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void devolver(){
        this.disponivel =true;
        this.cotaDeRenovacao = 0;
    }
}