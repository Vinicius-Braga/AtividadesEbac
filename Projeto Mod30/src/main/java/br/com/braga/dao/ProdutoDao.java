package br.com.braga.dao;

import br.com.braga.dao.generics.GenericDao;
import br.com.braga.domain.Produto;

public class ProdutoDao extends GenericDao<Produto, String> implements IProdutoDao {

    public ProdutoDao() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public Produto consultar(Long valor) {
        return null;
    }
}
