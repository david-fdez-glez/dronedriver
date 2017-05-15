package org.dfernandez.idealista.algorithm;

import java.util.List;

/**
 * The <code>Search</code> interface should be implemented by any
 * class whose instances are intended to executed a search algorithm.
 */
public interface Search {


    /**
     * Search algorithm
     *
     * @return el identificador de todos las urbanizaciones que deberá visitar el drone
     */
    public List<String> search();

    /**
     * Set algorithm startNode
     * @param startNode
     */
    public void setStartNode(Node startNode);

}
