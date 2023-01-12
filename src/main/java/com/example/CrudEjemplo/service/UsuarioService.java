package com.example.CrudEjemplo.service;

import com.example.CrudEjemplo.model.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuarioService {
//crear 4 metodos principales
    ArrayList<Usuario> getAllUser(); //devuelve todos los usuarios de la DB en una lista
    Optional<Usuario> getUserById(long id); //devuelve un usuario por id
    Usuario saveUser(Usuario u); //guardar y editar
    boolean deleteUserById(long id); //borrar usuario por id
}
