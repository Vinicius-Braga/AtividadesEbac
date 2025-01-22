package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public void novoUsuario(UsuarioDTO usuario) {
        Usuario novoUsuario = new Usuario(usuario);
        repositorioUsuario.save(novoUsuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }
}
