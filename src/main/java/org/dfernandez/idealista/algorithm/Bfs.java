package org.dfernandez.idealista.algorithm;

import org.dfernandez.idealista.service.ServiceApi;

import java.util.*;

public class Bfs extends AbstractSearch {

    private Queue<Node> queue;

    public Bfs(ServiceApi serviceApi) {
        super(serviceApi);
        this.queue = new LinkedList<>();
    }

    @Override
    protected void addNode(Node node) {
        queue.add(node);
    }

    @Override
    public List<String> search() {

        Set<String> setNodes = new HashSet<>();

        //Add startNode to stack
        addNode(startNode);
        //Add startNode to set
        setNodes.add(startNode.getIdUrb());

        while (!queue.isEmpty()) {
            Node element = queue.remove();

            List<Node> neighbours = fidNeighbours(element);

            for(Node node: neighbours) {
                if(node != null && !setNodes.contains(node.getIdUrb())) {
                    addNode(node);
                    setNodes.add(node.getIdUrb());
                }
            }

        }

        List<String> searchResult = new ArrayList<>();
        searchResult.addAll(setNodes);

        return searchResult;
    }
}
