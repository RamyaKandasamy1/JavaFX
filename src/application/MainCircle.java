package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class MainCircle {
	@FXML
	private Circle mycircle;
	double x,y;
	
	public void Up(ActionEvent e) {
		mycircle.setCenterY(y-=10);
		
	}

	public void Down(ActionEvent e) {
		mycircle.setCenterY(y+=10);
		
	}

	public void Left(ActionEvent e) {
		mycircle.setCenterX(x+=10);
		
	}

	public void Right(ActionEvent e) {
		mycircle.setCenterX(x-=10);
		
	}
}
