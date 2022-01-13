package com.jopoelpe.espol.edu.ec.boletos_cine_docker.repository;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {
}
