package com.db.db1.start.poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maiko Cunha", "maiko.cunha@db1.com.br");
        Aluno aluno2 = new Aluno("João Silva", "joao.silva@db1.com.br");
        Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br",5000.00);

        String.nome = "POO";
        String.descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        Double.cargaHoraria = 10.5;
        Integer.quantidadeAulas = 3;
        Materia materia = new Materia(nome, descricao, cargaHoraria, quantidadeAulas, professor);

        Date data = new Date();
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        Aula aula = new Aula(data, materia);

        System.out.println(aula);

    }

}
