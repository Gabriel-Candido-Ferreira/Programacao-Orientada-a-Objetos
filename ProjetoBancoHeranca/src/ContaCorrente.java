public class ContaCorrente extends Conta{
    private PessoaFisica pessoa;

    public ContaCorrente(String numeroDaConta, double saldo, Cliente titular, PessoaFisica pessoa ) {
        super(numeroDaConta, saldo, titular);
        this.pessoa = pessoa;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }
    public boolean sacar(double valor){
        if(valor > 0 && getSaldo() >= valor){
            super.setSaldo(getSaldo() - valor);
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
