package src;

public class Main {




    public static void main(String[] args) {
        MyWeightedGraph<String> graph = new MyWeightedGraph<>(true);

        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

        System.out.println("Dijkstra:");
        MySearch<String> djk = new MyDijkstraMySearch<>(graph, "Almaty");
        outputPath(djk, "Kyzylorda");

//        System.out.println("DFS:");
//        src.Search<String> dfs = new src.DepthFirstSearch<>(graph, "Almaty");
//        outputPath(dfs, "Kyzylorda");
//
//        System.out.println("\n--------------------------------");
//
//        System.out.println("BFS:");
//        src.Search<String> bfs = new src.BreadthFirstSearch<>(graph, "Almaty");
//        outputPath(bfs, "Kyzylorda");
    }

    public static void outputPath(MySearch<String> mySearch, String key) {
        for (String v : mySearch.pathTo(key)) {
            System.out.print(v + " -> ");
        }
    }
}

