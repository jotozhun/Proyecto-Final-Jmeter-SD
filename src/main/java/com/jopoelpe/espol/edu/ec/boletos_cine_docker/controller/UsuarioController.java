package com.jopoelpe.espol.edu.ec.boletos_cine_docker.controller;

import com.jopoelpe.espol.edu.ec.boletos_cine_docker.models.Usuario;
import com.jopoelpe.espol.edu.ec.boletos_cine_docker.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UsuarioController {
    /*
    @Autowired
    private UsuarioRepository usuarioRepository;
    */
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios(){ return usuarioService.getAll();}


    @PostMapping("/usuarios")
    public Usuario createUsuario(@RequestBody Usuario usuario){ return usuarioService.save(usuario);}
    /*
    @GetMapping("/usuarios/{id_user}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id_user)
    {
        Usuario usuario = usuarioRepository.findById(id_user)
                .orElseThrow(() -> new ResourceNotFoundException("Este usuario no existe!"));
        return ResponseEntity.ok(usuario);
    }
     */
}
