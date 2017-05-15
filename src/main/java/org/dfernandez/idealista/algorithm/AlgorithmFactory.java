package org.dfernandez.idealista.algorithm;

import org.dfernandez.idealista.service.ServiceApi;
import org.dfernandez.idealista.util.Constants;

public class AlgorithmFactory {

    public static AbstractSearch getSearchAlgorithm(int type, ServiceApi serviceApi) {

        switch (type) {
            case Constants.DFS_ALGORITHM:
                return new Dfs(serviceApi);
            case Constants.BFS_ALGORITHM:
                return new Bfs(serviceApi);
            default:
                return null;
        }
    }
}
