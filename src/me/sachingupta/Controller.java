package me.sachingupta;

import javafx.scene.control.*;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    private TextField user;
    @FXML
    private PasswordField pkey;


    @FXML
    public void closeOnExit(){
        System.exit(0);
    }
    @FXML
    public void clearOnAction(){
        user.setText(" ");
        pkey.setText(" ");
    }
}
