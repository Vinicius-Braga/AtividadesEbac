package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.dto.MemeDTO;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.services.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meme")
public class MemeController {

    @Autowired
    private MemeService memeService;

    @PostMapping
    public void novoMeme(@RequestBody MemeDTO meme) {
        memeService.novoMeme(meme);
    }

    @GetMapping
    public List<Meme> listarMemes() {
        return memeService.listaTodosMemes();
    }
}
