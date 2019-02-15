package sample.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.*;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample/view/sample.fxml")));
        primaryStage.setTitle("Team");
        primaryStage.setScene(new Scene(root, 800, 675));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        Speler b = new Speler("dummyPlayer","default",18);
        Team a = new Team("test");



    }


}
