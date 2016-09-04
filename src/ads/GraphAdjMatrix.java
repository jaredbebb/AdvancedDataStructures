package ads;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {

	@Override
	public void implementAddVertex() {
		// TODO Auto-generated method stub
		
		int v = getNumVertices();
		if (v >= adjMatrix.length){
			int [][] newAdjMatrix = new int [v*2][v*2];
			for(int i=0; i<adjMatrix.length; i++){
				for (int j=0; j<adjMatrix.length; j++){
					newAdjMatrix[i][j] = adjMatrix[i][j];
				}
			}
			adjMatrix = newAdjMatrix;
		}
		for (int i=0; i<adjMatrix[v].length; i++){
			adjMatrix[v][i]=0;
		}
		

	}

	@Override
	public List<Integer> getNeighbors(int v) {
		List<Integer> neighbors = new ArrayList<Integer>();
		for(int i = 0; i < getNumVertices(); i++){
			if(adjMatrix[v][i] != 0){
				neighbors.add(i);
			}
			
		}
		return neighbors;
	}
	
	private int [] [] adjMatrix;
	
	public void implementAddEdge(int v, int w){
		adjMatrix[v][w] = 1;
	}
	

}
