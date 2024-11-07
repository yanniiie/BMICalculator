import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class BMI_CalculatorController {

    @FXML private TextField weightField;
    @FXML private TextField heightField;
    @FXML private Label resultLabel;
    @FXML private Label statusLabel;
    @FXML private RadioButton englishRadio;
    @FXML private RadioButton metricRadio;
    @FXML private Button calculateButton;

    @FXML
    private void calculateBMI() {
        // Получаем данные из полей ввода
        String weightText = weightField.getText();
        String heightText = heightField.getText();

        if (!weightText.isEmpty() && !heightText.isEmpty()) {
            double weight = Double.parseDouble(weightText);
            double height = Double.parseDouble(heightText);
            double bmi = 0;

            // Расчет BMI в зависимости от выбранной системы единиц
            if (metricRadio.isSelected()) {
                bmi = weight / (height * height); // Метрическая система (кг/м^2)
            } else if (englishRadio.isSelected()) {
                bmi = (weight / (height * height)) * 703; // Английская система (фунты/дюймы^2)
            }

            // Отображаем результат
            resultLabel.setText("BMI: " + String.format("%.2f", bmi));
            statusLabel.setText("Status: " + getBMIStatus(bmi));
        }
    }

    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
