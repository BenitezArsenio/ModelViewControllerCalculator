
import javafx.application.Application;

import javafx.fxml.*;
import javafx.stage.*;
import views.MainController;
import javafx.scene.*;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	

	@Override
	public void start(Stage stage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/MainView.fxml"));
		TitledPane view = loader.load();
	
		MainController cont = loader.getController();
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
