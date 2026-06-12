package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class RegisterController {

    @FXML private TextField regUser;
    @FXML private PasswordField regPass;

    @FXML
    void handleRegister(ActionEvent event) throws IOException {
        String usernameInput = regUser.getText();
        String passwordInput = regPass.getText();

        // kalo input kosong
        if (!usernameInput.trim().isEmpty() && !passwordInput.trim().isEmpty()) {
            // panggil adduser
            UserRepository.addUser(usernameInput, passwordInput);

            // after success, back to login page
            Main.changeScene("Login.fxml", "Form Login");
        }
    }

    @FXML
    void goToLogin(ActionEvent event) throws IOException {
        Main.changeScene("Login.fxml", "Form Login");
    }
}