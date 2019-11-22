package com.db.db1.start.poo;

public class Aluno extends Pessoa {
    private Double nota;


    public Aluno(String nome, String email) {
        super(nome, email);

    }

    @Override
    public String toString() {
        return super.toString() + "{Aluno{" +
                "nota=" + nota +
                "}}";
    }
}
