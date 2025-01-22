package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.services.CategoriaMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriaMeme")
public class CategoriaMemeController {

    @Autowired
    CategoriaMemeService categoriaMemeService;

    @PostMapping
    public void cadastrarCategoriaMeme(@RequestBody CategoriaMemeDTO categoriaMeme) {
        categoriaMemeService.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping
    public List<CategoriaMeme> listarCategoriaMeme() {
        return categoriaMemeService.listaTodasCategorias();
    }
}
