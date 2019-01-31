package p4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button topBtn = new Button("TOP");
		Button rightBtn = new Button("RIGHT");
//		rightBtn.setRotate(90);
		Button bottomBtn = new Button("BOTTOM");
		Button leftBtn = new Button("LEFT");
//		leftBtn.setRotate(-90);
		Button centerBtn = new Button("CENTER");
		centerBtn.setPrefWidth(200);
	
		GridPane pane = new GridPane();
		pane.setVgap(20);
		pane.setHgap(30);
		pane.add(topBtn, 0, 0); //pane.add(child, columnIndex, rowIndex);
		pane.add(rightBtn, 1, 0);
		pane.add(bottomBtn, 0, 1);
		pane.add(leftBtn, 1, 1);
		pane.add(centerBtn, 0, 2, 1, 2); //pane.add(child, columnIndex, rowIndex, colspan, rowspan);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
