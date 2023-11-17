public class ContaEmpresarial extends Conta{
    private double chequeEspecial;
    private PessoaJuridica pessoa;
    public ContaEmpresarial(String numeroDaConta, double saldo, Cliente titular, PessoaJuridica pessoa, double chequeEspecial) {
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

    public PessoaJuridica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaJuridica pessoa) {
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
