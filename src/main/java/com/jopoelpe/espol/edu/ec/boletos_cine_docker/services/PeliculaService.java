package com.jopoelpe.espol.edu.ec.boletos_cine_docker.services;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Pelicula;
import com.jopoelpe.espol.edu.ec.boletos_cine_docker.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAll()
    {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }


}
