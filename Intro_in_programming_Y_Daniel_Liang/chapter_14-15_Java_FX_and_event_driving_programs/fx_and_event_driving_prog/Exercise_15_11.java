package fx_and_event_driving_prog;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise_15_11 extends Application {
	
	public static void main(String[] args) {
        Application.launch(args);
    }
	
	@Override 
	public void start(Stage primaryStage) {
		// pane
		Pane pane = new Pane();
		// circle c 
		Circle c = new Circle(35, 35, 35);
		pane.getChildren().add(c);
		
	
		// Move by arrows
		pane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case UP : c.setCenterY(c.getCenterY() > c.getRadius() ? c.getCenterY() - 10 : c.getCenterY()); 
				break;
				case DOWN : c.setCenterY(c.getCenterY() < pane.getHeight() - c.getRadius() ? c.getCenterY() + 10 : c.getCenterY()); 
				break;
				case LEFT : c.setCenterX(c.getCenterX() > c.getRadius() ? c.getCenterX() - 10 : c.getCenterX());
				break;
				case RIGHT : c.setCenterX(c.getCenterX() < pane.getWidth() - c.getRadius() ? c.getCenterX() + 10: c.getCenterX());
			default:
				break; 	}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Please move the circle"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		pane.requestFocus();
	}

}
