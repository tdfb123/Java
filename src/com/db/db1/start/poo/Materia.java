package com.db.db1.start.poo;

public class Materia {
    private String nome;
    private String descricao;
    private Double cargaHoraria;
    private Professor professor;
    private Integer quantidadeAulas;

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidadeAulas){
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidadeAulas = quantidadeAulas;
    }

    public void trocaProfessor(Professor professor) {

    }


    public String getNome() {
        return nome;
    }

    public String getDescricao(){
        return descricao;

    }

    public Double getCargaHoraria(){
        return cargaHoraria;
    }

    public Integer getQuantidadeAulas(){
        return quantidadeAulas;
    }
    @Override
    public String toString () {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                ", quantidadeAulas=" + quantidadeAulas +
                '}';
        }
    }
