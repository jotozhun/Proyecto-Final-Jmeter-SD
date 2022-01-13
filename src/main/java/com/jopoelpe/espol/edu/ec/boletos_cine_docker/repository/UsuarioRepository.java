package com.jopoelpe.espol.edu.ec.boletos_cine_docker.repository;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
