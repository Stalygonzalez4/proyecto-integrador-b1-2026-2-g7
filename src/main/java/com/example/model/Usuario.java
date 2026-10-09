package com.example.model;


public class Usuario {
    private int id; 
    private String Nombre;
    private String Apellido;
    private String Documento;
    private String Email;
    private String Telefono;
    private String Contraseña;
    private boolean Activo;

    public Usuario() {
    }

    public Usuario(int id, String Nombre, String Apellido, String Documento, String Email, String Telefono, String Contraseña, boolean Activo) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
        this.Activo = Activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getApellido() {
        return Apellido;
    }


    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }


    public String getEmail() {
        return this.Email       ;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContraseña() {
        return this.Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean isActivo() {
        return this.Activo;
    }

    public boolean getActivo() {
        return this.Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }


    public String getDocumento() {
        return Documento;
    }


    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }



    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", Documento=" + Documento + ", telefono=" + telefono + ", Contraseña=" + Contraseña + ", Activo=" + Activo + "]";
    }
}
