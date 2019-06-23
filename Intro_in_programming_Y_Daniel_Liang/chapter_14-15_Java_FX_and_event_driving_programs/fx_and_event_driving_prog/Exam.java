package fx_and_event_driving_prog;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

@SuppressWarnings("unused")
class A {
	 public A() {
	  System.out.println(
	   "The default constructor of A is invoked");
	 }
	}

	class B extends A {
	 public B() {
	  System.out.println(
	   "The default constructor of B is invoked");
	 }
	}
		