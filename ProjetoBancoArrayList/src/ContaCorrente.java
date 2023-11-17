public class ContaCorrente {
    private Pessoa titular;
    private int numero;
    private double saldo;

    public ContaCorrente(Pessoa titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean sacar(double valor ){
        if(valor <= this.saldo && valor > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Conta "+ this.numero+": Saque realizado com sucesso!");
            return true;
        }
        System.out.println("Conta "+ this.numero+": Erro ao realizar o saque!");
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Conta "+ this.numero+": Deposito realizado com sucesso!");
            return true;
        }
        System.out.println("Conta "+ this.numero+": Erro ao realizar o depositar!");
        return false;
    }

    public boolean transferir(double valor, ContaCorrente contaDestino){
        System.out.println("Conta "+ this.numero+": Iniciou a transferencia");
        if(this.sacar(valor)){
            if(contaDestino != null && contaDestino.depositar(valor)){
                System.out.println("Conta "+ this.numero+": Transferencia concluida");
                return true;
            }
            System.out.println("Conta "+ this.numero+": Erro na transferencia");
            return false;
        }
        System.out.println("Conta "+ this.numero+": Erro na transferencia");
        return false;
    }

    public void extrato(){
        System.out.println("<<<<< Dados da Conta >>>>>");
        System.out.println("Nome titular: "+this.titular.getNome());
        System.out.println("Número conta: "+this.numero);
        System.out.println("Saldo R$"+this.saldo);
        System.out.println("-------------------------------\n\n");
    }
}
