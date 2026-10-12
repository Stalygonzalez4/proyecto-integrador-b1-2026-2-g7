
package com.example.model;

public abstract class Equipo implements Identificable {

    private String numeroEquipo;
    private String modelo;
    private String Estadoestado;

    public Equipo(String numeroEquipo, String modelo,
                  String estado) {
        this.numeroEquipo = numeroEquipo;
        this.modelo = modelo;
        this.Estadoestado = estado;
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
        return Estadoestado;
    }

    public void setEstado(String estado) {
        this.Estadoestado = estado;
    }

    public abstract String getDescripcion();
}
