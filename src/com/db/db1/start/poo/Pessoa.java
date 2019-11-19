package com.db.db1.start.poo;

public abstract class Pessoa {
    private String nome;
    private String email;


    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

