package quartaquestao;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double primeiroNumero;
        double segundoNumero;
        primeiroNumero = getNumero("Digite o primeiro número:");
        
        double result = 0;
        String input = "";
        while((!input.equals("+"))&&(!input.equals("-"))&&(!input.equals("/"))&&(!input.equals("*"))){
            input = JOptionPane.showInputDialog("Digite a operação: (+, -, /, *)");
            if(input==null){
                break;
            }
            
        }
        segundoNumero = getNumero("Digite o segundo número: ");
        if(input!=null){
             switch (input) {
            case "+":
                result = primeiroNumero+segundoNumero;
                break;
            case "-":
                result = segundoNumero-primeiroNumero;
                break;
            case "*":
                result = primeiroNumero*segundoNumero;
                break;
            case "/":
                if(segundoNumero!=0){
                    result = primeiroNumero/segundoNumero;
                }else{JOptionPane.showMessageDialog(null, "Não é possível dividir por 0");}
                break;
        }
        JOptionPane.showMessageDialog(null, "O seu resultado foi: " + result);
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível concluir a operação");
        }
    }
    static double getNumero(String mensagem){
        while(true){
             try {
                String input = JOptionPane.showInputDialog(mensagem);
                if(input==null){
                    break;
                }
                input = input.replace(",", ".");
                return Double.parseDouble(input);
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números!");
            }
        }
        return 0;
    }
}
