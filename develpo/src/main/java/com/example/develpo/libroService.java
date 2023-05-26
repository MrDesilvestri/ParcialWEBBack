package com.example.develpo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class libroService {
    @Autowired
    private libroRepository libroRepository;
    public List<libro> obtener(){
        return libroRepository.findAll();
    };
    public void add(libro libro){
        libroRepository.save(libro);
    };
}
