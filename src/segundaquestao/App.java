package segundaquestao;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int[] lados = new int[3];
        for(int i=0; i<3; i++){
            try {
                String input=JOptionPane.showInputDialog("Digite um dos lados do triângulo:");
                if(input==null){
                    break;
                }
                lados[i] = Integer.parseInt(input);
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números!");
                i--;
            }
        }
        if(triangulo(lados)){
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
            }else if(lados[0]!=lados[1] && lados[1]!=lados[2] && lados[0]!=lados[2]){
                JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
            }else {
                //eu até poderia fazer a verificação desse aqui, mas os outros dois já excluem essa necessidade
                //caso fosse necessário a verificação que eu faria seria 
                //if(((lados[1]==lados[0]) && lados[1]!=lados[2])||((lados[2]==lados[1])&& lados[2]!=lados[0])|| ((lados[2]==lados[0])&& lados[0]!=lados[1]))
                JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Os números não formam um triângulo");
        }

    }
    static boolean triangulo(int[] lados){
        return (lados[0]+lados[1]>lados[2]) && (lados[1]+lados[2]>lados[0]) && (lados[0]+lados[2]>lados[1]);
    }
}
