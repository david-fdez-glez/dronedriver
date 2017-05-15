package org.dfernandez.idealista.algorithm;

import org.dfernandez.idealista.model.Direccion;
import org.dfernandez.idealista.service.ServiceApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class search algorithm
 */
abstract class AbstractSearch implements Search {

    protected Node startNode;
    protected ServiceApi serviceApi;

    protected AbstractSearch() {
    }

    public AbstractSearch(ServiceApi serviceApi) {
        this.serviceApi = serviceApi;
    }


    protected abstract void addNode(Node node);

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    void setServiceApi(ServiceApi serviceApi) {
        this.serviceApi = serviceApi;
    }

    /**
     * Find Neighbours: ARRIBA, ABAJO, DERECHA, IZQUIERDA;
     * @param actual
     * @return
     */
    protected final List<Node> fidNeighbours(Node actual) {

        List<Node> neighbours = new ArrayList<>();
        //Iterate through all possible Direccion Values
        for(Direccion direction: Direccion.values()) {
            //obtener identificador de la urbanizacion adyacente dada una direccion
            if(serviceApi.obtenerIdentificadorUrbanización(actual.getIdUrb(),direction ) != null) {
                String idUrb = serviceApi.obtenerIdentificadorUrbanización(actual.getIdUrb(), direction);
                neighbours.add(new Node(idUrb));
            }
        }

        return neighbours;
    }

}
