package org.dfernandez.idealista.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Class created to help to build the test "prueba drone"
 * In a real project, this class will be implemented in a different way
 */
public class Mapa {

    private String name;


    private Map<String, Urbanizacion> urbanizaciones;


    public Mapa(String name) {
        this.name = name;
        urbanizaciones = new HashMap<>();
    }

    public void addUrbanizacion(Urbanizacion urb) {
        urbanizaciones.put(urb.getName(), urb);
    }


    public Urbanizacion getUrb(String id) {
        return urbanizaciones.get(id);
    }

    public String getName() {
        return name;
    }

    public Map<String, Urbanizacion> getUrbanizaciones() {
        return urbanizaciones;
    }

    @Override
    public String toString() {
        return name;
    }
}
