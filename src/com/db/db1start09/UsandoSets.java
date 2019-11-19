package com.db.db1start09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

public class UsandoSets {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.addAll(Arrays.asList("Thiago", "Ronaldo", "Suzete", "Fernando", "Carlos", "Vanessa", "Bruno", "Bruno", "Bruno", "Bruno", "Fabio", "Suzana"));
        System.out.println("Lista dos nomes: " + nomes);
        nomes.remove("Suzete");
        System.out.println("Removido o nome Suzete: " + nomes);
        nomes.removeIf(x -> x.charAt(0) == 'F');
        System.out.println("Removidos os nomes que começam com F: " + nomes);
        nomes.removeIf((x -> x.contains("naldo")));
        System.out.println("Removidos os nomes terminados com naldo " + nomes);
        if (nomes.contains("Suzana")) ;
        System.out.println("Nome Suzana encontrado, passando para maiusculo >> : " + "Suzana".toUpperCase());



        HashSet<Integer> numeros = new HashSet<>(
            Arrays.asList(1, 2, 3, 4));
        Integer[] min = {Integer.MAX_VALUE};
        Integer[] max = {Integer.MIN_VALUE};
        Integer[] soma = {0};
        numeros.forEach(n -> {
            min[0] = n < min[0] ? n : min[0];
            max[0] = n > max[0] ? n : max[0];
            soma[0] += n;
        });
    }
}









//HashSet<Integer> numeros = new HashSet<>(){
//        Arrays.assList(1, 2, 3, 4));
//    Integer[] min = Integer.MAX_VALUE;
//    Integer[] max = Integer.MIN_VALUE;
//    Integer[] soma = {0};
//    numeros.forEach(n -> {
//        min[0] = n < min[0] ? n : min[0];
//        max[0] = n > max[0] ? n : min[0];
//        soma[0] +=
//
//     }
// }