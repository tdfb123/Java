package com.db.db1.start.poo;

import java.util.Date;
import java.util.List;

public class Aula {
    public Date data;
    public Materia materia;
    public List<Aluno> alunos;

    @Override
    public String toString() {
        return "Aula{" +
                "Data=" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}

