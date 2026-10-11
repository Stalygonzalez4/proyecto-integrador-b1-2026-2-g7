
package com.example.model;

public class EquipoGeneral extends Equipo {

    public EquipoGeneral(String numeroEquipo, String modelo,
                         EstadoEquipo estado) {
        super(numeroEquipo, modelo, estado);
    }

    @Override
    public String getDescripcion() {
        return "Equipo " + getNumeroEquipo()
                + " - Modelo: " + getModelo()
                + " - Estado: " + getEstado();
    }
}
