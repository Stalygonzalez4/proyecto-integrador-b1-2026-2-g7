package com.example.model;

public class Usuario {
    private int idUsuario;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String telefono;
    private String contraseña;
    private String rolUsuario;
    private boolean Activo;

    public Usuario() {
    }

    public Usuario(int idUsuario, String tipoDocumento, String nombre, String apellido, String documento, String email,
            String telefono, String contraseña, String rolUsuario, boolean Activo) {
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.rolUsuario = rolUsuario;
        this.Activo = Activo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre
                + ", email=" + email
                + ", Documento=" + documento + ", telefono=" + telefono + ", Contraseña=" + contraseña + ", rolUsuario="
                + rolUsuario + ", Activo=" + Activo + "]";
    }
}
