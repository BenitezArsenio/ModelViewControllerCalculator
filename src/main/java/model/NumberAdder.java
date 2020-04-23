package model;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class NumberAdder {
	
	DoubleProperty number1 = new SimpleDoubleProperty();
	DoubleProperty number2 = new SimpleDoubleProperty();
	 
	public NumberAdder()
	{
		
	}

	public DoubleProperty getNumber1() {
		return number1;
	}

	public void setNumber1(DoubleProperty num1) {
		this.number1 = num1;
	}

	public DoubleProperty getNumber2() {
		return number2;
	}

	public void setNumber2(DoubleProperty num2) {
		this.number2 = num2;
	}
	
	public DoubleBinding add()
	{
		DoubleBinding sum = number1.add(number2);
		return sum;
	}
	
	

}
