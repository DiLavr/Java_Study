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

public class Ex_15_05 extends Application {
	
	public static void main(String[] args) {
        Application.launch(args);
    }
	private void futureValue() {
		double investmentAmount = Double.parseDouble(tfIA.getText());
		int years = Integer.parseInt(tfNOfY.getText());
		double monthlyInterestRate = Double.parseDouble(tfAIR.getText()) / 1200;
		//futureValue = investmentAmount * (1 + monthlyInterestRate)years*12
		tfFV.setText(String.format("$%.2f", (investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12))));
	}
	
	private TextField tfIA = new TextField(); //InvestmentAmount
	private TextField tfNOfY = new TextField(); //tfNumberOfYears
	private TextField tfAIR = new TextField(); //tfAnnualInterestRate
	private TextField tfFV = new TextField(); //tfFutureValue
	private Button btResult = new Button("Result");

	@Override // Override the start method
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setVgap(10);
		pane.setHgap(10);
		pane.add(new Label("Investment Amount:"), 0, 0);
		pane.add(tfIA, 1, 0);
		pane.add(new Label("Number Of Years:"), 0, 1);
		pane.add(tfNOfY, 1, 1);
		pane.add(new Label("Annual Interest Rate:"), 0, 2);
		pane.add(tfAIR, 1, 2);
		pane.add(btResult, 1, 3);
		pane.add(new Label("Future value:"), 0, 4);
		pane.add(tfFV, 1, 4);
		

		
		pane.setAlignment(Pos.CENTER);
		tfIA.setAlignment(Pos.BOTTOM_RIGHT);
		tfNOfY.setAlignment(Pos.BOTTOM_RIGHT);
		tfAIR.setAlignment(Pos.BOTTOM_RIGHT);
		tfFV.setAlignment(Pos.BOTTOM_RIGHT);
		tfFV.setEditable(false);
		GridPane.setHalignment(btResult, HPos.RIGHT);
		pane.setPadding(new Insets(20, 20, 20, 20));

		// Process events
		btResult.setOnAction(e -> futureValue());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Calculater"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); // Display the stage
	}


}