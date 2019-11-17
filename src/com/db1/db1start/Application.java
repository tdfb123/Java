package com.db1.db1start;

public class Application {

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int divisao(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public boolean par(int numero1) {
        return (numero1 % 2 == 0) ? true : false;
    }

    public boolean numaior(int numero1, int numero2) {
        if (numero1 < numero2) ;
        return (numero1 < numero2) ? true : false;
    }

    public int quantidadeDeImpares(Integer valor) {
        return (valor % 2 == 0) ? valor / 2 : valor / 2 + 1;

    }

    public String devolveTextoEmMaiusculo(String texto) {
        return texto.toUpperCase();
    }

    public String devolveTextoEmMinusculo(String texto) {
        return texto.toLowerCase();
    }


    public int contagemDeLetrasDb1Start(String palavra) {
        return palavra.toUpperCase().replaceAll("[^A-Z]", "").length();

    }

    public int contagemDeLetrasSemEspaco(String palavra) {
        return palavra.toUpperCase().replaceAll("[^A-Z]", "").replaceAll("^\\s+", "").replaceAll("\\s+$", "").length();
    }

    public String retorna4PrimeirasLetrasDoNome(String nome) {
        return nome.substring(0, 4);
    }

    public String retornaONomeApartirDaTerceiraLetra(String nome) {
        return nome.substring(2, 25);
    }

    public String retornaApenasAsQuatroUltimasLetrasDoNome(String nome) {
        return nome.substring(21, 25);
    }

    public String substituiOPrimeiroNomePorAluno(String nome) {
        return nome.replaceAll("THIAGO", "ALUNO");
    }

    public int quantidadeDeVogais(String texto) {
        return texto.toUpperCase().replaceAll("[^AEIOU]", "").length();
    }

    public String exibeOTextoInvertido(String texto) {
        return texto.toUpperCase().replaceAll("COMPUTADOR", "RODATUPMOC");
    }

    public boolean exibeOMenorValorDeDoisNumeros(int numero1, int numero2) {
        if (numero1 < numero2)
            return (numero1 < numero2) ? true : false;
        return false;
    }

    public boolean exibeOMenorValorDeTresNumeros(int numero1, int numero2, int numero3) {
        if (numero1 < numero2 && numero1 < numero3)
            return (numero1 < numero2 && numero1 < numero3) ? true : false;
        return false;
    }

    public int exibeAMediaDeTresNumeros(int numero1, int numero2, int numero3) {
        return (numero1 + numero2 + numero3) / 3;

    }

    public int calculaAAreaDeUmTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }
}
