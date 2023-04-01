import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField display;
    private JButton um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero;
    private JButton soma, subtrai, multiplica, divide, igual, limpa;

    private double num1 = 0, num2 = 0, resultado = 0;
    private String operador = "";

    public Calculadora() {
        setTitle("Calculadora");
        setSize(500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o display de texto
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Cria os botões numéricos
        JPanel numeros = new JPanel();
        numeros.setLayout(new GridLayout(4, 3));

        um = new JButton("1");
        dois = new JButton("2");
        tres = new JButton("3");
        quatro = new JButton("4");
        cinco = new JButton("5");
        seis= new JButton("6");
        sete = new JButton("7");
        oito = new JButton("8");
        nove = new JButton("9");
        zero = new JButton("0");

        numeros.add(um);
        numeros.add(dois);
        numeros.add(tres);
        numeros.add(quatro);
        numeros.add(cinco);
        numeros.add(seis);
        numeros.add(sete);
        numeros.add(oito);
        numeros.add(nove);
        numeros.add(zero);

        add(numeros, BorderLayout.CENTER);

        // Cria os botões de operação
        JPanel operacoes = new JPanel();
        operacoes.setLayout(new GridLayout(5, 1));

        soma = new JButton("+");
        subtrai = new JButton("-");
        multiplica = new JButton("*");
        divide = new JButton("/");
        igual = new JButton("=");

        operacoes.add(soma);
        operacoes.add(subtrai);
        operacoes.add(multiplica);
        operacoes.add(divide);
        operacoes.add(igual);

        add(operacoes, BorderLayout.EAST);

        // Cria o botão de limpar
        limpa = new JButton("C");
        add(limpa, BorderLayout.SOUTH);
        // Adiciona ouvintes de eventos aos botões
        um.addActionListener(this);
        dois.addActionListener(this);
        tres.addActionListener(this);
        quatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        sete.addActionListener(this);
        oito.addActionListener(this);
        nove.addActionListener(this);
        zero.addActionListener(this);
        soma.addActionListener(this);
        subtrai.addActionListener(this);
        multiplica.addActionListener(this);
        divide.addActionListener(this);
        igual.addActionListener(this);
        limpa.addActionListener(this);

        setVisible(true);
    }

    // Implementa a interface ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == um) {
            display.setText(display.getText() + "1");
        } else if (e.getSource() == dois) {
            display.setText(display.getText() + "2");
        } else if (e.getSource() == tres) {
            display.setText(display.getText() + "3");
        } else if (e.getSource() == quatro) {
            display.setText(display.getText() + "4");
        } else if (e.getSource() == cinco) {
            display.setText(display.getText() + "5");
        } else if (e.getSource() == seis) {
            display.setText(display.getText() + "6");
       } else if (e.getSource() == sete) {
            display.setText(display.getText() + "7");
        } else if (e.getSource() == oito) {
            display.setText(display.getText() + "8");
        } else if (e.getSource() == nove) {
            display.setText(display.getText() + "9");
        } else if (e.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (e.getSource() == soma) {
            num1 = Double.parseDouble(display.getText());
            operador = "+";
            display.setText("");
        } else if (e.getSource() == subtrai) {
            num1 = Double.parseDouble(display.getText());
            operador = "-";
            display.setText("");
        } else if (e.getSource() == multiplica) {
            num1 = Double.parseDouble(display.getText());
            operador = "*";
            display.setText("");
        } else if (e.getSource() == divide) {
            num1 = Double.parseDouble(display.getText());
            operador = "/";
            display.setText("");
        } else if (e.getSource() == igual) {
            num2 = Double.parseDouble(display.getText());
            if (operador.equals("+")) {
                resultado = num1 + num2;
            }else if (operador.equals("-")) {
                resultado = num1 - num2;
            } else if (operador.equals("*")) {
                resultado = num1 * num2;
            } else if (operador.equals("/")) {
                resultado = num1 / num2;
            }
            display.setText("" + resultado);
            num1 = resultado;
        } else if (e.getSource() == limpa) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            resultado = 0;
            operador = "";
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}