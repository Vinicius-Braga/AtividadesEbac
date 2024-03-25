package br.com.braga.dao;

import br.com.braga.domain.Cliente;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {
    private IClienteDao clienteDao;
    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDaoMock();

    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Vinicius");
        cliente.setCidade("Guaiba");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNuemro(10);
        cliente.setTel(11999999999L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Vinicius Braga");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Vinicius Braga", cliente.getNome());
    }
}
