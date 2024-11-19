package calculadora;

import javax.swing.JTextField;

public class CalculadoraLogica {
    private double num1, num2, result;
    private char operator;

    public void processCommand(String command, JTextField display){
        if(command.charAt(0)>='0'&& command.charAt(0)<='9' || command.equals(".")){
            display.setText(display.getText()+command);
        }else if(command.equals("+")||command.equals("-")||command.equals("x")||command.equals("/")){
            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);

            display.setText("");

           
        }else if(command.equals("=")){
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case 'x':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;      
                default:
                    break;
            }
            display.setText(String.valueOf(result));
        }
        

    } 

}
