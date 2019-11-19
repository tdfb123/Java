package com.db1.db1start;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExtruturaDeDados {

    public static void main(String[] args) {
        recebeStringRemoveSegunda("A", "B", "C");

        separar();
        imprimirCoresFavoritas();

        separar();
        imprimirCoresFavoritasOrdenadas();

        separar();
        List<String> cores = new ArrayList<>(coresFavoritas());
        removerCorFavorita(cores,
                "Azul");

        separar();
        imprimirCoresFavoritasDesc(coresFavoritas());

        separar();
        Map<String, List<Integer>> paresEImpares =
                separar(Arrays.asList(
                        1, 1, 2, 3, 5, 7, 12, 19, 31));

        paresEImpares.forEach((chave, valor) ->
                System.out.println(chave + ": " + valor));
    }

    private int a() { return 0; }
    private int a(int x) { return 0; }
    private int a(double x) { return 0; }
    private int a(double x, int y) { return 0; }

    private static void separar() {
        System.out.println("======================");
    }

    //Método que retorne os nomes das cores que você mais gosta
    private static List<String> coresFavoritas() {
        //Forma 1
//        List<String> cores = new ArrayList<>();
//        cores.add("Laranja");
//        cores.add("Vermelho");
//        cores.add("Preto");
//        cores.add("Azul");
//        return cores;

        //Forma 2
//        List<String> cores = new ArrayList<>();
//        cores.addAll(Arrays.asList("Laranja", "Vermelho",
//            "Preto", "Azul"));
//        return cores;

        //Forma 3
//        List<String> cores = new ArrayList<>(
//                Arrays.asList("Laranja", "Vermelho",
//                    "Preto", "Azul"));
//        return cores;

        //Forma 4
//        return new ArrayList<>(
//                Arrays.asList("Laranja", "Vermelho",
//                    "Preto", "Azul"));

        //Forma 5
        return Arrays.asList("Laranja", "Vermelho",
                "Preto", "Azul");
    }

    //Método que dado uma lista retorne a quantidade de itens
    private static int quantidadeItems(List<?> lista) {
        return lista.size();
    }

    //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
    private static void recebeStringRemoveSegunda(
            String texto1, String texto2, String texto3) {
        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList(texto1, texto2, texto3));
        strings.remove(1);
        System.out.println(strings);
    }

    //Método que imprima a lista de cores do primeiro método
    private static void imprimirCoresFavoritas() {
        coresFavoritas().forEach(System.out::println);
//        coresFavoritas().forEach(s -> System.out.println(s));
        coresFavoritas().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    //Método que imprima as cores do primeiro método em
    // ordem alfabética
    private static void imprimirCoresFavoritasOrdenadas() {
        List<String> cores = coresFavoritas();
        Collections.sort(cores);
        cores.forEach(System.out::println);
    }

    //Método que receba uma lista das cores que você
    // mais gosta e o nome de uma cor a ser removida
    private static void removerCorFavorita(
            List<String> cores,
            String corASerRemovida) {
        cores.remove(corASerRemovida);
    }

    //Método que receba a lista de cores que você gosta
    // e imprima em ordem decrescente (alfabética)
    private static void imprimirCoresFavoritasDesc(
            List<String> cores) {
//        Collections.sort(cores);
//        Collections.reverse(cores);
        Collections.sort(cores, Collections.reverseOrder());
        cores.forEach(System.out::println);
    }

    //Método que receba uma lista de números
    // e retorne um mapa com listas de números
    // pares e impares
    private static Map<String, List<Integer>> separar(
            List<Integer> numeros) {
        Map<String, List<Integer>> mapa = new HashMap<>();
        //Forma 1
//        mapa.put("PAR", new ArrayList<>());
//        mapa.put("IMPAR", new ArrayList<>());
//        numeros.forEach(n -> {
//            if (n % 2 == 0) {
//                mapa.get("PAR").add(n);
//            } else {
//                mapa.get("IMPAR").add(n);
//            }
//        });
        //Forma 2
//        mapa.put("PAR", new ArrayList<>());
//        mapa.put("IMPAR", new ArrayList<>());
//        numeros.forEach(n -> {
//            String chave = n % 2 == 0 ? "PAR" : "IMPAR";
//            mapa.get(chave).add(n);
//        });

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        mapa.put("PAR", pares);
        mapa.put("IMPAR", impares);
        return mapa;
    }
}

