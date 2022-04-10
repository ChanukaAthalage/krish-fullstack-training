package BFS;

import java.util.ArrayList;
import java.util.Iterator;

public class BreadthFIrst {
	
	int vertexes;
	
	ArrayList<Integer> adjacency[];
	
	public BreadthFIrst(int noOfVertexes) {
		// TODO Auto-generated constructor stub
		
		vertexes = noOfVertexes;
		adjacency = new ArrayList[vertexes];
		
		for(int i=0; i<vertexes; i++) {
			
			adjacency[i] = new ArrayList<>();
		}
		
	}
	
	public void edge(int node1, int node2) {
		
		adjacency[node1].add(node2);
		
	}
	
	public void breathFirstSearch(int sourceVertex) {
		
		boolean[] visited = new boolean[vertexes];
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		visited[sourceVertex] = true;
		a1.add(sourceVertex);
		while(!a1.isEmpty()) {
			sourceVertex = a1.remove(0);
			System.out.print(sourceVertex+" ");
			Iterator i = adjacency[sourceVertex].iterator();
			while(i.hasNext()) {
				int n = (int) i.next();
				if(!visited[n]) {
					visited[n]=true;
					a1.add(n);
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BreadthFIrst bfs = new BreadthFIrst(7);
		bfs.edge(0, 1);
		bfs.edge(0, 2);
		bfs.edge(0, 5);
		bfs.edge(1, 0);
		bfs.edge(1, 3);
		bfs.edge(1, 5);
		bfs.edge(2, 0);
		bfs.edge(2, 6);
		bfs.edge(3, 1);
		bfs.edge(3, 4);
		bfs.edge(4, 3);
		bfs.edge(5, 4);
		bfs.edge(5, 1);
		bfs.edge(6, 2);
		
		bfs.breathFirstSearch(0);
		
	}

}
