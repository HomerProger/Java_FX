package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public javafx.scene.control.TextField TextField;
    @FXML
    public javafx.scene.control.TextArea TextArea;


    public void clickButton(ActionEvent actionEvent) {
        TextArea.appendText(TextField.getText()+"\n");
        TextField.clear();
    }
}
