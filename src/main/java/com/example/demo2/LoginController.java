package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.io.IOException;

public class LoginController {

    @FXML private TextField loginUser;
    @FXML private PasswordField loginPass;
    @FXML private Label loginMessage;

    @FXML
    void handleLogin(ActionEvent event) throws IOException {
        String usernameInput = loginUser.getText();
        String passwordInput = loginPass.getText();

        // validation if success
        boolean isSuccess = UserRepository.checkLogin(usernameInput, passwordInput);

        if (isSuccess) {
            // if success
            Main.changeScene("Success.fxml", "Dashboard");
        } else {
            // if failed, stay
            loginMessage.setText("Login Gagal! Username atau Password salah.");
            loginMessage.setTextFill(Color.RED);
            loginPass.clear(); //
        }
    }

    @FXML
    void goToRegister(ActionEvent event) throws IOException {
        Main.changeScene("Register.fxml", "Registrasi Akun Baru");
    }
}
