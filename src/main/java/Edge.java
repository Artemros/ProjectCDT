import java.util.Set;

public class Edge {
    private int begin;
    private int end;
    private Set<Character> state;

    public Edge(int begin, int end, Set<Character> state) {
        this.begin = begin;
        this.end = end;
        this.state = state;
    }

    public Set<Character> getState() {
        return state;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }
}