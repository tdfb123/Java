package com.db1.db1start;

import java.util.Scanner;

public class aula2 {

    public static String soma(Integer numero1, Integer numero2){
        Integer resultado;
        resultado = numero1 + numero2;
        return "a soma dos dois números escolhidos é: " + resultado;
    }

    public static String subtracao(Integer numero1, Integer numero2){
        Integer resultado2;
        resultado2 = numero1 - numero2;
        return "a subtração dos dois números escolhidos é: " + resultado2;
    }

    public static String uperCase(String texto) {
        return texto.toUpperCase();
    }

    public static String lowerCase(String texto) {
        return texto.toLowerCase();
    }

    public static Double menor(Double valor1, Double valor2) {
        if (valor1 < valor2) {
            System.out.println("O valor 1 é menor que o valor 2");
        }else {
            System.out.println("O valor 2 é menor que o valor 1");
        }
        return valor2;
    }


    public static Double menor(Double valor11, Double valor22, Double valor33){
        if (valor11 < valor22 && valor11 < valor33) {
            return valor11;
        }else if (valor22 < valor33 && valor22 < valor11) {
            return valor22;
        }else {
            System.out.println("valor 3 é o menor: " + valor33);
                }

        return menor(menor(valor11, valor22), valor33);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("numero 1: ");
        Integer numero1 = scan.nextInt();
        scan.nextLine();
        System.out.println("numero 2: ");
        Integer numero2 = scan.nextInt();
        scan.nextLine();
        System.out.println(soma(numero1,numero2)) ;
        System.out.println(subtracao(numero1,numero2));
        System.out.println("Insira um texto: ");
        String texto = scan.nextLine();
        System.out.println(uperCase(texto));
        System.out.println(lowerCase(texto));
        System.out.println("Digite o valor 1");
        Double valor1 = scan.nextDouble();
        System.out.println("Digite o valor 2");
        Double valor2 = scan.nextDouble();
        System.out.println(menor(valor1,valor2));
        System.out.println("Agora veremos qual é o menor valor de 3 digitados");
        System.out.println("Digite o valor 1");
        Double valor11 = scan.nextDouble();
        System.out.println("Digite o valor 2");
        Double valor22 = scan.nextDouble();
        System.out.println("Digite o valor 3");
        Double valor33 = scan.nextDouble();

        if(valor11 < valor22 && valor11 < valor33 ) {
            System.out.println("valor 1 é o menor: " + valor11 );
        }else if (valor22 < valor33 && valor22 < valor11){
            System.out.println("valor 2 é o menor: " + valor22);
        }else {
            System.out.println("valor 3 é o menor: " + valor33);
        }

    }
}

