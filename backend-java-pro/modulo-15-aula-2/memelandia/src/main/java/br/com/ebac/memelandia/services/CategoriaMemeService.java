package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.repositories.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMemeService {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme novaCategoriaMeme(CategoriaMemeDTO categoriaMeme) {
        CategoriaMeme novaCategoriaMeme = new CategoriaMeme(categoriaMeme);
        return repositorioCategoriaMeme.save(novaCategoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
