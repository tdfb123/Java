package com.db.db1.start.poo;

public class Materia {
    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Professor professor;
    public Integer quantidadeAulas;


    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                ", quantidadeAulas=" + quantidadeAulas +
                '}';
    }
}
