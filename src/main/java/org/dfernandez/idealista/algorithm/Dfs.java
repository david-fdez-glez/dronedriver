package org.dfernandez.idealista.algorithm;

import org.dfernandez.idealista.service.ServiceApi;

import java.util.*;

public class Dfs extends AbstractSearch {

    private Stack<Node> stack;


    public Dfs(ServiceApi serviceApi) {
        super(serviceApi);
        this.stack = new Stack<>();
    }

    @Override
    protected void addNode(Node node) {
        stack.push(node);
    }

    @Override
    public List<String> search() {

        Set<String> setNodes = new HashSet<>();

        //Add startNode to stack
        addNode(startNode);
        //Add startNode to set
        setNodes.add(startNode.getIdUrb());

        while (!stack.isEmpty()) {
            Node element = stack.pop();

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
