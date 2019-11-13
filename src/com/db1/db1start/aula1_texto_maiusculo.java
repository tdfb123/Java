package com.db1.db1start;

import java.util.Scanner;

public class aula1_texto_maiusculo {

    public static void main(String[] args) {

        System.out.println("digite seu nome ");
        String nome;
        Scanner scan = new Scanner(System.in);
        nome = scan.nextLine();
        System.out.println(nome.toUpperCase()+ " é muito bonito");




    }

}
