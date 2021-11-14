import java.util.Set;

public class Recognizer {
    Set<Character> allSymbols = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9','+','(',')','.', '-');

    int nextState(int length, int numOfCurrState, String symbolsLane, int current) {
        Graph graph = new Graph();
        int answer = 0;
        if (numOfCurrState == length) {
            if(current == 2 || current==4){
                answer=1;
            }
        } else {
            Character i1 = symbolsLane.charAt(numOfCurrState);
            for (int i = 0; i < graph.getSize(); i++) {
                int begin = graph.vertices.get(i).edges.get(0).getBegin();
                if (begin == current) {
                    for (int j = 0; j < graph.vertices.get(i).getSize(); j++) {
                        int end = graph.vertices.get(i).edges.get(j).getEnd();
                        Character character = symbolsLane.charAt(numOfCurrState);
                        Set<Character> st = graph.vertices.get(i).edges.get(j).getState();
                        boolean contains = graph.vertices.get(i).edges.get(j).getState().contains(i1);
                        if(allSymbols.contains(i1)) {
                            if (contains) {
                                answer = nextState(length, numOfCurrState + 1, symbolsLane, graph.vertices.get(i).edges.get(j).getEnd());
                            }
                        }else{
                            answer=-1;
                            return answer;
                        }
                    }
                }
            }
        }
        return answer;
    }

}