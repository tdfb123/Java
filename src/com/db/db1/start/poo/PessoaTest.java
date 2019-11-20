package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void deveJogarExceptionComEmailNulo() {
        String nome = "Maiko Cunha";
        try {
            Pessoa pessoa = new Pessoa(nome, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComNomeNulo() {
        String email = "maiko.cunha@db1.com.br";
        try {
            Pessoa pessoa = new Pessoa(null, email);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }

    }


    @Test
    public void DeveCriarPessoaPorMeioDoConstrutor(){
        String nome = "Thiago";
        String email = "tdfb_123@hotmail.com";
        Pessoa pessoa = new Pessoa(nome, email);
        Assert.assertEquals(nome, pessoa.getNome());
        Assert.assertEquals(email, pessoa.getEmail());

    }

}
