import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import model.ViewTransitionalModel;
import views.MainController;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;

public class Main extends Application {
	

	@Override
	public void start(Stage stage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/MainView.fxml"));
		BorderPane view = loader.load();
		MainController controller = loader.getController();
		ViewTransitionalModel vm = new ViewTransitionalModel(view);
		controller.setModel(vm);
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}

}
