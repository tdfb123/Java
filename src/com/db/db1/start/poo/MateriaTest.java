package com.db.db1.start.poo;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void deveJogarNoExceptionComNomeNulo() {
        String nome = "POO";
        String descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;

        try {
            Materia materia = new Materia(null, descricao, cargaHoraria, quantidadeAulas, professor);
        }
    }







    @Test
    public void DeveCriarMateriaPorMeioDoConstrutor() {
        String nome = "Cálculo 2";
        String descricao = "Estudo das derivadas";
        Double cargaHoraria = 80.00;
        Integer quantidadeAulas = 26;
        Materia materia = new Materia(nome, descricao, cargaHoraria, quantidadeAulas);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(quantidadeAulas, materia.getQuantidadeAulas());

    }

    @Test
    public void DeveCriarMateriaPorMeioDoConstrutorComSobreCargaDoProfessor() {
        String nome = "Cálculo 2";
        String descricao = "Estudo das derivadas";
        Double cargaHoraria = 80.00;
        Integer quantidadeAulas = 26;
        Materia materia = new Materia(nome, descricao, cargaHoraria, quantidadeAulas);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(quantidadeAulas, materia.getQuantidadeAulas());

    }
}