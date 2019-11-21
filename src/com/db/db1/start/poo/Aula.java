package com.db.db1.start.poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    private Date data;
    private Materia materia;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Aula(Date data, Materia materia) {
        if (data == null) {
            throw new CampoNaoPodeSerNulo("Data não pode ser nula");
        }
        if (materia == null) {
            throw new CampoNaoPodeSerNulo("Materia não pode ser nula");
        }
        this.data = data;
        this.materia = materia;
    }

    public void darPresenca(Aluno aluno) {
        if (aluno == null) {
            throw new CampoNaoPodeSerNulo("Aluno não pode ser nulo");
        }
        this.alunos.add(aluno);

    }

    public int quantidadeDeAlunosPresentes() {
        return this.alunos.size();

    }

    public Date getData() {
        return data;

    }

    public Materia getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "Aula{" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}

