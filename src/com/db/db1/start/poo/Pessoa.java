package com.db.db1.start.poo;

public class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(){

    }

    public Pessoa(String nome, String email) {
        if (nome == null) {
            throw new  CampoNaoPodeSerNulo("Nome não pode ficar em branco");

        }
        if (email == null) {
            throw new CampoNaoPodeSerNulo("Email não pode ficar em branco");

        }

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

