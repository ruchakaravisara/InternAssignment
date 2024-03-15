package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainFormController {

    @FXML
    private Label lblAns;

    @FXML
    private TextField txtG;

    @FXML
    private TextField txtF;

    @FXML
    private TextField txtC;

    @FXML
    void btnCalculate(ActionEvent event) {
        try {
           // inputs
            double g = Double.parseDouble(txtG.getText());
            double f = Double.parseDouble(txtF.getText());
            double c = Double.parseDouble(txtC.getText());

            // Calculate radius
            double radius = calculate(g, f, c);

            // Display result
            lblAns.setText(String.valueOf(radius));
        } catch (NumberFormatException e) {
            lblAns.setText("Please enter valid numbers for g, f, and c.");
        }
    }

    private double calculate(double g, double f, double c) {
        double discriminant = Math.pow(g, 2) + Math.pow(f, 2) - c;

        if (discriminant > 0) {
            return Math.sqrt(discriminant);
        } else {
            return Double.NaN; // Indicates invalid input
        }
    }
}
