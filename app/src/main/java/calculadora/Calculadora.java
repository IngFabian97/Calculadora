package calculadora;

import javax.swing.SwingUtilities;

public class Calculadora {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{

            CalculadoraGUI calculadoraGUI = new CalculadoraGUI();
            calculadoraGUI.setVisible(true);
        });
    }
}
