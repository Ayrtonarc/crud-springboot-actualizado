package com.example.CrudEjemplo.repository;

import com.example.CrudEjemplo.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //2establecer que es un repositorio
public interface UsuarioRepository extends CrudRepository<Usuario, Long> { //extends para usar los metodos de persistencia dentro, usuario y tipo de dato de la clave primaria
}
