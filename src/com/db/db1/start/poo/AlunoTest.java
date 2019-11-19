package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {


    @Test
    public void deveCriarAlunoPorMeioDoConstrutor () {
        String email = "email.fake@email.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(nome, email, 1.0);
        Assert.assertEquals(nome, aluno.getNome());
        Assert.assertEquals(email, aluno.getEmail());
    }
}
