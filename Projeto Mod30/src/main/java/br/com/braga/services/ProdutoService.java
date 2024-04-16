package br.com.braga.services;

import br.com.braga.dao.IProdutoDao;
import br.com.braga.domain.Produto;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;
import br.com.braga.services.generic.GenericService;

import java.util.Collection;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDao dao) {
        super(dao);
    }

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
