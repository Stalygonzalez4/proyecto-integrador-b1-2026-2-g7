
package com.example.model;

public abstract class Equipo implements Identificable {

    private String numeroEquipo;
    private String modelo;
    private String estado;

    public Equipo(String numeroEquipo, String modelo, String estado) {
        this.numeroEquipo = numeroEquipo;
        this.modelo = modelo;
        this.estado = estado;
    }

    @Override
    public String getNumeroEquipo() {
        return numeroEquipo;
    }

    public void setNumeroEquipo(String numeroEquipo) {
        this.numeroEquipo = numeroEquipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract String getDescripcion();
}

