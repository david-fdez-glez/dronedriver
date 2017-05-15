package org.dfernandez.idealista.service;

import org.dfernandez.idealista.model.Direccion;

import java.math.BigDecimal;
import java.util.List;

public interface ServiceApi {

    /**
     * dadas unas coordenadas, devuelve el identificador de la urbanización en la que están encerradas dichas coordenadas
     * @param coordenadaX
     * @param coordenadaY
     * @return
     */
    public String obtenerIdentificadorUrbanización(BigDecimal coordenadaX, BigDecimal coordenadaY);

    /**
     * dado un identificador y la dirección de adyacencia devuelve el identificador de la urbanización adyacente
     * @param idUrbOrigen
     * @param direction
     * @return
     */
    public String obtenerIdentificadorUrbanización(String idUrbOrigen, Direccion direction);

    /**
     * dadas unas coordenadas y un rango, nos devuelva el identificador de todos las urbanizaciones que deberá visitar el drone
     * @param coordenadaX
     * @param coordenadaY
     * @param rango
     * @return
     */
    public List<String> obtenerUrbanizaciones(BigDecimal coordenadaX, BigDecimal coordenadaY, int rango);
}
