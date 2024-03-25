package br.com.braga.services;

import br.com.braga.dao.IClienteDao;
import br.com.braga.domain.Cliente;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService{

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDao.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDao.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDao.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
        clienteDao.alterar(cliente);
    }

}
