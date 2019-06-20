package ex28_10_myVersion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lavruk_28_10_1 {

 public static void main(String[] args) throws Exception {
  System.out.print("Enter a file name: ");
  //@SuppressWarnings("resource")
  
  Scanner fileName = new Scanner(System.in);
  java.io.File file = new java.io.File(fileName.nextLine());
	// Test if file exists
	if (!file.exists()) {
		System.out.println("The file \"" + file + "\" does not exist or the path is not corect");
		System.exit(0);
	}
  
  
  Scanner input = new Scanner(System.in);
  //String fileName = input.nextLine();
  System.out.print("Enter two vertices (integer indexes): ");
  int v1 = input.nextInt();
  int v2 = input.nextInt();
  
  
  //Scanner inputGraph = new Scanner(new File(fileName));
  Scanner inputGraph = new Scanner(file);
  int numberOfVertices = inputGraph.nextInt();
  //inputGraph.nextLine();
  System.out.println("The number of vertices is " + numberOfVertices);
  ArrayList<Integer> vertices = new ArrayList<>();
  
//Create a list of AbstractGraph.Edge objects
  ArrayList<AbstractGraph.Edge> edges = new ArrayList<>();
//Read data from file
  Scanner inputVertic = new Scanner(inputGraph.nextLine());
  for (int i = 0; i < numberOfVertices; i++) {
	     int vertex = inputVertic.nextInt();
	     vertices.add(vertex);
	     	while(inputVertic.hasNext()) {
    edges.add(new AbstractGraph.Edge(vertex, inputVertic.nextInt())); //add vertex
   }
  // inputVertic.close();
  }
 // inputGraph.close();
 // input.close();
  
  UnweightedGraph<Integer> graph = new UnweightedGraph<>(edges, vertices);
  graph.printEdges();
  
  List<Integer> result = graph.getPath(v1, v2);
  System.out.print("The path is ");
  for (Integer integer : result) {
   System.out.print(integer + " ");
  }
 }
 }
