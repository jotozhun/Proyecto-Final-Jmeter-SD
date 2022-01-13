package com.jopoelpe.espol.edu.ec.boletos_cine_docker.services;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Pelicula;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IPeliculaService {
    List<Pelicula> getAll();
    Pelicula save(Pelicula pelicula);
}
