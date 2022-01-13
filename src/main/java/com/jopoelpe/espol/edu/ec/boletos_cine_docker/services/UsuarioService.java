package com.jopoelpe.espol.edu.ec.boletos_cine_docker.services;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Usuario;
import com.jopoelpe.espol.edu.ec.boletos_cine_docker.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
