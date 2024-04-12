package br.com.braga.dao;

import br.com.braga.dao.jdbc.ConnectionFactory;
import br.com.braga.domain.Cliente;
import br.com.braga.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDao implements IProdutoDao{
    Connection connection = null;
    PreparedStatement stm = null;

    @Override
    public Integer cadastrar(Produto produto) throws SQLException {
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO PRODUTOS (ID, NOME, VALOR, CODIGO) VALUES(nextval('SQ_PRODUTO'),?,?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setInt(2, produto.getValor());
            stm.setString(3, produto.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !stm.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Produto pesquisar(String codigo) throws SQLException {
        ResultSet rs = null;
        Produto produto = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM PRODUTOS WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigo);
            rs = stm.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getInt("valor"));
                produto.setCodigo(rs.getString("codigo"));
            }
            return produto;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !stm.isClosed()) {
                connection.close();
            }
        }

    }

    @Override
    public Integer atualizar(Produto produto) throws SQLException {
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE PRODUTOS SET NOME = ? WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !stm.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer deletar(Produto produto) throws SQLException {
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM PRODUTOS WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !stm.isClosed()) {
                connection.close();
            }
        }
    }
}
