package main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by svetlana on 15.03.17.
 */
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Interface iface = new Interface();
        iface.openInterface(primaryStage);
    }
}
