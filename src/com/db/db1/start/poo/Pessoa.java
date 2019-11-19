package com.db.db1.start.poo;

public abstract class Pessoa {
    public String nome;
    public String email;

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

