package memelandia.memes.services;

import memelandia.memes.entities.Meme;
import memelandia.memes.repositories.RepositorioMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class ServicoMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoMeme.class);

    public Iterable<Meme> encontrarTodos(){
        LOGGER.info("Retornando "+  repositorioMeme.count() + " Memes");

        return repositorioMeme.findAll();
    }

    public Meme criarMeme(Meme meme) {
        LOGGER.info("Criando meme");
        return repositorioMeme.save(meme);
    }

    public Optional<Meme> encontrarMemeAleatorio(){
        LOGGER.info("Retornando Meme aleatorio");
        return repositorioMeme.findRandomMeme();
    }
}
