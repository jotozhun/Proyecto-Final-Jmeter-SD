package com.jopoelpe.espol.edu.ec.boletos_cine_docker.controller;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Pelicula;
import com.jopoelpe.espol.edu.ec.boletos_cine_docker.services.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    /*
    @Autowired
    private PeliculaRepository peliculaRepository;
    */
    @GetMapping("/peliculas")
    public List<Pelicula> getAllPeliculas(){ return peliculaService.getAll(); }

    @PostMapping("/peliculas")
    public Pelicula createPelicula(@RequestBody Pelicula pelicula){ return peliculaService.save(pelicula);}
/*
    @GetMapping("/peliculas/{id_pelicula}")
    public ResponseEntity<Pelicula> getPeliculaById(@PathVariable Integer id_pelicula)
    {
        Pelicula pelicula = peliculaRepository.findById(id_pelicula)
                .orElseThrow(() -> new ResourceNotFoundException("Esta pelicula no existe"));
        return ResponseEntity.ok(pelicula);
    }
     */
}
