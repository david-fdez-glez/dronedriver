package org.dfernandez.idealista.model;

import java.math.BigDecimal;

public class Urbanizacion {

    /**
     * Identificador
     */
    private String name;
    /**
     * Mapa en el que se encuentra la urbanizacion
     */
    private String mapa;
    /**
     * Coordenada X
     */
    private BigDecimal coordenadaX;
    /**
     * Coordenada Y
     */
    private BigDecimal coordenadaY;
    /**
     * Rango dentro del mapa al que pertenece la urbanizacion
     */
    private int rango;

    public Urbanizacion(String name, String mapa, int rango) {
        this.name = name;
        this.mapa = mapa;
        this.rango = rango;
    }

    public Urbanizacion(String name, String mapa, BigDecimal coordenadaX, BigDecimal coordenadaY, int rango) {
        this.name = name;
        this.mapa = mapa;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.rango = rango;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCoordenadaX() {
        return coordenadaX;
    }

    public int getRango() {
        return rango;
    }

    public BigDecimal getCoordenadaY() {
        return coordenadaY;
    }

    public String getMapa() {
        return mapa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name);
        sb.append(", coordenadas:[").append(coordenadaX).append(",").append(coordenadaY).append("]");
        sb.append(", rango: ").append(rango);
        sb.append(", mapa: ").append(mapa) ;
        return sb.toString();
    }
}
