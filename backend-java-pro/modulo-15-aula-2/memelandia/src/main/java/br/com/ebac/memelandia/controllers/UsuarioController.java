package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public void cadastrarUsuario(@RequestBody UsuarioDTO usuario) {
        usuarioService.novoUsuario(usuario);
    }

    @GetMapping()
    public List<Usuario> listarUsuarios() {
        return usuarioService.listaTodosUsuarios();
    }

}
