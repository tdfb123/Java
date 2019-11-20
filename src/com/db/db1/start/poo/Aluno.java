package com.db.db1.start.poo;

public class Aluno extends Pessoa {
    public Double nota;


    public Aluno(String nome, String email, Double nota) {
        if (nome == null) {
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        }

        if (email == null) {
            throw new CampoNaoPodeSerNulo("Email não pode ser nulo");
        }

        if (nota == null) {
            throw new CampoNaoPodeSerNulo("Nota não pode ser nulo");

        }

        this.nome = nome;
        this.email = email;

    }

    public Aluno(String nome, String email) {
    }

    @Override
    public String toString() {
        return super.toString() + "{Aluno{" +
                "nota=" + nota +
                "}}";
    }
}
