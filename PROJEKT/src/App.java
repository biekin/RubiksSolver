import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;

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

import static java.lang.Thread.sleep;



public class App extends Application {
    boolean  startapp = false;
    private Desktop desktop = Desktop.getDesktop();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        final FileChooser fileChooser = new FileChooser();
        Button btn = new Button();


        btn.setText("Rozpocznij");
        btn.setLayoutX(750);
        btn.setLayoutY(450);
        Image image1 = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\2x2x2_RubicksCubeok.png").toURI().toURL().toExternalForm());
        final ImageView selectedImage = new ImageView();

        selectedImage.setImage(image1);
        Image image2 = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\2x2_nieulozona.png").toURI().toURL().toExternalForm());
        final ImageView selectedImage2 = new ImageView();
        selectedImage2.setImage(image2);
        selectedImage.setX(550);
        selectedImage.setY(200);
        selectedImage2.setX(80);
        selectedImage2.setY(200);
        Image arr = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\arrow.png").toURI().toURL().toExternalForm());
        final ImageView selectedImageArr = new ImageView();
        selectedImageArr.setImage(arr);
        selectedImageArr.setX(375);
        selectedImageArr.setY(300);
        selectedImageArr.setFitWidth(150);
        selectedImageArr.setFitHeight(60);
        selectedImageArr.scaleXProperty();

        Text t = new Text("Rubik's Cube \n     Solver");
        t.setFill(Color.WHITE);


        t.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        t.setY(100);
        t.setX(270);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try{
               startTheGame(primaryStage,fileChooser);}
               catch(Exception e){}
            }});



        Group group = new Group();
        StackPane root = new StackPane();
        Scene scene = new Scene(group ,900, 600);
        group.getChildren().add(btn);
        group.getChildren().add(selectedImage);
        group.getChildren().add(selectedImage2);
        group.getChildren().add(selectedImageArr);
        group.getChildren().add(t);

        scene.setFill(Color.rgb(0,0,68));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rubik's Cube Solver");


        primaryStage.show();
    }

    public void startTheGame(Stage primaryStage,FileChooser fileChooser )throws Exception{


        ArrayList<File> files = new ArrayList<>();
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setTitle("Information Dialog");
        alert1.setHeaderText(null);
        alert1.setContentText("Proszę wybrać pierwsze zdjęcie");
        alert1.showAndWait();
        files.add(fileChooser.showOpenDialog(primaryStage));

        while (files.size()!=2){
            if (files.size()>2 || files.size()==0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Proszę wybrać dokładnie dwa pliki!");
                alert.showAndWait();
                files.removeAll(files);
                files.add(fileChooser.showOpenDialog(primaryStage));
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Proszę wybrać drugi plik");
                alert.showAndWait();
                files.add(fileChooser.showOpenDialog(primaryStage));
            }
        }
        ColorGetter rubikscube = new ColorGetter(files.get(0).getAbsolutePath(),files.get(1).getAbsolutePath());
        try {
        ArrayList<String> State = rubikscube.getState();
        Cli cli = new Cli(State);
        Thread thread = new Thread(cli);
        thread.start();
        int j=0;
        while (!thread.getState().toString().equals("TERMINATED")) {
            try{
                sleep(100);}
            catch (Exception e){}
        }

        Group group = new Group();
        StackPane root = new StackPane();
        Scene scene = new Scene(group ,900, 600);
        primaryStage.setScene(scene);
        scene.setFill(Color.rgb(0,0,68));

        Button btn3 = new Button();


        btn3.setText("Cofnij");
        btn3.setLayoutX(30);
        btn3.setLayoutY(20);
        group.getChildren().add(btn3);
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try{
            start(primaryStage);}
            catch (Exception e){}
            }});
        Image image1 = new Image(files.get(0).toURI().toString());

        final ImageView selectedImageFront = new ImageView();
        selectedImageFront.setImage(image1);



        String solution="";

            Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\1pxreset.png").toURI().toURL().toExternalForm());
            final ImageView selectedImageReset = new ImageView();
            selectedImageReset.setImage(reset);
            selectedImageFront.setFitHeight(240);
            selectedImageFront.setFitWidth(135);
            selectedImageFront.setX(570);
            selectedImageFront.setY(128);

            group.getChildren().add(selectedImageReset);
            group.getChildren().add(selectedImageFront);

            Image arr = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\arrow.png").toURI().toURL().toExternalForm());
            final ImageView selectedImageArr = new ImageView();
            selectedImageArr.setImage(arr);
            selectedImageArr.setX(442);
            selectedImageArr.setY(235);
            selectedImageArr.setFitWidth(150);
            selectedImageArr.setFitHeight(50);
            selectedImageArr.scaleXProperty();
            group.getChildren().add(selectedImageArr);

            Text man = new Text ("Ustaw kostkę w pozycji ze zdjęcia,\nWskazaną ścianą do przodu");
            man.setX(50);
            man.setY(100);
            man.setFill(Color.WHITE);
            man.setFont(Font.font("Verdana",30));
            group.getChildren().add(man);






            ArrayList<String> ListOfMoves= new ArrayList<>();
            solution = cli.GetSolution();
            int i=0;
            for (i=1;i<solution.length()/2;i++){
                ListOfMoves.add(solution.substring(i*2,i*2+2));
            }
            for(i=0;i<ListOfMoves.size();i++){
                Text t = new Text(ListOfMoves.get(i));
                t.setFont(Font.font("Verdana", 30));
                t.setFill(Color.WHITE);
                t.setY(550);
                t.setX(40+90*i);
                ImageView image = giveMeArrow(ListOfMoves.get(i));
                image.setY(450);
                image.setX(30+90*i);
                group.getChildren().add(t);
                image.setFitWidth(50);
                image.setFitHeight(50);
                group.getChildren().add(image);}
            primaryStage.show();



        }
        catch(PoorPhotoException photo){
            Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
            alert3.setTitle("Information Dialog");
            alert3.setHeaderText(null);
            alert3.setContentText("Rozpoznawanie kolorów nie powiodło się\nProszę dodać zdjęcia jeszcze raz");
            alert3.showAndWait();
        }
        //              primaryStage.show();
    }

    private ImageView giveMeArrow(String move){
        final ImageView selectedImageReset = new ImageView();
        try {
            if (move.equals("L ")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrL.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);


            }
            else if (move.equals("F ")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrF.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);


            }
            else if (move.equals("D ")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrD.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }
            else if (move.equals("F2")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrF2.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }
            else if (move.equals("L2")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrL2.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }

            else if (move.equals("D2")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrD2.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }
            else if (move.equals("F\'")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrFprim.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }

            else if (move.equals("L\'")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrLprim.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);
            }

            else if (move.equals("D\'")) {
                Image reset = new Image(new File("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\ArrDprim.png").toURI().toURL().toExternalForm());
                selectedImageReset.setImage(reset);

            }

        }
        catch(Exception e){};

        return selectedImageReset;

        }

    private void canYouDisplaySth(Stage primaryStage){

        Group group = new Group();
        StackPane root = new StackPane();
        Scene scene = new Scene(group ,900, 600);
        primaryStage.setScene(scene);
        scene.setFill(Color.rgb(0,0,68));
        Text t = new Text("Please wait");
        t.setFont(Font.font("Verdana", 30));
        t.setFill(Color.WHITE);
        t.setY(550);
        t.setX(40);
        group.getChildren().add(t);
        primaryStage.show();
        try{
        sleep(100);}
        catch (Exception e){}

    }
    }


