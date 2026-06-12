package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class SuccessController {

    @FXML
    void handleLogout(ActionEvent event) throws IOException {
        // logout
        Main.changeScene("Login.fxml", "Form Login");
    }
}
