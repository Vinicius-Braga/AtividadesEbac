package br.com.braga;

import br.com.braga.dao.ClienteDao;
import br.com.braga.dao.IClienteDao;
import br.com.braga.domain.Cliente;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void cadasrtrarTest() throws SQLException {
        IClienteDao dao = new ClienteDao();

        Cliente cliente = new Cliente();
        cliente.setCodigo("1");
        cliente.setNome("Vinicius");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());
    }
}
