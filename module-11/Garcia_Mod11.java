/*
 * Name: Perla Garcia Cavazos
 * Date: October 7, 2026
 * Assignment: Module 11 - JavaFX HBox and VBox
 * Course: CSD 402 - Java Programming
 *
 * Purpose:
 * This program demonstrates the use of the JavaFX HBox and VBox
 * layout panes. HBox arranges controls horizontally, while VBox
 * arranges controls vertically.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Garcia_Mod11 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a label for the HBox example.
        Label hboxLabel = new Label("HBox Example");

        // Create three buttons that will be arranged horizontally.
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        Button exitButton = new Button("Exit");

        // HBox places its child controls from left to right.
        // The value 10 creates 10 pixels of spacing between controls.
        HBox hbox = new HBox(10);

        // Add the buttons to the HBox.
        hbox.getChildren().addAll(
                saveButton,
                cancelButton,
                exitButton
        );

        // Center the buttons and add padding around the HBox.
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));

        // Create a label for the VBox example.
        Label vboxLabel = new Label("VBox Example");

        // Create controls that will be arranged vertically.
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Button submitButton = new Button("Submit");

        // VBox places its child controls from top to bottom.
        // The value 10 creates spacing between each control.
        VBox formBox = new VBox(10);

        // Add the controls to the VBox.
        formBox.getChildren().addAll(
                nameLabel,
                emailLabel,
                submitButton
        );

        // Center the controls in the VBox.
        formBox.setAlignment(Pos.CENTER);

        // Create the main VBox for the entire application.
        // This also demonstrates that HBox and VBox can be combined.
        VBox root = new VBox(15);

        root.getChildren().addAll(
                hboxLabel,
                hbox,
                vboxLabel,
                formBox
        );

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        // Create the scene and place the root VBox inside it.
        Scene scene = new Scene(root, 450, 350);

        // Configure and display the application window.
        primaryStage.setTitle("JavaFX HBox and VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        // Launch the JavaFX application.
        launch(args);
    }
}