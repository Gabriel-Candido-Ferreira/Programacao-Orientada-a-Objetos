public class Popular extends Carro {

    private boolean arcondicionado;
    public Popular(String marca, String modelo, String placa, int ano, double valorDeLocacao, double valorAdicional, boolean arcondicionado) {
        super(marca, modelo, placa, ano, valorDeLocacao, valorAdicional,1);
        this.arcondicionado = arcondicionado;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    @Override
    public void devolver(){
        super.setDisponivel(true);
        super.setCotaDeRenovacao(1);
    }
}
