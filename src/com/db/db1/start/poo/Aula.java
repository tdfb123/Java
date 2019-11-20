package com.db.db1.start.poo;

import java.util.Date;
import java.util.List;

public class Aula {
    public Date data;
    public Materia materia;
    public List<Aluno> alunos;

    public Aula(Date data, Materia materia) {
        this.data = data;
        this.materia = materia;
    }

    public void darPresenca(Aluno aluno) {
        this.alunos.add(aluno) {
            this.alunos.add()
        }
    }

    @Override
    public String toString() {
        return "Aula{" +
                "Data=" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}

