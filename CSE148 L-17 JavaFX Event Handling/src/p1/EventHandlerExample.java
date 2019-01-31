package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExample extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Click me");
		Label label = new Label("Visible");
		
	  //button.setOnAction(new SimpleEventHandler(label));
		button.setOnAction(e -> { //lambda expression
			if(label.getText().equalsIgnoreCase("Visible")) {
				label.setText("Invisible");
			} else {
				label.setText("Visible");
			}
		});
		
		
		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(label, button);
		
		primaryStage.setScene(new Scene(pane, 250, 90));
		primaryStage.show();
	}
	
	//inner class (private)
//	private class SimpleEventHandler implements EventHandler<ActionEvent>{ //you can put a class in a class
//		private Label label;
//		
//		public SimpleEventHandler(Label label) {
//			this.label = label;
//		}
//		
//		public void handle(ActionEvent event) {
//			if(label.getText().equalsIgnoreCase("Visible")) {
//				label.setText("invisible");
//			} else {
//				label.setText("Visible");
//			}
//		}
//	}
}

//MORE THAN ONE CLASS IN A FILE OMG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//  class SimpleEventHandler implements EventHandler<ActionEvent>{ 
//	private Label label;
//	
//	public SimpleEventHandler(Label label) {
//		this.label = label;
//	}
//	
//	public void handle(ActionEvent event) {
//		if(label.getText().equalsIgnoreCase("Visible")) {
//			label.setText("invisible");
//		} else {
//			label.setText("Visible");
//		}
//	}
//}


