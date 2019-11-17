package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class AppTeste {

    @Test
    public void retorna10() {
        Application application = new Application();
        int expected = 10;
        int response = application.soma(5, 5);
        Assert.assertEquals(expected, response);
    }


    @Test
    public void retorna0() {
        Application application = new Application();
        int expected = 0;
        int response = application.subtracao(5, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retorna25() {
        Application application = new Application();
        int expected = 25;
        int response = application.multiplicacao(5, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retorna100() {
        Application application = new Application();
        int expected = 100;
        int response = application.divisao(200, 2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retornaPar() {
        Application application = new Application();
        boolean expected = true;
        boolean response = application.par(10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void maior() {
        Application application = new Application();
        boolean expected = true;
        boolean response = application.numaior(10, 20);
        Assert.assertEquals(expected, response);

    }

    @Test
    public void qntimpar() {
        Application application = new Application();
        int expected = 5;
        int response = application.quantidadeDeImpares(10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void textomaiusculo() {
        Application application = new Application();
        String expected = "EXEMPLO DE TEXTO".toUpperCase();
        String response = application.devolveTextoEmMaiusculo("exemplo de texto");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void textominusculo() {
        Application application = new Application();
        String expected = "exemplo de texto".toLowerCase();
        String response = application.devolveTextoEmMinusculo("EXEMPLO DE TEXTO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void quantidadeletrasdb1start() {
        Application application = new Application();
        int expected = 7;
        int response = application.contagemDeLetrasDb1Start("DB1START");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void quantidadedeletrasemespaco() {
        Application application = new Application();
        int expected = 7;
        int response = application.contagemDeLetrasSemEspaco(" DB1START ");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void quatroprimeirasletrasdonome() {
        Application application = new Application();
        String expected = "THIA";
        String response = application.retorna4PrimeirasLetrasDoNome("THIAGO DE FREITAS BERALDO");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void pulatresprimeirasletrasdotexto() {
        Application application = new Application();
        String expected = "IAGO DE FREITAS BERALDO";
        String response = application.retornaONomeApartirDaTerceiraLetra("THIAGO DE FREITAS BERALDO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mostraasultimas4letrasdonome() {
        Application application = new Application();
        String expected = "ALDO";
        String response = application.retornaApenasAsQuatroUltimasLetrasDoNome("THIAGO DE FREITAS BERALDO");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void substituiprimeironomeporaluno() {
        Application application = new Application();
        String expected = "ALUNO DE FREITAS BERALDO";
        String response = application.substituiOPrimeiroNomePorAluno("THIAGO DE FREITAS BERALDO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void contaNumeroDeVogais() {
        Application application = new Application();
        int expected = 3;
        int response = application.quantidadeDeVogais("Thiago");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void inverteUmTexto() {
        Application application = new Application();
        //String s = "COMPUTADOR";
        //String invertida = new StringBuilder(s).reverse().toString();//tentei usar esse método professor mas não consegui chamalo na aplicação, desculpe.
        String expected = "RODATUPMOC";
        String response = application.exibeOTextoInvertido("COMPUTADOR");
        Assert.assertEquals(expected, response);

    }

    @Test
    public void menorValorEntreDoisNumeros() {
        Application application = new Application();
        boolean expected = true;
        boolean response = application.exibeOMenorValorDeDoisNumeros(5, 9);
        Assert.assertEquals(expected, response);

    }

    @Test
    public void menorValorEntreTresNumeros() {
        Application application = new Application();
        boolean expected = true;
        boolean response = application.exibeOMenorValorDeTresNumeros(6, 9, 12);
        Assert.assertEquals(expected, response);

    }

    @Test
    public void mediaDeTresValores(){
        Application application = new Application();
        int expected = 10;
        int response = application.exibeAMediaDeTresNumeros(5, 10, 15);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void areaDeUmTriangulo(){
        Application application = new Application();
        int expected = 4;
        int response = application.calculaAAreaDeUmTriangulo(2, 4);
        Assert.assertEquals(expected, response);
    }
}