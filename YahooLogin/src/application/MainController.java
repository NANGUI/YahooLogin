package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MainController {
	

    @FXML
    void closeApps(MouseEvent event) {
    	
    	Platform.exit();
    }
}
