package br.com.braga.services;

import br.com.braga.domain.Cliente;
import br.com.braga.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf) ;

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
