package br.com.braga.dao;

import br.com.braga.domain.Cliente;

import java.sql.SQLException;

public interface IClienteDao {
    Integer cadastrar (Cliente cliente) throws SQLException;

    Cliente consultar(String codigo) throws SQLException;

    Integer excluir(Cliente cliente) throws SQLException;

    Integer atualizar(Cliente cliente) throws SQLException;
}
