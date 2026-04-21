package terceiraquestao;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double peso;
        double altura;
        peso = getResposta("Digite seu peso: (Kg)");
        altura = getResposta("Digite sua altura: (m)");
        if(peso!=0 && altura!=0){
            double imc = peso/(altura*altura);
            String resposta;
            if(imc<16){
                resposta = "Magreza Grave";
            }else if(imc>=16 && imc<17){
                resposta = "Magreza moderada";
            }else if(imc>=17 && imc<18.5){
                resposta = "Magreza leve";
            }else if(imc>=18.5 && imc<25){
                resposta = "Saudável";
            }else if(imc>=25 && imc<30){
                resposta = "Sobrepeso";
            }else if(imc>=30 && imc<35){
                resposta = "Obesidade Grau 1";
            }else if(imc>=35 && imc<40){
                resposta = "Obesidade Grau 2 (Severa)";
            }else{
                resposta = "Obesidade Grau 3 (mórbida)";
            }
            JOptionPane.showMessageDialog(null, "Sua classificação é: "+resposta);
        }
    }
    static double getResposta(String mensagem){
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
