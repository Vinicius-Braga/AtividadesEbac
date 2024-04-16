package br.com.braga.dao;

import br.com.braga.dao.generics.IGenericDao;
import br.com.braga.domain.Venda;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDao extends IGenericDao<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
