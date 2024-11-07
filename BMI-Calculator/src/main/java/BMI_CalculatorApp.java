import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BMI_CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Загружаем FXML файл
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BMI_Calculator.fxml"));
        AnchorPane root = loader.load();

        // Устанавливаем сцену
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BMI Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
