package views;

import javafx.fxml.*;
import model.NumberAdder;
import model.ViewTransitionModelInterface;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	ViewTransitionModelInterface model;
	NumberAdder adder;
	
	public void setModel(ViewTransitionModelInterface newModel)
	{
		model = newModel;
	}
	@FXML
    private TextArea sumDisplay;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

  
    @FXML
    void onClickAdd(ActionEvent event) 
    {
    	adder.setNumber1(num1);
    	adder.setNumber2(num2);
    	
    	System.out.println("add clicked");
    }




}
