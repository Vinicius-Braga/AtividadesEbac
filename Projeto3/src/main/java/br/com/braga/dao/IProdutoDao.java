package br.com.braga.dao;

import br.com.braga.domain.Produto;

import java.sql.SQLException;

public interface IProdutoDao {

    Integer cadastrar (Produto produto) throws SQLException;
    Produto pesquisar (String codigo) throws SQLException;
    Integer atualizar (Produto produto) throws SQLException;
    Integer deletar (Produto produto) throws SQLException;



}
