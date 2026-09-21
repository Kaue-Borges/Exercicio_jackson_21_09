package aula_14;

public class Carro {
    String cor;
    int ano;
    String marca;
    String placa;
    boolean estoque;
    
    Carro(String cor, int ano, String marca, String placa) {
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
        this.estoque = true;
    }
    public void Vender(){
        this.estoque = false;
    }
}
