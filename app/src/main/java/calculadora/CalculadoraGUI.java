package calculadora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.JobAttributes;

import javax.swing.JButton;
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
        

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        add(panel, BorderLayout.CENTER);

        String[] buttons = {
            "7","8","9","/",
            "4","5","6","x",
            "1","2", "3", "-",
            "0",".","=","+"
        };

        for(String text: buttons){
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD,20));
            panel.add(button);
        }
    }

}
