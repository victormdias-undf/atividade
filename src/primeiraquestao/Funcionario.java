package primeiraquestao;

public class Funcionario {
    private final int tempoServico;
    private final double salario;
    public Funcionario(int tempoServico, double salario){
        this.tempoServico = tempoServico;
        this.salario = salario;
    }

    //sei que esses métodos podiam ser feitos ali mesmo no main, mas quis priorizar fazer desse jeito, visto que como o projeto final é uma api, 
    // teremos de fazer isso como boa prática de segurança dos dados
    public double getSalario(){
        return salario;
    }
    public int getTempoDeServico(){
        return tempoServico;
    }
    public double getSalarioBonificado(double boni){
        return salario+(salario*boni);
    }
}
