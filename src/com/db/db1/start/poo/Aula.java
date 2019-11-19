package com.db.db1.start.poo;

import sun.util.resources.cldr.CalendarData;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Aula extends Aluno {
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

