package fx_and_event_driving_prog;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex_14_17_Hangmanpic extends Application {

    private static double H = 420;
    private static double W = 420;
    
    //*     Launch picture Hungman game    */
    public static void main(String[] args) {
        Application.launch(args);
    }

    private double[] getAngle(Circle c, double angle) {
        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
        double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));
        return new double[]{x, y};
    }
    

    public void start(Stage primaryStage) {

        Pane hangman = new Pane();
        ObservableList<Node> list = hangman.getChildren();

        primaryStage.setTitle("Hangman");
        primaryStage.setScene(new Scene(hangman, W, W));
        Arc arc = new Arc(W / 4, H - H / 12, W / 5, H / 12, 0, 180);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        list.add(arc);

        Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), hangman.getHeight() / 12);
        list.add(pole);
        Line holder = new Line(pole.getEndX(), pole.getEndY(), hangman.getWidth() / 1.5, pole.getEndY());
        list.add(holder);
        Line hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), hangman.getHeight() / 6);
        list.add(hang);

        double radius = W / 10;
        
        //Head
        Circle c = new Circle(holder.getEndX(), hangman.getHeight()/ 6 + radius, radius);
        c.setFill(Color.YELLOW);
        c.setStroke(Color.BLACK);
        list.add(c);
       //Straight line of body
        double [] p = getAngle(c, 270);
        Line body = new Line(p[0], p[1], p[0], hangman.getHeight() / 1.6);
        list.add(body);
       // Left Leg
        Line leftLeg = new Line(body.getEndX(), body.getEndY(), hangman.getWidth() / 2, hangman.getHeight() / 1.3);
        list.add(leftLeg);
       //Right Leg
        Line rightLeg = new Line(body.getEndX(), body.getEndY(), hangman.getWidth() / 1.2, hangman.getHeight() / 1.3);
        list.add(rightLeg);
        p = getAngle(c, 220);
       //Left Arm
        Line leftArm = new Line(hangman.getWidth() / 2, hangman.getHeight() / 2, p[0], p[1]);
        list.add(leftArm);
        p = getAngle(c, 315);
       //Right Arm
        Line rightArm = new Line(hangman.getWidth() / 1.2, hangman.getHeight() / 2, p[0], p[1]);
        list.add(rightArm);

        primaryStage.show();
    }
}
