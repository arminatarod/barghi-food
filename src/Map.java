import java.util.ArrayList;

public class Map {
    // ye data structure baraye adj graph
    private class edge{
        private int weight, u;
        public void setU(int u) {
            this.u = u;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public int getU() {
            return u;
        }
        public int getWeight() {
            return weight;
        }
    }
    private ArrayList<edge>[] graph;
    public void readGraphFromFile(String address) {

    }
    public int distance (int node1, int node2){
        return 0;
    }
    public path shortestPath (int node1, int node2){
        return new path();
    }

}
