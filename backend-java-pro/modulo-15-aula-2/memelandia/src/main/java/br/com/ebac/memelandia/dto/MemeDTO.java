package br.com.ebac.memelandia.dto;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Usuario;

import java.util.Date;

public record MemeDTO(
        String nome,
        String descricao,
        Date dataCadastro,
        CategoriaMeme categoriaMeme,
        Usuario usuario){
}
