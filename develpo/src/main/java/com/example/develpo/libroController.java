package com.example.develpo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/libro")
public class libroController {
    @Autowired
    private libroService service;

    @GetMapping("/listar")
    public List<libro> listarLibro(){
        return service.obtener();
    }
    @PostMapping("/agregar")
    public void agregarLibro(@RequestBody libro libro){
        service.add(libro);
    }
 
}
