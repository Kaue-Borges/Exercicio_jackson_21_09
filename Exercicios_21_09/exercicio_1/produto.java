package Exercicios_21_09.exercicio_1;

public class produto {
    public String nome;
    public double preco;
    public int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public double calcularValorEstoque(){
        return this.preco * this.quantidade;
    }

    public void exibirDados(){
        System.out.println("nome: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("quantidade: " + this.quantidade);
        System.out.println("valor do estoque: " + this.calcularValorEstoque());
    }

}


