package ex_28_01;

public interface Graph<V> {
	/** Add an edge to the graph */
	public boolean addEdge(int u, int v);

	/** Add a vertex to the graph */
	public boolean addVertex(V vertex);

	/** Obtains a breadth-first search tree starting from v */
	public AbstractGraph<V>.Tree bfs(int v);

	/** Clears the graph */
	public void clear();

	/** Obtains a depth-first search tree starting from v */
	public AbstractGraph<V>.Tree dfs(int v);

	/** Return the degree for a specified vertex */
	public int getDegree(int v);

	/** Return the index for the specified vertex object */
	public int getIndex(V v);

	/** Return the neighbors of vertex with the specified index */
	public java.util.List<Integer> getNeighbors(int index);

	/** Returns the number of vertices in the graph */
	public int getSize();

	/** Return the object for the specified vertex index */
	public V getVertex(int index);

	/** Return the vertices in the graph */
	public java.util.List<V> getVertices();

	/** Print the edges */
	public void printEdges();
}

