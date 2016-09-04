package ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GraphAdjList extends Graph{
	
	private Map<Integer,ArrayList<Integer>> adjListsMap;

	@Override
	public void implementAddVertex() {
		// TODO Auto-generated method stub
		int v = getNumVertices();
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		adjListsMap.put(v, neighbors);
		
	}

	@Override
	public List<Integer> getNeighbors(int v) {
		//return adjListsMap.get(v);
		//don't want to return the actual array list, this will let other methods modify the array list
		//instead wrap the list in a new array list object
		return new ArrayList<Integer>(adjListsMap.get(v));
		
	}
	
	public void implementAddEdge(int v, int w) {
		(adjListsMap.get(v)).add(w);
	}

}
