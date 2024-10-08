package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainDashBoardController {

    @FXML
    void AdminPortalOnActionBtn(ActionEvent event) {
        Stage stage =new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_admin.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void EmployeePortalOnActionBtn(ActionEvent event) {

    }

}
