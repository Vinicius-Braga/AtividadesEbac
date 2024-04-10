package br.com.braga.service;

import br.com.braga.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    public String excluir() {
        contratoDao.salvar();
        return "Excluido com sucesso";
    }

    public String buscar() {
        contratoDao.salvar();
        return "Busca com sucesso";
    }

    public String atualizar() {
        contratoDao.salvar();
        return "Atualizado com sucesso";
    }
}
