package DFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DepthFirst {

	int vertexes;
	
	ArrayList<Integer> adjacency[];
	
	public DepthFirst(int noOfVertexes) {
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
	
	public void depthFirstSearch(int sourceVertex) {
		
		boolean[] visited = new boolean[vertexes];
		Stack<Integer> s = new Stack<Integer>();
		s.push(sourceVertex);
		int node;
		while(!s.isEmpty()) {
			sourceVertex = s.peek();
			s.pop();
			
		for(int i=0;i<adjacency[sourceVertex].size();i++) {
			node = adjacency[sourceVertex].get(i);
			if(!visited[node]) {
				s.push(node);
			}
		}
		if(visited[sourceVertex]==false) {
			System.out.print(sourceVertex + " ");
			visited[sourceVertex]=true;
		}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepthFirst dfs = new DepthFirst(6);
		dfs.edge(0, 1);
		dfs.edge(0, 2);
		dfs.edge(1, 0);
		dfs.edge(1, 2);
		dfs.edge(2, 1);
		dfs.edge(2, 0);
		dfs.edge(2, 3);
		dfs.edge(2, 4);
		dfs.edge(3, 2);
		dfs.edge(4, 2);
		dfs.edge(4, 5);
		dfs.edge(5, 0);
		dfs.edge(5, 4);
		
		dfs.depthFirstSearch(0);
		
	}

}
