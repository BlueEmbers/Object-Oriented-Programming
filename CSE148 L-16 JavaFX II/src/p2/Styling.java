package p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Styling extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Button okBtn = new Button("Ok");
		okBtn.setRotate(270);
		okBtn.setStyle("-fx-border-color: red; -fx-background-color: lightGray;"); // -fx-border-color: = modifying attribute of border color of button
		pane.getChildren().add(okBtn);

		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
