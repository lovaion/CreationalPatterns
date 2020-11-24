import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("view.fxml"));
        primaryStage.setScene(new Scene(root.load()));
        primaryStage.setTitle("Singleton tester");
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
