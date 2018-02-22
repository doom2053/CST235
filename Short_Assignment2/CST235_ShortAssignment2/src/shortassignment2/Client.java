//Mark Piland
//CST 235 
//Websites used : 
//https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/HBox.html helped get the Hbox
//https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/VBox.html helped get vbox

package shortassignment2;
import javafx.scene.layout.HBox;


import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import shortassignment2.videoCalc;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Client extends Application {
    
  
    public void start(Stage primaryStage) {
       //Hbox spacing and adjustible size
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(50, 30, 50, 20));
        hbox.setSpacing(30);
        //width of the spacing for the video resolution and textbox
        hbox.getChildren().add(new Label("Video Resolution: 720/1080"));
        TextField resolution = new TextField();
        resolution.setPrefWidth(60);
        hbox.getChildren().add(resolution);
        //width of the spacing for the video length and textbox
        hbox.getChildren().add(new Label("Video Length in seconds:"));
        TextField length = new TextField();
        length.setPrefWidth(60);
        hbox.getChildren().add(length);
        //button for getting the video size
        Button videoSize_btn = new Button();
        videoSize_btn.setText("Get Video Size");
        hbox.getChildren().add(videoSize_btn);
        //Displays video storage size
        Label diskSize = new Label("");
        hbox.getChildren().add(diskSize);
      //size of the box vertically
        VBox root = new VBox();
        root.getChildren().add(hbox);
        Scene scene = new Scene(root, 900, 150);
        
        videoSize_btn.setOnAction(new EventHandler<ActionEvent>() {
            
           //calculates the video storage
            public void handle(ActionEvent event) {
                 Integer value1 = Integer.valueOf(resolution.getText());
                 Integer value2  = Integer.valueOf(length.getText());
                 videoCalc sizeVideo = new videoCalc(value1, value2);
                 diskSize.setText(sizeVideo.getFile_size());
                 primaryStage.setScene(scene);
                 primaryStage.show();
            }
        });
        
        primaryStage.setTitle("Calculate File Size");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 
    public static void main(String[] args)  {
    	 launch(args);
    }
    
}
