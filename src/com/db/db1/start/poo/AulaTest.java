package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AulaTest {

    @Test
    public void deveCriarAulaPorMeioDoConstrutor() {
        Date data = new Date();
        Aluno aluno = new Aluno("aluno@email.com", "Aluno");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno);
        Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br");
        Materia materia = new Materia("POO","Abstração, Encapsulamento, Polimorfismo, Herança", 10.5, professor, 3);

        Aula aula = new Aula(data, materia);
        Assert.assertEquals(data, aula.getData());
        Assert.assertEquals(materia, aula.getMateria());
    }

    @Test
    public void deveAdicionarAlunoNaChamada() {
        String email = "maiko.cunha@db1.com.br";
        String nome = "Maiko Cunha";
        Date data = new Date();
        Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br");
        Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo, Herança", 10.5, professor, 3);
        Aula aula = new Aula(data, materia);

        Assert.assertEquals(0, aula.quantidadeDeAlunosPresentes());

        Aluno aluno = new Aluno(email, nome);
        aula.darPresenca(aluno);

        Assert.assertEquals(1, aula.quantidadeDeAlunosPresentes());
    }

}