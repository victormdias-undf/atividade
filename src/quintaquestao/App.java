package quintaquestao;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int opcao = 0;
        
       while (true) { 
        while(opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4 && opcao !=5){
            opcao = getNumero("Digite uma das opções:\n(1 - Pizza\n2 - Hamburguer\n3 - Salada\n4 - Bebida\n5 - Sair)");
        }
            if(opcao==5){
            break;
        }
        //peço perdão caso não fosse permitido fazer piada com as descrições das comidas
        Comida pizza = new Comida("Pizza", 45.00, "A tradicional e de melhor sabor: Calabresa\n Ingredientes: Calabresa, cebola, azeitona, queijo");
        Comida hamburguer = new Comida("Hamburguer", 25.00, "X-tudão com tudo que há de bom e do melhor \n Ingredientes: O que encontrarmos na geladeira");
        Comida salada = new Comida("Salada", 20.00, "A melhor opção para o fit que não quer ser excluído \n Ingredientes: Alface e tomate com molho");
        Comida bebida = new Comida("Bebida", 10.00, "Só um tipo de bebida: Suco de laranja \n Ingredientes: Laranja");
        
        switch(opcao){
            case 1:
                JOptionPane.showMessageDialog(null,"Nome: "+ pizza.getNome()+"\nPreco: " + pizza.getPreco()+"\nDescrição: " + pizza.getDesc()+"\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Nome: "+ hamburguer.getNome()+"\nPreco: "+hamburguer.getPreco()+"\nDescrição: "+hamburguer.getDesc()+"\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Nome: " + salada.getNome()+"\nPreco: "+salada.getPreco()+"\nDescrição: "+salada.getDesc()+"\n");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Nome: " + bebida.getNome()+"\nPreco: "+bebida.getPreco()+"\nDescrição: "+bebida.getDesc());
                break;
        }
        opcao=0;
       }
    }
    static int getNumero(String mensagem){
        while(true){
             try {
                String input = JOptionPane.showInputDialog(mensagem);
                if(input==null){
                    break;
                }
                input = input.replace(",", ".");
                return Integer.parseInt(input);
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números!");
            }
        }
        return 0;
    }
}
