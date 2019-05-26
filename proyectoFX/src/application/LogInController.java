package application;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class LogInController {
    @FXML
    private JFXButton btSignIn;
    @FXML
    private JFXButton btSignUp;
    @FXML
    private JFXButton xd;
    @FXML
    private AnchorPane anchorSignIn;
    @FXML
    private AnchorPane anchorSignUp;
    @FXML
    private Button bttEnter;
    
    public void initialize() {
    	btSignIn = new JFXButton();
    	btSignUp = new JFXButton();
    }
    @FXML
    public void enterAction(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
    		bttEnter.getScene().setRoot(root);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }

    @FXML
    public void signInAction(ActionEvent event) {
    	anchorSignUp.toBack();
    	anchorSignUp.setVisible(false);
    	anchorSignIn.setVisible(true);
    	anchorSignIn.toFront();
    }

    @FXML
    public void signUpAction(ActionEvent event) {
    	anchorSignIn.toBack();
    	anchorSignIn.setVisible(false);
    	anchorSignUp.toFront();
    	anchorSignUp.setVisible(true);
    }
}
