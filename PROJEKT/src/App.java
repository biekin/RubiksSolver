import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class App extends Application {
    private Desktop desktop = Desktop.getDesktop();
    public static void main(String[] args) {
        launch(args);
    }

    public void showSolve(Stage primaryStage){

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        final FileChooser fileChooser = new FileChooser();
        TextArea textArea = new TextArea();
        Button btn = new Button();
        Button btn2 = new Button();
        btn2.setLayoutX(80);
        btn2.setLayoutY(450);

        btn.setText("Add photos");
        btn2.setText("How to use");
        btn.setLayoutX(700);
        btn.setLayoutY(450);
        Image image1 = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\2x2x2_RubicksCubeok.png").toURI().toURL().toExternalForm());
        final ImageView selectedImage = new ImageView();
        selectedImage.setImage(image1);
        Image image2 = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\2x2_nieulozona.png").toURI().toURL().toExternalForm());
        final ImageView selectedImage2 = new ImageView();
        selectedImage2.setImage(image2);
        selectedImage.setX(500);
        selectedImage.setY(200);
        selectedImage2.setX(80);
        selectedImage2.setY(200);
        Image arr = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\arrow.png").toURI().toURL().toExternalForm());
        final ImageView selectedImageArr = new ImageView();
        selectedImageArr.setImage(arr);
        selectedImageArr.setX(350);
        selectedImageArr.setY(300);
        selectedImageArr.setFitWidth(150);
        selectedImageArr.setFitHeight(60);
        selectedImageArr.scaleXProperty();
        Text t = new Text("Rubik's Cube \n     Solver");
        t.setFill(Color.WHITE);


        t.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        t.setY(100);
        t.setX(220);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Group group = new Group();
                StackPane root = new StackPane();
                Scene scene = new Scene(group ,400, 600);
                primaryStage.setScene(scene);
                scene.setFill(Color.rgb(0,0,68));
                textArea.clear();
                List<File> files = fileChooser.showOpenMultipleDialog(primaryStage);

                Image image1 = new Image(files.get(0).toURI().toString());
                Image image2 = new Image(files.get(1).toURI().toString());
                System.out.println("1");

                String solution;
                try {
                    System.out.println("3");

                    solution = Cli.Communication(PicToArr.toArr(image1,image2));

                    System.out.println("2");
                    System.out.println(PicToArr.toArr(image1,image2));
                    Text t = new Text(solution);
                    t.setFont(Font.font("Verdana", 20));
                    t.setY(300);
                    group.getChildren().add(t);
                }
                catch (Exception e){};

                primaryStage.show();            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("...");
            }
        });
        Group group = new Group();
        StackPane root = new StackPane();
        Scene scene = new Scene(group ,800, 600);
        group.getChildren().add(btn);
        group.getChildren().add(btn2);
        group.getChildren().add(selectedImage);
        group.getChildren().add(selectedImage2);
        group.getChildren().add(selectedImageArr);
        group.getChildren().add(t);

        scene.setFill(Color.rgb(0,0,68));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rubik's Cube Solver");


        primaryStage.show();
    }
    private void printLog(TextArea textArea, List<File> files) {
        if (files == null || files.isEmpty()) {
            return;
        }
        for (File file : files) {
            textArea.appendText(file.getAbsolutePath() + "\n");
        }
    }

    private void openFile(File file) {
        try {
            this.desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}