package dfs;

import java.util.*;

public class DFSSearch {
    public Queue<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        Queue<String> visited = new LinkedList<>();
        Stack<String> needVisit = new Stack<>();

        needVisit.push(startNode);
        while(!needVisit.empty()) {
            String node = needVisit.pop();
            if(!visited.contains(node)){
                visited.offer(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();

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

        DFSSearch dfsSearch = new DFSSearch();
        System.out.println(dfsSearch.dfsFunc(graph, "A"));
    }
}
