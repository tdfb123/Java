package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void DeveCriarProfessorPorMeioDoConstrutor(){
        String email = "fake2@gmail.com";
        String nome = "Fake2";
        Professor professor = new Professor(nome, email, 5481.00);
        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(email, professor.getEmail());
    }
}
