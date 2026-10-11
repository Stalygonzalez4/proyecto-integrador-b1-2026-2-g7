
package com.example.model;

public enum EstadoEquipo {
    PRESTADO("Prestado"),
    DANADO("Dañado");

    private final String nombre;

    EstadoEquipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
