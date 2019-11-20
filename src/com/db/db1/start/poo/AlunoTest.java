package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void deveJogarExceptionComEmailNulo() {
        String nome = "Maiko Cunha";
        try {
            Aluno aluno = new Aluno(nome, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }

    }

    @Test
    public void deveJogarExceptionComNomeNulo() {
        String email = "maiko.cunha@db1.com.br";
        try {
            Aluno aluno = new Aluno(null, email);
        }  catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
              Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
            }
        }

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor () {
        String email = "email.fake@email.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(nome, email, 1.0);
        Assert.assertEquals(nome, aluno.getNome());
        Assert.assertEquals(email, aluno.getEmail());
    }
}
