package controller;

/**
 * SignupController class is the controller for the Signup.fxml file
 * date: 06/12/2024
 * @author Elias Khatoun
 */

// Importing the necessary libraries
import java.io.IOException;
import data.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * SignupController class is the controller for the Signup.fxml file
 */
public class SignupController {
	
	/**
	 * text field to hold username to send to database
	 */
	@FXML
	public TextField tfUsername;
	
	
	/**
	 * text field to hold password to send to database
	 */
	@FXML
	public PasswordField pfPassword;
	
	/**
	 * label to show error if needed
	 */
	@FXML
	public Label lblError;


	/**
	 * Method to handle the signup button pressed event
	 * @param event The event that triggers the method
	 * @throws IOException If the file is not found
	 */
	public void signupButtonPressed(ActionEvent event) throws IOException {
		/* Get the username and password */
		String username = tfUsername.getText();
		String password = pfPassword.getText();

		// set the user input to the database and make that the new username and password
		Database.username = username;
		Database.password = password;
		
		
		// Switch scenes to MainApp
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Login.fxml")
		);
		
		Stage appStage = (Stage)((Node)event.getSource())
							.getScene()
							.getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}

}
