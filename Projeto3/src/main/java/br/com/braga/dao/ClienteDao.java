package br.com.braga.dao;

import br.com.braga.dao.jdbc.ConnectionFactory;
import br.com.braga.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao implements IClienteDao{

    @Override
    public Integer cadastrar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try{
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO CLIENTES (ID, CODIGO, NOME) VALUES(nextval('SQ_CLIENTE_2'),?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
            stm.setString(2, cliente.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente consultar(String codigo) {
        return null;
    }
}
