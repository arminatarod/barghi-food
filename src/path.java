import java.util.ArrayList;

public class path {
    // for containing shortest distance path and its information
    private int time, nodecount;
    private ArrayList<Integer> pathNode;
    public int getNode(int index) {
        return pathNode.get(index);
    }
    public void addNode(int u) {
        pathNode.add(u);
    }
    public int nextNode(int u) {
        return -1;
    }
}
