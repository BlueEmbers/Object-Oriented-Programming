package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleStages extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		
		Button btn1 = new Button("Ok");
		btn1.setPrefSize(100, 80);
		
		Button btn2 = new Button("Bye");
		btn2.setPrefSize(0, 0);

		
		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		
		pane.getChildren().add(btn1);
		pane.getChildren().add(btn2);
		
		pane.setPadding(new Insets(20)); //adds spacing between border and content
		
		VBox.setMargin(btn1, new Insets(5)); //margin = space outside border
		
//		pane.getChildren().remove(btn1);
//		pane.getChildren().remove(btn2);
		
		Scene aScene = new Scene(pane);
		primaryStage.setScene(aScene);
		primaryStage.setTitle("JAVAFX"); //set the window title of the stage
		primaryStage.show();
		
//		Stage newStage = new Stage();
//		Scene anotherScene = new Scene(new Label("Hi"), 250, 100);
//		newStage.setScene(anotherScene);
	
//		newStage.showAndWait(); //program will pause at this line until the stage is closed or any other interaction.
	}

}
