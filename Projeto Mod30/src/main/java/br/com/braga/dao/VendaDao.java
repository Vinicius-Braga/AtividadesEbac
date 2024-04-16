package br.com.braga.dao;

import br.com.braga.dao.generics.GenericDao;
import br.com.braga.domain.Venda;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;

public class VendaDao extends GenericDao<Venda, String> implements IVendaDao {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        super.alterar(venda);
    }


    @Override
    public void excluir(Long valor) {

    }

    @Override
    public Venda consultar(Long valor) {
        return null;
    }
}
