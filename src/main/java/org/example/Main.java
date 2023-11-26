package org.example;
import javax.swing.JOptionPane;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String opcao = "";
        Calculadora calculadora = new Calculadora();

        while (!opcao.equals("9")){
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração" + "\n4 - Produto \n5 - Divisão \n9 - Sair");
            switch (Integer.parseInt(opcao)){
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                    break;
            }
        }
    }
}