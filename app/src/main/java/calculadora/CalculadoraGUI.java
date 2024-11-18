package main.java.calculadora;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraGUI extends JFrame{

    private JTextField display;
    private JPanel panel; 
    //private CalculadoraLogica calculadoraLogica;

    public CalculadoraGUI(){

        setTitle("Calculadora");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 50));
        add(display,BorderLayout.NORTH);
        
    }

}
