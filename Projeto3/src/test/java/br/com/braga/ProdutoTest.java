package br.com.braga;

import br.com.braga.dao.ClienteDao;
import br.com.braga.dao.IClienteDao;
import br.com.braga.dao.IProdutoDao;
import br.com.braga.dao.ProdutoDao;
import br.com.braga.domain.Produto;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ProdutoTest {


    @Test
    public void cadastrarTest() throws SQLException {
        IProdutoDao dao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setNome("Iphone");
        produto.setValor(3000);
        produto.setCodigo("1");

        Integer qtdCadastro = dao.cadastrar(produto);
        assertTrue(qtdCadastro == 1);

        Produto produtoBD = dao.pesquisar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produtoBD.getNome(),produto.getNome());
        assertEquals(produtoBD.getValor(),produto.getValor());
        assertEquals(produtoBD.getCodigo(),produto.getCodigo());

        produto.setNome("Monitor");
        Integer qtdAtualizada = dao.atualizar(produto);
        assertTrue(qtdAtualizada == 1);

        Integer qtdDeletada = dao.deletar(produto);
        assertTrue(qtdDeletada == 1);
;    }


}
