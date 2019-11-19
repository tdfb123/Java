package com.db.db1.start.poo;

public class Aluno extends Pessoa {
    public Double nota;

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", pessoa='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
