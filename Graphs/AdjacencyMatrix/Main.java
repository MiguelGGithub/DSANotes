package Graphs.AdjacencyMatrix;

public class Main {

    //see Graph.java and Node.java for the full implementation

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A')); //Index 0
        graph.addNode(new Node('B')); //Index 1
        graph.addNode(new Node('C')); //Index 2
        graph.addNode(new Node('D')); //Index 3
        graph.addNode(new Node('E')); //Index 4

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,2);
        graph.addEdge(4,0);

        graph.printGraph();

        //System.out.println(graph.checkEdge(0,1)); //true

        //graph.depthFirstSearch(2); //A B C D E

        graph.breadthFirstSearch(2); //A B C D E
    }
}
