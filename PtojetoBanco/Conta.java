class Conta{
  private Pessoa titular;
  private String nro;
  private String agencia;
  private int banco;
  private double saldo;//Não foi criado SET para saldo

  public Conta(Pessoa titular, String nro, String agencia, int banco){
    this.titular = titular;
    this.nro = nro;
    this.agencia = agencia;
    this.banco = banco;
    this.saldo = 0.0; //inicializar variável
  }


  public Conta(Pessoa titular, String nro){
    this.titular = titular;
    this.nro = nro;
    this.agencia = "123";
    this.banco = 001;
    this.saldo = 0.0;
  }

  public Pessoa getTitular() {
    return this.titular;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

  public String getNro() {
    return this.nro;
  }

  public void setNro(String nro) {
    this.nro = nro;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public int getBanco() {
    return this.banco;
  }

  public void setBanco(int banco) {
    this.banco = banco;
  }

  public double getSaldo(){
    return this.saldo;
  }
  
  public boolean sacar(double valor){
    if(valor > 0 && saldo >= valor){
      saldo = saldo - valor;
      return true;
    }
    return false;
  }

  public boolean depositar(double valor){
    if(valor > 0 ){
      saldo = saldo + valor;
      return true;
    }
    return false;
  }

  public boolean transferir(double valor, Conta contaDestino){
    if(this.sacar(valor)){
      contaDestino.depositar(valor);
      return true;
    }
    return false;
  }
}