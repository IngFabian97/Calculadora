package main.java.calculadora;

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
    }

}
