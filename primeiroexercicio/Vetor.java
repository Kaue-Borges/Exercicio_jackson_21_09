package primeiroexercicio;

import java.util.HashSet;

public class Vetor {
    public static void main(String[] args) {
        // int[] inteiros = new int[10];
        int[] inteiros = {1, 2, 4, 6, 8, 10};

        for(int i = 0; i < inteiros.length; i++) {
            System.out.println(inteiros[i]);
        }

        HashSet<Integer> setter = new HashSet<>();

        setter.add(10);
        setter.add(10);

        System.out.println("Contém 10? " + setter.contains(10));

        for(Integer valor : setter) {
            System.out.println(valor);
        }
    }
}