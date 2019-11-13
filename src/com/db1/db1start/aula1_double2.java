package com.db1.db1start;

import java.util.Scanner;

public class aula1_double2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor 1");
        Double valor1 = scan.nextDouble();

        System.out.println("digite o valor 2");
        Double valor2 = scan.nextDouble();

        System.out.println("digite o valor 3");
        Double valor3 = scan.nextDouble();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("O valor 1 é menor");
        } else if (valor2 < valor3 && valor2 < valor1) {
            System.out.println("O valor 2 é menor");
        }    else if (valor3 < valor1 && valor3 < valor2) {
            System.out.println("valor 3 é o menor");
        }
    }
}