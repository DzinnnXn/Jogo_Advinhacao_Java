import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de adivinhação!");

        String[] menu = {"Jogar", "Sair"};
        String menuInicial = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]);

        switch (menuInicial) {
            case "Jogar":
                JogoAdivinhacao jogo = new JogoAdivinhacao();
                jogo.jogar();
                break;
            case "Sair":
                JOptionPane.showMessageDialog(null, "Até mais!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
