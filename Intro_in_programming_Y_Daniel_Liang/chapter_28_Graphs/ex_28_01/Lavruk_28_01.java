package ex_28_01;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lavruk_28_01 {
	public static void main(String[] args) throws IOException {
		// Prompt the user to enter a file name
		System.out.print("Enter a file name: ");
		Scanner fileName = new Scanner(System.in);
		String filepath = fileName.next();
		
		// Test if file exists
		if(Files.exists(Paths.get(filepath))) { 
			
			// Test the error in the class
			String checkifitgraph = readFile(filepath, StandardCharsets.UTF_8);		
			if (checkifitgraph.replaceAll("\\s+", "").matches("\\d+")) {
				
				// Create a Scanner for the file
				java.io.File file = new java.io.File(filepath);
				Scanner input = new Scanner(file);
				int NUMBER_OF_VERTICES = input.nextInt();

				// Create a list of AbstractGraph.Edge objects
				ArrayList<Edge> edgeList = new ArrayList<>();

				// Create an array of vertices
				String[] vertices = new String[NUMBER_OF_VERTICES];
				
				
				// Read data from file
				input.nextLine();
				
				for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
					String s = input.nextLine();		
					String[] line = s.split("[\\s+]"); //will split the string into string of array with separator as space or multiple spaces. \s+ is a regular expression for one or more spaces.
					String u = line[0];
					vertices[j] = u; // Add vertex

					// Add edges for vertex u
					for (int i = 1; i < line.length; i++) {
						edgeList.add(new Edge(Integer.parseInt(u), 
							Integer.parseInt(line[i])));
					}	
				}

				// Create a graph
				Graph<String> graph = new UnweightedGraph<>(Arrays.asList(vertices), edgeList);

				// Display the number of vertices
				System.out.println("The number of vertices is " + graph.getSize());

				// Display edges
				for (int u = 0; u < NUMBER_OF_VERTICES; u++) {
					System.out.print("Vertex " + graph.getVertex(u) + ":");
					for (Integer e : graph.getNeighbors(u))
						System.out.print(" (" + u + ", " + e + ")");
					System.out.println();
				}		

				// Obtain an instance tree of AbstractGraph.Tree
				@SuppressWarnings("rawtypes")
				AbstractGraph.Tree tree = graph.dfs(0);

				// Test if graph is connected and print results
				System.out.println("The graph is " +
				(tree.getNumberOfVerticesFound() != graph.getSize() ? 
					"not " : "") + "connected");

				// Close the file
				fileName.close();
				input.close();	
								
				} else {
					System.out.println("The information in the file \"" + filepath + "\" contains an error, check the content of the file and try again");
				}		
									
		} else {
			System.out.println("The file \"" + filepath + "\" does not exist or the path is not correct");
		}

	}
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
}


