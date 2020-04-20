package model;
import java.io.IOException;

import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import views.MainController;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;

public class ViewTransitionalModel implements ViewTransitionModelInterface {

	BorderPane mainView;
	
	public ViewTransitionalModel(BorderPane view)
	{
		mainView = view;
	}
	@Override
	public void setNumbers() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ViewTransitionalModel.class.getResource("../views/MainView.fxml"));
			BorderPane view = loader.load();
		}catch(IOException e ) {
			e.printStackTrace();
			
		}
	
		
	}

	@Override
	public void showSum() {
		// TODO Auto-generated method stub
		
	}

}
