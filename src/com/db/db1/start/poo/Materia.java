package com.db.db1.start.poo;

public class Materia {
    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Professor professor;
    public Integer quantidadeAulas;

    public Materia(){

    }

    public Materia(String nome, String descricao, Professor professor, Double cargaHoraria, Integer quantidadeAulas) {
        if (nome == null) {
            throw new CampoNaoPodeSerNulo("Nome da materia não pode ser nulo");

        }

        if (descricao == null) {
            throw new CampoNaoPodeSerNulo("Descricao da materia não pode ser nulo");

        }

        if (professor == null) {
            throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");

        }

        if (cargaHoraria == null) {
            throw new CampoNaoPodeSerNulo("Carga horaria não pode ser nulo");

        }

        if (quantidadeAulas == null) {
            throw new CampoNaoPodeSerNulo("Quantidade de aulas não pode ser nulo");

        }
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAulas = quantidadeAulas;
        this.professor = professor;
    }

    public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadeAulas) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAulas = quantidadeAulas;
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
