import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    LinkedList<Vertex> vertices = new LinkedList<>();
    private Set<Character> intSymbols = Set.of('0', '1');
    private Set<Character> dot = Set.of('.', '-');

    public Graph() {
        //vertices.add(new Vertex(1, List.of(new Edge(1, 2, plus), new Edge(1, 5, intSymbols), new Edge(1, 4, left), new Edge(1, 3, dot))));
        vertices.add(new Vertex(1, List.of(new Edge(1, 2, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 2, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 3, dot))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 4, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(4, 4, intSymbols))));


    }

    public Integer getSize() {
        return vertices.size();
    }
}