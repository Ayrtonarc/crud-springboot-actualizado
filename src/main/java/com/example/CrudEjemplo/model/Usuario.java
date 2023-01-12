package com.example.CrudEjemplo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity   //para que esta clase se convierta en una tabla en la BDD
public class Usuario {
    @Id //para que sea llave primearia
    @GeneratedValue(strategy = GenerationType.IDENTITY) //squencia para que se generen automaticamente
    private long id;
    private String nombre;
    private String direccion;
    private String email;

    public Usuario(String nombre, String direccion, String email) { //constructor sin id
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public long getId() { //getter setters
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
