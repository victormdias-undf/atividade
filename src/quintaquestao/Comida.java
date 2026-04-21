package quintaquestao;


public class Comida {
    private final String nome;
    private final double preco;
    private final String descricao;

    public Comida(String nome, double preco, String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    //novamente, só pra manter as boas práticas de não acessar diretamente o conteúdo

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public String getDesc(){
        return descricao;
    }
}
