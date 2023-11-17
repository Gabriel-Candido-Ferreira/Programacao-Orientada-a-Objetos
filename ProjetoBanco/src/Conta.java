import java.util.Scanner;

public class Conta {
    Scanner scan = new Scanner(System.in);
    String nomeConta1 = "Marcel da Silva Melo";
    String nomeConta2 = "Gabriel Cândido Lindo dms";
    String cpf = "07007055575";
    int numeroDaConta = 145127839;
    String instituiçao = "Banco do Candim";
    String agencia = "1513";
    int operaçao = 0;
    int operaçao2 = 0;
    double saldoConta1;
    double saldoConta2;
    double sacar;
    double transferir;


    void sacarOperaçao(){
        System.out.println("Digite o valor que deseja sacar:");
        System.out.print("");
        sacar = scan.nextDouble();
        if (sacar>saldoConta1) System.out.println("***Valor de saque indisponível*** ");
        else saldoConta1 -= sacar;
    }
    void depositarOperaçao(){
        System.out.println("Digite o valor que deseja depositar:");
        System.out.print("");
        saldoConta1 += scan.nextDouble();

    }
    void transferirOperaçao(){
        System.out.println("Digite o valor que deseja transferir para a conta de Gabriel:");
        System.out.print("");
        transferir = scan.nextDouble();
        if (transferir>saldoConta1) System.out.println("***Valor de transferencia indisponível***");
        else {
            saldoConta1 -= transferir;
            saldoConta2 += transferir;
        }
    }
    void continuarOperaçao(){
        System.out.println("--Deseja continuar a operação?--");
        System.out.println("DIGITE:");
        System.out.println("1 - Para continuar");
        System.out.println("2 - Para finalizar");
        System.out.print("");
        operaçao2 = scan.nextInt();
        if (operaçao2 == 1) ;
        else{
            printPrincipal();
            operaçao = 5;}
    }
    void printPrincipal(){
        System.out.println("Você deseja consultar os valores de sua conta é a conta que foi feita a transferencia?");
        System.out.println("DIGITE:");
        System.out.println("1 - Para Sim");
        System.out.println("2 - Para Não");
        System.out.print("");
        operaçao2 = scan.nextInt();
        if (operaçao2 == 1) {
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("NOME: "+ nomeConta1);
            System.out.println("CPF: "+ cpf);
            System.out.println("AGENCIA: "+ agencia);
            System.out.println("NUMERO DA CONTA: "+ numeroDaConta);
            System.out.println("INSTITUIÇÃO: "+ instituiçao);
            System.out.println("SEU SALDO ATUAL É: " + saldoConta1);
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("NOME: "+ nomeConta2);
            System.out.println("CPF: "+ "56423185245");
            System.out.println("AGENCIA: "+ "5413");
            System.out.println("NUMERO DA CONTA: "+ "325461987");
            System.out.println("INSTITUIÇÃO: "+ instituiçao);
            System.out.println("SEU SALDO ATUAL É: " + saldoConta2);
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
        }
    }
}