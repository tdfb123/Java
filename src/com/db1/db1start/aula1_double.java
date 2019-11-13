package com.db1.db1start;

import java.util.Scanner;

public class aula1_double {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor 1");
        Double valor1 = scan.nextDouble();

        System.out.println("digite o valor 2");
        Double valor2 = scan.nextDouble();

        if(valor1 > valor2) {
            System.out.println("O valor 1 é maior que o valor 2");
        }else {
            System.out.println("O valor 2 é maior que o valor 1");
        }
    }

}