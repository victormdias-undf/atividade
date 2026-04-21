package primeiraquestao;

public class App {
    public static void main(String[] args){
        Funcionario fun1 = new Funcionario(3, 1621);
        Funcionario fun2 = new Funcionario(7, 2500);

        Funcionario[] funcionarios = {fun1,fun2};

        for(int i = 0; i<funcionarios.length; i++){
            int tempo = funcionarios[i].getTempoDeServico();
            System.out.println("Tempo de Serviço: " + tempo);
            //diz-se ser superior a 5 anos, não igual ou superior
            double novoSalario = tempo>5 ? funcionarios[i].getSalarioBonificado(0.05) : funcionarios[i].getSalarioBonificado(0.013);
            double antigoSalario = funcionarios[i].getSalario();
            System.out.println("Salário antigo: " + String.format("%.2f", antigoSalario));
            System.out.println("Valor liquído adicionado: " + String.format("%.2f", (novoSalario-antigoSalario)));
            System.out.println("Salário novo: " + String.format("%.2f", novoSalario));
        }
    }
}
