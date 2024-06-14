package controller;

/**
 * @author Elias Khatoun
 * date 06/12/2024
 * MainAppController class for the main app controller
 */

// Importing the necessary libraries
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * MainAppController class for the main app controller
 */
public class MainAppController implements Initializable {
	
	/**
	 * private webView
	 */
	@FXML
	private WebView webView;
	
	
	/**
	 * private text field
	 */
	@FXML
	private TextField textField;
	
	
	/**
	 * private webEngine
	 */
	private WebEngine engine;

	
	/**
	 * Initialize the controller
	 * @param arg0 URL
	 * @param arg1 ResourceBundle
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = webView.getEngine();
		loadPage();
	}

	/**
	 * Load the page
	 */
	public void loadPage() {
		engine.load("https://github.com/elias-544");
	}
}