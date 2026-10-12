
package com.example.service;

import com.example.model.Equipo;
import com.example.model.EquipoGeneral;
import com.example.model.EstadoEquipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoService {

    private final List<Equipo> equipos = new ArrayList<>();

    public List<Equipo> listarEquipos() {
        return new ArrayList<>(equipos);
    }

    public boolean registrarEquipo(String numeroEquipo,
                                   String modelo,
                                   EstadoEquipo estado) {

        if (numeroEquipo == null || numeroEquipo.isBlank()
                || modelo == null || modelo.isBlank()
                || estado == null) {
            return false;
        }

        boolean existe = equipos.stream()
                .anyMatch(e -> e.getNumeroEquipo()
                        .equalsIgnoreCase(numeroEquipo.trim()));

        if (existe) {
            return false;
        }

        Equipo equipo = new EquipoGeneral(
                numeroEquipo.trim(),
                modelo.trim(),
                estado
        );

        equipos.add(equipo);
        return true;
    }

    public boolean eliminarEquipo(String numeroEquipo) {
        return equipos.removeIf(e ->
                e.getNumeroEquipo().equalsIgnoreCase(numeroEquipo));
    }

    public int contarEquipos() {
        return equipos.size();
    }

    public int contarPorEstado(EstadoEquipo estado) {
        return (int) equipos.stream()
                .filter(e -> e.getEstado() == estado)
                .count();
    }
}
