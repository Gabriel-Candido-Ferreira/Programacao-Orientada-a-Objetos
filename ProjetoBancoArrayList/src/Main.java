import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> lista = new ArrayList<ContaCorrente>();
        Scanner scann = new Scanner(System.in);
        int n = 1;
        for(int i=0; i<2;i++) {
            System.out.println("<<<<<BANCO DO CANDIM>>>>>" );
            System.out.println("*** CRIANDO CONTA " + n++ + " ***");
            System.out.println("DIGITE:");
            System.out.println("Digite seu nome:");
            String nome = scann.next();
            System.out.println("DIgite o numero da sua conta:");
            int numero = scann.nextInt();
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            Pessoa titular = new Pessoa(nome);
            lista.add(new ContaCorrente(titular, numero));
        }

        System.out.println("<<<<<BANCO DO CANDIM>>>>>");
        System.out.println("DIGITE:");
        System.out.println("DIgite o numero da sua conta:");
        int numero = scann.nextInt();
        ContaCorrente contaDestino;
        double valor;
        for (int index=0; index < lista.size();index++){
            if (numero == lista.get(index).getNumero()){
                ContaCorrente logcerto = lista.get(index);
                int movimentaçoes = 0;
                while (movimentaçoes != 5){
                    System.out.println("-----Banco do Candim-----");
                    System.out.println("DIGITE:");
                    System.out.println("1 - Sacar");
                    System.out.println("2 - Depositar");
                    System.out.println("3 - Transferir");
                    System.out.println("4 - Consultar saldo");
                    System.out.println("5 - Finalizar operação");
                    System.out.print("");
                    movimentaçoes = scann.nextInt();

                    switch (movimentaçoes){
                        case 1:
                            System.out.println("-----Banco do Candim-----");
                            System.out.println("DIGITE:");
                            System.out.println("Digite o valor que deseja sacar:");
                            valor = scann.nextDouble();
                            logcerto.sacar(valor);
                            break;
                        case 2:
                            System.out.println("-----Banco do Candim-----");
                            System.out.println("DIGITE:");
                            System.out.println("Digite o valor que deseja depositar:");
                            valor = scann.nextDouble();
                            logcerto.depositar(valor);
                            break;
                        case 3:
                            System.out.println("Digite o numero da conta destino:");
                            numero = scann.nextInt();
                            System.out.println("Digite o numero  a ser transferido:");
                            valor = scann.nextDouble();
                            for (int i=0; i < lista.size();i++){
                                if (numero == lista.get(i).getNumero()){
                                    contaDestino = lista.get(i);
                                    logcerto.transferir(valor, contaDestino);
                                }
                            }
                            break;
                        case 4:
                            logcerto.extrato();
                            break;
                        case 5:
                            System.out.println("OBRIGADO POR UTILIZAR OS SERVIÇOS DO BANCO DO CANDIM");
                            movimentaçoes = 5;
                            break;
                    }
                }
            }//else System.out.println("Conta não encontrada");
        }
        }

    }
