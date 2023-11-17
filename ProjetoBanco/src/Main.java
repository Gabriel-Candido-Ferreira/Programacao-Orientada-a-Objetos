import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta movimentaçao = new Conta();
        Scanner scann = new Scanner(System.in);


        while (movimentaçao.operaçao != 5){
            System.out.println("-----Banco do Candim-----");
            System.out.println("DIGITE:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Finalizar operação");

            System.out.print("");
            movimentaçao.operaçao = scann.nextInt();

            switch (movimentaçao.operaçao){
                case 1:
                    movimentaçao.sacarOperaçao();
                    movimentaçao.continuarOperaçao();
                    break;
                case 2:
                    movimentaçao.depositarOperaçao();
                    movimentaçao.continuarOperaçao();
                    break;
                case 3:
                    movimentaçao.transferirOperaçao();
                    movimentaçao.continuarOperaçao();
                    break;
                case 4:
                    System.out.printf("O valor do seu saldo atual é: R$ %.2f %n",movimentaçao.saldoConta1);
                    movimentaçao.continuarOperaçao();
                    break;
                case 5:
                    movimentaçao.printPrincipal();
                    System.out.println("OBRIGADO POR UTILIZAR OS SERVIÇOS DO BANCO DO CANDIM5");
                    break;
            }
        }
    }
}