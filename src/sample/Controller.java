package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public TextField inputField;
    public TextArea chatArea;


    public void send(ActionEvent actionEvent) {
        String str = inputField.getText();
        if (str.equals("") || str.isEmpty() || str.split(" ").length < 1) {
            inputField.clear();
            inputField.requestFocus();


        }  else {
            chatArea.appendText(str);
            inputField.clear();
            inputField.requestFocus();
        }


    }

    public void selectUser(ActionEvent actionEvent) {
    }

    public void privateUser(ActionEvent actionEvent) {
    }
}
