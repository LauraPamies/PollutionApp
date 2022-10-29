package com.example.pollutiontracker;

public class Usuario {
    String Nombre,Mail,Usuario,Contrasena;
    int telefono;

    public Usuario(String nombre, String mail, String usuario, String contrasena, int telefono) {
        Nombre = nombre;
        Mail = mail;
        Usuario = usuario;
        Contrasena = contrasena;
        this.telefono = telefono;
    }

    public Usuario(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
