package org.example.service;

public interface IContratoService {
    default String  salvar() {
        return null;
    };
    default String  buscar() {
        return null;
    };
    default String  excluir() {
        return null;
    };
    default String  atualizar() {
        return null;
    };

}
