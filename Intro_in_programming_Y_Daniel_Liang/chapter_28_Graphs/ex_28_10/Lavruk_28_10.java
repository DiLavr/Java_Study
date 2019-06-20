package ex_28_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Lavruk_28_10 {

//check if file exists
    private static File readFile(Scanner scanner) {
        boolean continueInput = true;
        String result = "";
        File file = null;
        do {
            try{
                System.out.println("Enter a file name with a full path: ");
                result = scanner.nextLine();
                file = new File(result);
                if (file.exists() && !file.isDirectory()) {
                    System.out.println("File found!");
                    continueInput = false;
                } else {
                    System.out.println("File not found!");
                }

            }
            catch (NoSuchElementException ex) {
                System.out.println("Try again. (" +
                        "line was not found)");
                scanner.nextLine();
            }
        }
        while (continueInput);
        return file;

    }

//check if verticle is an integer
     private static int readInt(String decor, Scanner scanner) {
        boolean continueInput = true;
        int result = 0;
        do {
            try{
                System.out.print(decor);
                result = scanner.nextInt();

                System.out.println(
                        "The number entered is " + result);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                scanner.nextLine();
            }
        }
        while (continueInput);
        return result;
    }



    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        File inputfile = readFile(input);
        int v1 = readInt("Enter first verticle: ", input);
        int v2 = readInt("Enter second verticle: ", input);
        input.close();


        Scanner inputGraph = new Scanner(inputfile);
        inputGraph.useDelimiter("[a-zA-Z_\\s]*");
        int numberOfVertices = inputGraph.nextInt();
        inputGraph.nextLine();
        System.out.println("The number of vertices is " + numberOfVertices);
        ArrayList<Integer> vertices = new ArrayList<>();
        ArrayList<AbstractGraph.Edge> edges = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++) {
            String inputLine = inputGraph.nextLine();
            Scanner inputVertic = new Scanner(inputLine);
            inputVertic.useDelimiter("[a-zA-Z_\\s]*");
            int vertex = inputVertic.nextInt();
            vertices.add(vertex);
            while (inputVertic.hasNext()) {
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