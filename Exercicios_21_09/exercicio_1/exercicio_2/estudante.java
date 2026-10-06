package Exercicios_21_09.exercicio_1.exercicio_2;

public class estudante {

    public String nome;
    public int idade;
    public double nota1;
    public double nota2;

    public estudante(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }
    public void exibirSituacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
        if (verificarAprovacao()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}