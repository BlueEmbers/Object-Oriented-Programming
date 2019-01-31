package p1;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class ErrorAlertApp extends Application
{

	public static void main(String[] args)
	{
		launch(args);

	}
	
	@Override 
	public void start(Stage primaryStage) throws Exception
	{
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText("Error!");
		alert.setContentText("Ooooops, Error 404. There is a error!");
		alert.showAndWait();
		
		Alert alert2 = new Alert(AlertType.WARNING);
		alert2.setTitle("Warning Dialog");
		alert2.setHeaderText("Warning!");
		alert2.setContentText("Ooooops, Be Careful!");
		alert2.showAndWait();
		
		Alert alert3 = new Alert(AlertType.INFORMATION);
		alert3.setTitle("Info Dialog");
		alert3.setHeaderText("Information!");
		alert3.setContentText("For your Information!");
		alert3.showAndWait();
		
		TextInputDialog dialog = new TextInputDialog("What the hell!");
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("Look, a text input Dialog");
		dialog.setContentText("Please enter your name!");
		
		Optional<String> result = dialog.showAndWait();
		
		/*if(result.isPresent())
		{
			Person p = personBag.searchById(result.get());
			firstNameField.setText(p.getFirstName());
			//System.out.println("Your name: " + result.get());
		}*/
		
	}

}
