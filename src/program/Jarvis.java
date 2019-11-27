package program;

import java.io.IOException;
import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import views.MainMenu.MenuFXMLController;
import views.SwitchView;

public class Jarvis extends Application {

    @Override
    public void start(Stage primaryStage){
        Parent root;
        try {
            FXMLLoader chargerFXML = new FXMLLoader (getClass().getResource("/views/MainMenu/MainMenu.fxml"));
            MainController control = new MainController(new SwitchView(primaryStage));
            MenuFXMLController FXMLControl = new MenuFXMLController(control);

            chargerFXML.setController(FXMLControl);
            root = chargerFXML.load();

            primaryStage.setTitle("I'M JARVIS");
            primaryStage.getIcons().add(new Image("/img/logo/Accueil.PNG"));
            Scene scene = new Scene(root,719,619);
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[]args) {
        launch(args);
    }
}
