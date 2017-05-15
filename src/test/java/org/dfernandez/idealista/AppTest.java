package org.dfernandez.idealista;


import org.dfernandez.idealista.model.Direccion;
import org.dfernandez.idealista.service.ServiceApi;
import org.dfernandez.idealista.service.ServiceApiImpl;
import org.dfernandez.idealista.util.Constants;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private final String idOrigen = "idurb13";
    private final String idUrb1Str = "idurb1";
    private final String idUrb2Str = "idurb2";
    private final String idUrb6Str = "idurb6";
    private final String idUrb8Str = "idurb8";
    private final String idUrb18Str = "idurb18";
    private final String idUrb14Str = "idurb14";
    private final String idUrb12Str = "idurb12";

    private ServiceApi serviceApi;

    @Before
    public void setUp() {
        serviceApi = new ServiceApiImpl(Constants.DFS_ALGORITHM);

    }

    @Test
    public void checkOrigenCoordenates() {

        String idUrb = serviceApi.obtenerIdentificadorUrbanización(new BigDecimal("38.56889"), new BigDecimal("40.511107"));
        assertEquals(idOrigen, idUrb);

    }
    @Test
    public void checkOrigenCoordenatesUrbOne() {

        String idUrb = serviceApi.obtenerIdentificadorUrbanización(new BigDecimal("41.3666"), new BigDecimal("38.51"));
        assertEquals(idUrb1Str, idUrb);

    }

    @Test
    public void checkOrigenBorders() {
        assertEquals(idUrb8Str, serviceApi.obtenerIdentificadorUrbanización(idOrigen, Direccion.ARRIBA));
        assertEquals(idUrb18Str, serviceApi.obtenerIdentificadorUrbanización(idOrigen, Direccion.ABAJO));
        assertEquals(idUrb14Str, serviceApi.obtenerIdentificadorUrbanización(idOrigen, Direccion.DERECHA));
        assertEquals(idUrb12Str, serviceApi.obtenerIdentificadorUrbanización(idOrigen, Direccion.IZQUIERDA));

    }

    @Test
    public void checkOrigenBordersUrbOne() {
        assertEquals(null, serviceApi.obtenerIdentificadorUrbanización(idUrb1Str, Direccion.ARRIBA));
        assertEquals(idUrb6Str, serviceApi.obtenerIdentificadorUrbanización(idUrb1Str, Direccion.ABAJO));
        assertEquals(idUrb2Str, serviceApi.obtenerIdentificadorUrbanización(idUrb1Str, Direccion.DERECHA));
        assertEquals(null, serviceApi.obtenerIdentificadorUrbanización(idUrb1Str, Direccion.IZQUIERDA));

    }

    @Test
    public void checkObtenerUrbanizacionesRangoUno() {

        BigDecimal coordenadaX = new BigDecimal("38.56889");
        BigDecimal coordenadaY = new BigDecimal("40.511107");
        int rango = 1;

        assertThat(serviceApi.obtenerUrbanizaciones(coordenadaX, coordenadaY, rango),
                containsInAnyOrder( "idurb7", "idurb8", "idurb9",  "idurb12", "idurb13", "idurb14", "idurb17","idurb18", "idurb19"));
    }

    @Test
    public void checkObtenerUrbanizacionesRangoDos() {

        BigDecimal coordenadaX = new BigDecimal("41.3666");
        BigDecimal coordenadaY = new BigDecimal("38.51");
        int rango = 2;

        assertThat(serviceApi.obtenerUrbanizaciones(coordenadaX, coordenadaY, rango),
                containsInAnyOrder( "idurb1", "idurb2", "idurb3",  "idurb4", "idurb5", "idurb10", "idurb15","idurb20", "idurb25",
                        "idurb24",  "idurb23",  "idurb22",  "idurb21",  "idurb16",  "idurb11",  "idurb6"));
    }
}
