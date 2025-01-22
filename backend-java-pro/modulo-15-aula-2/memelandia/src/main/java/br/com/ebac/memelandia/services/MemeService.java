package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.MemeDTO;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public void novoMeme(MemeDTO meme) {
        Meme novoMeme = new Meme(meme);
        repositorioMeme.save(novoMeme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }
}
