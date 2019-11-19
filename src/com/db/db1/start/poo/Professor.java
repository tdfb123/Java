package com.db.db1.start.poo;

public class Professor extends Pessoa {
    public Double salario;

    public Professor(String nome, String email, Double salario) {
        super(nome, email);
        this.salario = salario;
    }
}
