package Learn;

public class Graphs_Vertices {
    public static void main(String[] args) {
        
    }
    public static int graphs(int vertices){
        // n vertices = n(n-1)/2 total possible  edges will be there 
        //each edge has two choices either present or not present
        int v = (vertices*(vertices-1))/2;
        return (int)Math.pow(2, v);
    }
}