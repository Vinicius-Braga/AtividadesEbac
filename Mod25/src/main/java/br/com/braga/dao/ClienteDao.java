package br.com.braga.dao;

import br.com.braga.dao.generics.GenericDao;
import br.com.braga.domain.Cliente;

public class ClienteDao extends GenericDao<Cliente> implements IClienteDao{
    public ClienteDao() {
        super();
    }
    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }


}
