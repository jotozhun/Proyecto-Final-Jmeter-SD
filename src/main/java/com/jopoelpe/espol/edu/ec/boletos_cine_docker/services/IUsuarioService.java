package com.jopoelpe.espol.edu.ec.boletos_cine_docker.services;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> getAll();
    Usuario save(Usuario usuario);
}
