package br.com.braga.dao;

import br.com.braga.dao.generics.IGenericDao;
import br.com.braga.domain.Produto;

public interface IProdutoDao extends IGenericDao<Produto, String> {

    void excluir(String valor);

    Produto consultar(String valor);

    Class<Produto> getTipoClasse();

    void atualiarDados(Produto entity, Produto entityCadastrado);
}