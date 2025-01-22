package memelandia.users.controllers;

import memelandia.users.entities.Usuario;
import memelandia.users.services.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return servicoUsuario.criarUsuario(usuario);
    }

    @GetMapping(path = "/random")
    public Optional<Usuario> encontrarUsuarioAleatorio(){
        return servicoUsuario.encontrarUsuarioAleatorio();
    }

    @GetMapping
    public Iterable<Usuario> encontrarTodos(){
        return servicoUsuario.encontrarTodos();
    }
}
