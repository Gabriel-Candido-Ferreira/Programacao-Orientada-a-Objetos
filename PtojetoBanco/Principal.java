import java.util.Scanner;

public class Principal{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Banco banco = new Banco();
    
    while(true){
      System.out.println("Digite a operação desejada:");
      System.out.println("1 - Criar Conta");
      System.out.println("2 - Sacar");
      System.out.println("3 - Depositar");
      System.out.println("4 - Transferir");
      System.out.println("5 - Extrato");
      System.out.println("0 - Sair");
      int operacao = scan.nextInt();
      scan.nextLine();

      if(operacao == 0) break;
      else if(operacao == 1){
        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scan.nextLine();
        System.out.println("Digite o cpf do titular:");
        String cpfTitular = scan.nextLine();

        Pessoa titular = new Pessoa(nomeTitular, cpfTitular);

        System.out.println("Digite o numero da conta:");
        String nroConta = scan.nextLine();

        Conta c1 = new Conta(titular, nroConta);
        banco.addConta(c1);
      }else if(operacao == 2){
        System.out.println("Digite o número da conta:");
        String nroConta = scan.nextLine();
        Conta c = banco.getContaByNro(nroConta);
        if(c != null){
          System.out.println("Digite o valor do saque:");
          double valor = scan.nextDouble();

          if(c.sacar(valor)){
            System.out.println("Saque realizado com sucesso!");
          }else{
            System.out.println("Erro ao realizar o saque!");
          }
        }else{
          System.out.println("Conta não encontrada! Tente novamente.");
        }
      }else if(operacao == 3){
        System.out.println("Digite o número da conta:");
        String nroConta = scan.nextLine();
        Conta c = banco.getContaByNro(nroConta);
        if(c != null){
          System.out.println("Digite o valor do deposito:");
          double valor = scan.nextDouble();

          if(c.depositar(valor)){
            System.out.println("Deposito realizado com sucesso!");
          }else{
            System.out.println("Erro ao realizar o deposito!");
          }
        }else{
          System.out.println("Conta não encontrada! Tente novamente.");
        }
      }else if(operacao == 4){
        System.out.println("Digite o numero da conta de Origem:");
        String nroContaOrigem = scan.nextLine();
        Conta contaOrigem = banco.getContaByNro(nroContaOrigem);
        if(contaOrigem == null) {
          System.out.println("Conta Origem não encontrada! Tente novamente.");
          continue;
        }

        System.out.println("Digite o numero da conta de Destino:");
        String nroContaDestino = scan.nextLine();
        Conta contaDestino = banco.getContaByNro(nroContaDestino);
        if(contaDestino == null) {
          System.out.println("Conta Destino não encontrada! Tente novamente.");
          continue;
        }

        System.out.println("Digite o valor da Transferencia: ");
        double valor = scan.nextDouble();

        if(contaOrigem.transferir(valor, contaDestino)){
          System.out.println("Transferência realizada com sucesso!");
          
        }else{
          System.out.println("Erro ao realizar a Transferencia!");
        }


      }else if(operacao == 5){
        System.out.println("Digite o número da conta:");
        String nroConta = scan.nextLine();
        Conta c = banco.getContaByNro(nroConta);
        if(c != null){
          System.out.println("========= Extrato ========");
          System.out.println("Nome Titular: "+ c.getTitular().getNome());
          System.out.println("Nro Conta: "+ c.getNro());
          System.out.println("Saldo: R$ "+c.getSaldo());
          System.out.println("===========================");
        }else{
          System.out.println("Conta não encontrada! Tente novamente.");
        }
      }else{
        continue;
      }
    }
  }
}