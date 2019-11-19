package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void DeveCriarMateriaPorMeioDoConstrutor(){
        String nome = "Cálculo 2";
        String descricao = "Estudo das derivadas";
        Double cargaHoraria = 80.00;
        String professor = "Fernando";
        Integer quantidadeAulas = 26;
        Materia materia = new Materia(nome, descricao, cargaHoraria, professor, quantidadeAulas);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(professor, materia.getProfessor());
        Assert.assertEquals(quantidadeAulas, materia.getQuantidadeDeAulas());


    }

}
