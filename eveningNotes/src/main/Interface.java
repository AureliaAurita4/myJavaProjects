package main;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by svetlana on 15.03.17.
 */
public class Interface {

    public Interface() {

    }

    public void openInterface(Stage stage) {

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 400, 500);
        //grid.setGridLinesVisible(true);
        grid.setHgap(30);
        grid.setVgap(20);
        stage.setScene(scene);
        stage.setTitle("Evening Notes");
        stage.show();

        Label l1 = new Label("Day rating: how good was your day?");
        grid.add(l1, 2, 1);

        ToggleGroup dayRating = new ToggleGroup();
        RadioButton rb1 = new RadioButton("1");
        RadioButton rb2 = new RadioButton("2");
        rb2.setTranslateX(40);
        RadioButton rb3 = new RadioButton("3");
        rb3.setTranslateX(80);
        RadioButton rb4 = new RadioButton("4");
        rb4.setTranslateX(120);
        RadioButton rb5 = new RadioButton("5");
        rb5.setTranslateX(160);

        rb1.setToggleGroup(dayRating);
        rb2.setToggleGroup(dayRating);
        rb3.setToggleGroup(dayRating);
        rb4.setToggleGroup(dayRating);
        rb5.setToggleGroup(dayRating);
        rb1.setSelected(true);

        grid.add(rb1, 2, 2);
        grid.add(rb2, 2, 2);
        grid.add(rb3, 2, 2);
        grid.add(rb4, 2, 2);
        grid.add(rb5, 2, 2);
        //grid.addRow(2, rb1, rb2, rb3, rb4, rb5);

        Label l2 = new Label("What were the happy moments of the day?");
        grid.add(l2, 2, 3);

        TextField text1 = new TextField();
        text1.setPromptText("Happy moments of the day");
        text1.setMaxWidth(200);
        grid.add(text1, 2, 4);

        Label l3 = new Label("Did you face any difficulty today?");
        grid.add(l3, 2, 5);

        TextField text2 = new TextField();
        text2.setPromptText("Difficulty of the day");
        text2.setMaxWidth(200);
        grid.add(text2, 2, 6);

        Label l4 = new Label("What feelings did you experience today?");
        grid.add(l4, 2, 7);

        TextField text3 = new TextField();
        text3.setPromptText("Feelings of the day");
        text3.setMaxWidth(200);
        grid.add(text3, 2, 8);

        Button b1 = new Button("Record");
        b1.setTranslateX(200);
        grid.add(b1, 2, 10);

        b1.setOnAction(event -> {
            
            System.out.println(dayRating.getSelectedToggle());
            System.out.println(text1.getText());
            System.out.println(text2.getText());
            System.out.println(text3.getText());
        });
    }
}
