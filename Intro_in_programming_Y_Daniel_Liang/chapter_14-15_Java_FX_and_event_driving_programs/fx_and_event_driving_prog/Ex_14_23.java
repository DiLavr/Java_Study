package fx_and_event_driving_prog;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import java.util.Scanner;

public class Ex_14_23 extends Application {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

        Application.launch(args);

    }
	public void start(Stage primaryStage) {
		// Create a Scanner
		
		// pane and a box
		Pane pane = new Pane();
		VBox vBox = new VBox(20);
		vBox.setPadding(new Insets(10, 5, 5, 10));
		
		// Enter the center coordinates, width and height of rectangle
		System.out.print("Enter the center coordinates, width and height of rectangle 1: ");
		String[] str1 = (input.nextLine()).split("[ ]"); 
		System.out.print("Enter the center coordinates, width and height of rectangle 2: ");
		String[] str2 = (input.nextLine()).split("[ ]"); 
		Rectangle r1 = getRectangle(str1);
		Rectangle r2 = getRectangle(str2);

		// Test if rectangles contain or overlap each other
		String output = "        ";
		if (contains(r1, r2) || contains(r2, r1))
			output += "One rectangle is contained in another ";
		else if (overlaps(r1, r2))
			output += "The rectangles overlap ";
		else
			output += "The rectangles do not overlap ";
		
		//  getChildren method is used to get the children components(such as checkboxes, buttons etc) in a container
		pane.getChildren().addAll(r1, r2);
		vBox.getChildren().addAll(pane, new Text(20, 0, output));
		

		// Create a scene and place it in the stage
		Scene scene = new Scene(vBox);
		primaryStage.setTitle("Ex_14_23");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

		private Rectangle getRectangle(String[] s){
		Rectangle r = new Rectangle(Double.parseDouble(s[0]),Double.parseDouble(s[1]), Double.parseDouble(s[2]),Double.parseDouble(s[3]));
		r.setFill(Color.WHITE);
		r.setStroke(Color.BLUE);
		return r;
	}

	//  one rectangle is inside the other 
	public boolean contains(Rectangle r1, Rectangle r2) {
		return 
			r2.getY() + r2.getHeight() <= r1.getY() + r1.getHeight() && 
			r2.getX() + r2.getWidth() <= r1.getX() + r1.getWidth() && 
			r2.getX() > r1.getX() && r2.getY() > r1.getY();
	}

	//  rectangles overlap 
	public boolean overlaps(Rectangle r1, Rectangle r2) {
		return getDistance(r1.getX(), r2.getX() + r2.getWidth()) < r1.getWidth() + r2.getWidth() &&
			getDistance(r1.getY(), r2.getY() + r2.getHeight()) < r1.getHeight() + r2.getHeight();
			 	}

	// distance 
	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
}