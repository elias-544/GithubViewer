/**
 * @author Elias Khatoun
 * @date 06/03/2024
 * A login screen using JavaFX
 */

package application;

// Importing the necessary libraries
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main class that runs the application
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Signup.fxml")
		);
		Scene scene = new Scene(root);
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * The main method that runs the application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}