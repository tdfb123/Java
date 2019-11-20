package com.db.db1.start.poo;

public class Professor extends Pessoa {
    public Double salario;

    public Professor(String nome, String email, Double salario) {
        if (nome == null) {
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");

        }

        if (email == null) {
            throw new CampoNaoPodeSerNulo("Email não pode ser nulo");


        }

        if (salario == null) {
            throw new CampoNaoPodeSerNulo("Salario não pode ser nulo");

        }
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

}
