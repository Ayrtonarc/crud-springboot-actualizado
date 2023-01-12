package com.example.CrudEjemplo.controllers;

import com.example.CrudEjemplo.model.Usuario;
import com.example.CrudEjemplo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    UsuarioService usuarioService; //inyectar el servicio
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola m desde ApiDemo";
    }

    //api
    @GetMapping("/all")
    public ArrayList<Usuario> getAllUser(){
        return usuarioService.getAllUser();
    }

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id")long id){
        return usuarioService.getUserById(id);
    }
    @PostMapping("/save")
    public Usuario saveUser(@RequestBody Usuario u){
        return usuarioService.saveUser(u);
    }

}
