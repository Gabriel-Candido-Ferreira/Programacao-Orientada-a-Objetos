import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Emprestimo {
    private  Pessoa pessoa;
    private Carro carro;
    private double multa;
    private LocalDateTime dataDeSaida;
    private LocalDateTime dataDeEntrada;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
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


    public Emprestimo(Pessoa pessoa, Carro carro) {
        if (carro.isDisponivel()){
            if (pessoa.getEmprestimo()<0 || pessoa.getEmprestimo()== 1){
                this.carro = carro;
                this.pessoa = pessoa;
                this.multa = 0;
                this.dataDeEntrada = LocalDateTime.now();
                this.dataDeSaida = this.dataDeEntrada.plusDays(7);
                this.carro.setDisponivel(false);
                this.pessoa.setEmprestimo(-1);
            }else throw new PessoaException("Emprestimo não disponivel para usuario");
        }else throw new CarroException("Carro indisponivel");
    }

    public void renovar(){
            this.dataDeSaida = LocalDateTime.now().plusDays(7);
            this.carro.setCotaDeRenovacao(carro.getCotaDeRenovacao() - 1);
    }

    public void calcularMulta(){
        if (this.carro.getCotaDeRenovacao()<0){
            this.multa = this.carro.getValorDeLocacao()+(-this.carro.getValorAdicional()*this.carro.getCotaDeRenovacao());
        } this.multa = this.carro.getValorDeLocacao();
    }

    public void devolver(){
        if (pessoa.getEmprestimo() == 0){
            this.carro.setDisponivel(true);
            this.pessoa.setEmprestimo(pessoa.getEmprestimo() +1);
            calcularMulta();
        }
        this.carro.setDisponivel(true);
        calcularMulta();

    }
}
