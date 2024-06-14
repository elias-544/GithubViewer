package controller;

/**
 * The LoginController class is the controller for the Login screen.
 * date: 06/12/2024
 * @author Elias Khatoun
 */

// all imports necessary for the class
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
 * Controller for the Login screen.
 */
public class LoginController {
	
	/**
	 * username field for login
	 */
	@FXML
	public TextField tfUsername;
	
	/**
	 * password Field for Login
	 */
	@FXML
	public PasswordField pfPassword;
	
	/**
	 * label to display error if needed
	 */
	@FXML
	public Label lblError;

	/**
	 * method to handle the login button pressed event
	 * @param event The event that triggers the method
	 * @throws IOException If the FXML file is not found
	 */
	public void loginButtonPressed(ActionEvent event) throws IOException {
		/* Get the user name and password */
		String username = tfUsername.getText();
		String password = pfPassword.getText();
		
		if (!username.equals(Database.username) || 
			!password.equals(Database.password)
		) {
			lblError.setText("Invalid username or password.");
			lblError.setVisible(true);
			return;
		}
		
		// Switch scenes to MainApp
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/MainApp.fxml")
		);
		
		Stage appStage = (Stage)((Node)event.getSource())
							.getScene()
							.getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}

}
