package com.example.CrudEjemplo.service;

import com.example.CrudEjemplo.model.Usuario;
import com.example.CrudEjemplo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServicelmpl implements UsuarioService{ //implementacion de los metodos

    @Autowired //inyectar repositorio
    UsuarioRepository usuarioRepository;

    @Override
    public ArrayList<Usuario> getAllUser() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUserById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario saveUser(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public boolean deleteUserById(long id) {
        try {
            Optional<Usuario> u = getUserById(id);
            usuarioRepository.delete(u.get());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
