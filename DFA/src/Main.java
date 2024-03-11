import javax.swing.*;

public class Main {
    static int[][] transicao = {{0, 1}, {1, 0}};
    static int estadoInicial = 0;
    static int[] aceitacao = {1};

    public static void main(String[] args) {
        String cadeia = JOptionPane.showInputDialog("Digite a cadeia que sera testada");
        int estadoAtual = estadoInicial;
        int posicao = 0;

        while (posicao < cadeia.length()) {
            char elemento = cadeia.charAt(posicao);
            int elementoInt = Integer.parseInt(String.valueOf(elemento));
            estadoAtual = transicao[estadoAtual][elementoInt];
            posicao++;
        }

        boolean aceita = false;
        for (int i : aceitacao) {
            if (estadoAtual == i) {
                aceita = true;
                break;
            }
        }

        if (aceita) {
            System.out.println("Cadeia Aceita");
        } else {
            System.out.println("Cadeia Rejeitada ");
        }

        if (isDFA_Minimized()) {
            System.out.println("O autômato está minimizado.");
        } else {
            System.out.println("O autômato não está minimizado.");
        }
    }

    public static boolean isDFA_Minimized() {
        for (int i = 0; i < transicao.length; i++) {
            for (int j = i + 1; j < transicao.length; j++) {
                if (areStatesEquivalent(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean areStatesEquivalent(int state1, int state2) {
        for (int symbol = 0; symbol < transicao[0].length; symbol++) {
            int nextState1 = transicao[state1][symbol];
            int nextState2 = transicao[state2][symbol];
            if (nextState1 != nextState2) {
                return false;
            }
        }
        return true;
    }
}
