package org.braga;

import org.braga.dao.CursoDao;
import org.braga.dao.ICursoDao;
import org.braga.domain.Curso;
import org.junit.Test;

public class CursoTest {
    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }
    @Test
    public void Cadastrar() {

        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setNome("Curso de Teste");
        curso.setDescricao("Curso de java backend");
        cursoDao.cadastrar(curso);
    }
}
