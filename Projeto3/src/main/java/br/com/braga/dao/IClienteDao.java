package br.com.braga.dao;

import br.com.braga.domain.Cliente;

import java.sql.SQLException;

public interface IClienteDao {
    public Integer cadastrar (Cliente cliente) throws SQLException;

    Cliente consultar(String codigo) throws SQLException;
}
