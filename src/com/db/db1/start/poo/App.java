package com.db.db1.start.poo;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maiko Cunha", "maiko.cunha@db1.com.br", 5.0);
        Aluno aluno2 = new Aluno("João Silva", "joao.silva@db1.com.br", 5.0);

        Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br",5000.00);

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        materia.cargaHoraria = 10.5;
        materia.quantidadeAulas = 3;
        materia.professor = professor;

        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<Aluno>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println(aula);

        aula.toString();





    }


}
