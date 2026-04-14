package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc() {
        double height = Double.parseDouble(heightField.getText());
        double radius = Double.parseDouble(radiusField.getText());
        double surface = Cylinder.calcSurface(height, radius);

        surfaceField.setText(String.valueOf(surface));
    }
}
