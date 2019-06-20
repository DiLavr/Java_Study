package ex28_10_myVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lavruk_28_10 {
public static void main(String[] args) throws FileNotFoundException {

	System.out.print("Enter a file name: ");
	
	  Scanner input = new Scanner(System.in);
	  String fileName = input.nextLine();
	
	  System.out.print("Enter two vertices (integer indexes): ");
	  int v1 = input.nextInt();
	  int v2 = input.nextInt();
	  
	  Scanner inputGraph = new Scanner(new File(fileName));
	  int numberOfVertices = inputGraph.nextInt();
	  inputGraph.nextLine();
	  
	  System.out.println("The number of vertices is " + numberOfVertices);
	  ArrayList<Integer> vertices = new ArrayList<>();
	  ArrayList<AbstractGraph.Edge> edges = new ArrayList<>();
	  for (int i = 0; i < numberOfVertices; i++) {
	   Scanner inputVertic = new Scanner(inputGraph.nextLine());
	   int vertex = inputVertic.nextInt();
	   vertices.add(vertex);
	   while(inputVertic.hasNext()) {
	    edges.add(new AbstractGraph.Edge(vertex, inputVertic.nextInt()));
	   }
	   inputVertic.close();
	  }
	  inputGraph.close();
	  UnweightedGraph<Integer> graph = new UnweightedGraph<>(edges, vertices);
	  graph.printEdges();
	  
	  List<Integer> result = graph.getPath(v1, v2);
	  System.out.print("The path is ");
	  for (Integer integer : result) {
	   System.out.print(integer + " ");
	  }
	 }
}