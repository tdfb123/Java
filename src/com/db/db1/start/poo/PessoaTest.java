package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {


    @Test
    public void DeveCriarPessoaPorMeioDoConstrutor(){
        String nome = "Thiago";
        String email = "tdfb_123@hotmail.com";
        Pessoa pessoa = new Pessoa(nome, email);
        Assert.assertEquals(nome, pessoa.getNome());
        Assert.assertEquals(email, pessoa.getEmail());

    }

}
