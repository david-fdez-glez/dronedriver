package org.dfernandez.idealista.service;

import org.dfernandez.idealista.algorithm.*;
import org.dfernandez.idealista.model.Direccion;
import org.dfernandez.idealista.model.Mapa;
import org.dfernandez.idealista.model.Urbanizacion;
import org.dfernandez.idealista.util.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServiceApiImpl implements ServiceApi {

    Search searchAlg;
    /**
     * Mapa añadido aqui para facilitar la implementacion y los tests del drone driver
     *
     */
    Mapa mapaPrueba;


    public ServiceApiImpl(int typeSearchAlg) {

        searchAlg = AlgorithmFactory.getSearchAlgorithm(typeSearchAlg, this);

       initMapa();
    }


    @Override
    public List<String> obtenerUrbanizaciones(BigDecimal coordenadaX, BigDecimal coordenadaY, int rango) {

        List<String> urbs = new ArrayList<>();

        String idUrb = obtenerIdentificadorUrbanización(coordenadaX, coordenadaY);

        if(mapaPrueba.getUrb(idUrb) != null) {
            Urbanizacion urb = mapaPrueba.getUrb(idUrb);

            if(urb.getRango() == rango) {
                //searchAlg = new Dfs(this, new Node(idUrb));
                searchAlg.setStartNode(new Node(idUrb));
                urbs = searchAlg.search();
            }

        }
        return urbs;
    }

    @Override
    public String obtenerIdentificadorUrbanización(BigDecimal coordenadaX, BigDecimal coordenadaY) {
        //Hard Code this function:idealista i+d ya ha programado dos funciones del driver:
        BigDecimal idOrigenX = new BigDecimal("38.56889");
        BigDecimal idOrigenY = new BigDecimal("40.511107");

        BigDecimal idUrbOneX = new BigDecimal("41.3666");
        BigDecimal idUrbOneY = new BigDecimal("38.51");


        if(idOrigenX.compareTo(coordenadaX) == 0 && idOrigenY.compareTo(coordenadaY) == 0) {
            return "idurb13";
        }

        if(idUrbOneX.compareTo(coordenadaX) == 0 && idUrbOneY.compareTo(coordenadaY) == 0) {
            return "idurb1";
        }
        return null;
    }

    @Override
    public String obtenerIdentificadorUrbanización(String idUrbOrigen, Direccion direction) {
        //Hard Code this function:idealista i+d ya ha programado dos funciones del driver:
        final String idOrigen = "idurb13";
        final String idurb8 = "idurb8";
        final String idurb18 = "idurb18";
        final String idurb14 = "idurb14";
        final String idurb9 = "idurb9";
        final String idurb7 = "idurb7";
        final String idurb19 = "idurb19";
        final String idurb17 = "idurb17";
        final String idurb12 = "idurb12";

        final String idurb1 = "idurb1";
        final String idurb2 = "idurb2";
        final String idurb3 = "idurb3";
        final String idurb4 = "idurb4";
        final String idurb5 = "idurb5";
        final String idurb10 = "idurb10";
        final String idurb15 = "idurb15";
        final String idurb20 = "idurb20";
        final String idurb25 = "idurb25";
        final String idurb24 = "idurb24";
        final String idurb23 = "idurb23";
        final String idurb22 = "idurb22";
        final String idurb21 = "idurb21";
        final String idurb16 = "idurb16";
        final String idurb11 = "idurb11";
        final String idurb6 = "idurb6";


        switch (idUrbOrigen) {
            case idOrigen:
                switch (direction) {
                    case ARRIBA:
                        return idurb8;
                    case ABAJO:
                        return idurb18;
                    case DERECHA:
                        return idurb14;
                    case IZQUIERDA:
                        return idurb12;
                }
                break;
            case idurb8:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return idOrigen;
                    case DERECHA:
                        return idurb9;
                    case IZQUIERDA:
                        return idurb7;
                }
                break;
            case idurb9:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return idurb14;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return idurb8;
                }
                break;
            case idurb14:
                switch (direction)    {
                    case ARRIBA:
                        return idurb9;
                    case ABAJO:
                        return idurb19;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return idOrigen;
                }
                break;
            case idurb19:
                switch (direction)    {
                    case ARRIBA:
                        return idurb14;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return idurb18;
                }
                break;
            case idurb18:
                switch (direction)    {
                    case ARRIBA:
                        return idOrigen;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb19;
                    case IZQUIERDA:
                        return idurb17;
                }
                break;
            case idurb17:
                switch (direction)    {
                    case ARRIBA:
                        return idurb12;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb18;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb12:
                switch (direction)    {
                    case ARRIBA:
                        return idurb7;
                    case ABAJO:
                        return idurb17;
                    case DERECHA:
                        return idOrigen;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb7:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return idurb12;
                    case DERECHA:
                        return idurb8;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb1:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return idurb6;
                    case DERECHA:
                        return idurb2;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb2:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb3;
                    case IZQUIERDA:
                        return idurb1;
                }
                break;
            case idurb3:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb4;
                    case IZQUIERDA:
                        return idurb2;
                }
                break;
            case idurb4:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb5;
                    case IZQUIERDA:
                        return idurb3;
                }
                break;
            case idurb5:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return idurb10;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return idurb4;
                }
                break;
            case idurb10:
                switch (direction)    {
                    case ARRIBA:
                        return idurb5;
                    case ABAJO:
                        return idurb15;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb15:
                switch (direction)    {
                    case ARRIBA:
                        return idurb10;
                    case ABAJO:
                        return idurb20;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb20:
                switch (direction)    {
                    case ARRIBA:
                        return idurb15;
                    case ABAJO:
                        return idurb25;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb25:
                switch (direction)    {
                    case ARRIBA:
                        return idurb20;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return idurb24;
                }
                break;
            case idurb24:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb25;
                    case IZQUIERDA:
                        return idurb23;
                }
                break;
            case idurb23:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb24;
                    case IZQUIERDA:
                        return idurb22;
                }
                break;
            case idurb22:
                switch (direction)    {
                    case ARRIBA:
                        return null;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb23;
                    case IZQUIERDA:
                        return idurb21;
                }
                break;
            case idurb21:
                switch (direction)    {
                    case ARRIBA:
                        return idurb16;
                    case ABAJO:
                        return null;
                    case DERECHA:
                        return idurb22;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb16:
                switch (direction)    {
                    case ARRIBA:
                        return idurb11;
                    case ABAJO:
                        return idurb21;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb11:
                switch (direction)    {
                    case ARRIBA:
                        return idurb6;
                    case ABAJO:
                        return idurb16;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
            case idurb6:
                switch (direction)    {
                    case ARRIBA:
                        return idurb1;
                    case ABAJO:
                        return idurb11;
                    case DERECHA:
                        return null;
                    case IZQUIERDA:
                        return null;
                }
                break;
        }


        return null;
    }


    /**
     * Crear info para mapa de prueba
     */
    private void initMapa() {

        String mapName = "pruebadrone";
        String idUrbOrigen = "idurb13";

        mapaPrueba = new Mapa(mapName);

        Urbanizacion idOrigen = new Urbanizacion(idUrbOrigen, mapName, new BigDecimal("38.56889"), new BigDecimal("40.511107"),1);
        Urbanizacion idurb8 = new Urbanizacion("idurb8", mapName, new BigDecimal("39.7666"), new BigDecimal("40.511107"),1);
        Urbanizacion idurb9 = new Urbanizacion("idurb9", mapName, new BigDecimal("39.7666"), new BigDecimal("42.107"),1);
        Urbanizacion idurb14 = new Urbanizacion("idurb14", mapName, new BigDecimal("38.56889"), new BigDecimal("42.107"),1);
        Urbanizacion idurb19 = new Urbanizacion("idurb19", mapName, new BigDecimal("37.89"), new BigDecimal("42.107"),1);
        Urbanizacion idurb18 = new Urbanizacion("idurb18", mapName, new BigDecimal("37.89"), new BigDecimal("40.511107"),1);
        Urbanizacion idurb17 = new Urbanizacion("idurb17", mapName, new BigDecimal("37.89"), new BigDecimal("39.07"),1);
        Urbanizacion idurb12 = new Urbanizacion("idurb12", mapName, new BigDecimal("38.56889"), new BigDecimal("39.07"),1);
        Urbanizacion idurb7 = new Urbanizacion("idurb7", mapName, new BigDecimal("39.7666"), new BigDecimal("39.07"),1);

        Urbanizacion idurb1 = new Urbanizacion("idurb1", mapName, new BigDecimal("41.3666"), new BigDecimal("38.51"),2);
        Urbanizacion idurb2 = new Urbanizacion("idurb2", mapName, new BigDecimal("41.3666"), new BigDecimal("39.07"),2);
        Urbanizacion idurb3 = new Urbanizacion("idurb3", mapName, new BigDecimal("41.3666"), new BigDecimal("40.511107"),2);
        Urbanizacion idurb4 = new Urbanizacion("idurb4", mapName, new BigDecimal("41.3666"), new BigDecimal("42.107"),2);
        Urbanizacion idurb5 = new Urbanizacion("idurb5", mapName, new BigDecimal("41.3666"), new BigDecimal("44.91"),2);

        Urbanizacion idurb10 = new Urbanizacion("idurb10", mapName, new BigDecimal("39.7666"), new BigDecimal("44.91"),2);
        Urbanizacion idurb15 = new Urbanizacion("idurb15", mapName, new BigDecimal("38.56889"), new BigDecimal("44.91"),2);
        Urbanizacion idurb20 = new Urbanizacion("idurb20", mapName, new BigDecimal("37.89"), new BigDecimal("44.91"),2);
        Urbanizacion idurb25 = new Urbanizacion("idurb25", mapName, new BigDecimal("35.34"), new BigDecimal("44.91"),2);

        Urbanizacion idurb24 = new Urbanizacion("idurb24", mapName, new BigDecimal("35.34"), new BigDecimal("42.107"),2);
        Urbanizacion idurb23 = new Urbanizacion("idurb23", mapName, new BigDecimal("35.34"), new BigDecimal("40.511107"),2);
        Urbanizacion idurb22 = new Urbanizacion("idurb22", mapName, new BigDecimal("35.34"), new BigDecimal("39.07"),2);
        Urbanizacion idurb21 = new Urbanizacion("idurb21", mapName, new BigDecimal("35.34"), new BigDecimal("38.51"),2);

        Urbanizacion idurb16 = new Urbanizacion("idurb1", mapName, new BigDecimal("37.89"), new BigDecimal("38.51"),2);
        Urbanizacion idurb11 = new Urbanizacion("idurb1", mapName, new BigDecimal("38.56889"), new BigDecimal("38.51"),2);
        Urbanizacion idurb6 = new Urbanizacion("idurb1", mapName, new BigDecimal("39.7666"), new BigDecimal("38.51"),2);

        mapaPrueba.addUrbanizacion(idOrigen);
        mapaPrueba.addUrbanizacion(idurb8);
        mapaPrueba.addUrbanizacion(idurb9);
        mapaPrueba.addUrbanizacion(idurb14);
        mapaPrueba.addUrbanizacion(idurb19);
        mapaPrueba.addUrbanizacion(idurb18);
        mapaPrueba.addUrbanizacion(idurb17);
        mapaPrueba.addUrbanizacion(idurb12);
        mapaPrueba.addUrbanizacion(idurb7);

        mapaPrueba.addUrbanizacion(idurb1);
        mapaPrueba.addUrbanizacion(idurb2);
        mapaPrueba.addUrbanizacion(idurb3);
        mapaPrueba.addUrbanizacion(idurb4);
        mapaPrueba.addUrbanizacion(idurb5);

        mapaPrueba.addUrbanizacion(idurb10);
        mapaPrueba.addUrbanizacion(idurb15);
        mapaPrueba.addUrbanizacion(idurb20);
        mapaPrueba.addUrbanizacion(idurb25);

        mapaPrueba.addUrbanizacion(idurb24);
        mapaPrueba.addUrbanizacion(idurb23);
        mapaPrueba.addUrbanizacion(idurb22);
        mapaPrueba.addUrbanizacion(idurb21);

        mapaPrueba.addUrbanizacion(idurb16);
        mapaPrueba.addUrbanizacion(idurb11);
        mapaPrueba.addUrbanizacion(idurb6);
    }
}
