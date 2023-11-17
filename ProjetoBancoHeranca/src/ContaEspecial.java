public class ContaEspecial extends Conta{
    private PessoaFisica pessoa;
    private double chequeEspecial;
    public ContaEspecial(String numeroDaConta, double saldo, Cliente titular, PessoaFisica pessoa, double chequeEspecial) {
        super(numeroDaConta, saldo, titular);
        this.pessoa = pessoa;
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }
    public boolean sacar(double valor){
        if(valor > 0 && getSaldo() > this.chequeEspecial){
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor > 0 ){
            super.setSaldo(getSaldo() + valor);
            return true;
        }
        return false;
    }
}
