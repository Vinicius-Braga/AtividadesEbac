package br.com.ebac.memelandia.dto;

import br.com.ebac.memelandia.entities.Usuario;

import java.util.Date;

public record CategoriaMemeDTO(
        String nome,
        String descricao,
        Date dataCadastro,
        Usuario usuario) {
}
