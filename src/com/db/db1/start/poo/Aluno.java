package com.db.db1.start.poo;

public class Aluno extends Pessoa {
    public Double nota;


    public Aluno(String nome, String email, Double nota) {
        super(nome, email);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + "{Aluno{" +
                "nota=" + nota +
                "}}";
    }
}
