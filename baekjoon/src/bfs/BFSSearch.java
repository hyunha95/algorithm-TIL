package bfs;

import java.util.*;

public class BFSSearch {
    public Queue<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        Queue<String> visited = new LinkedList<>();
        Queue<String> needVisit = new LinkedList<>();

        needVisit.offer(startNode);

        while(!needVisit.isEmpty()) {
            String node = needVisit.poll();
            if(!visited.contains(node)) {
                visited.offer(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        BFSSearch bfsSearch = new BFSSearch();
        System.out.println(bfsSearch.bfsFunc(graph, "A"));

    }
}
