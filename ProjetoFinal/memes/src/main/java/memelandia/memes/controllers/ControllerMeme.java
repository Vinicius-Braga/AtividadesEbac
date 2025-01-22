package memelandia.memes.controllers;

import memelandia.memes.entities.Meme;
import memelandia.memes.services.ServicoMeme;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;



    @PostMapping
    public Meme criarMeme(@RequestBody @Valid Meme meme){
        return servicoMeme.criarMeme(meme);
    }

    @GetMapping
    public Iterable<Meme> encontrarTodos(){


        return servicoMeme.encontrarTodos();
    }

    @GetMapping(path = "/random")
    public Optional<Meme> encontrarMemeAleatorio(){
        return servicoMeme.encontrarMemeAleatorio();
    }
}
