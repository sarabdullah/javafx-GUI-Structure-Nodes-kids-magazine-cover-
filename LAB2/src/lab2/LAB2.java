/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.paint.ImagePattern;

/**
 *
 * @author almso
 */
public class LAB2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
Circle circle = new Circle(); 
circle.setCenterX(70); 
circle.setCenterY(70);
circle.setRadius(50);  
   circle.setFill(Color.AQUA);       
     
   
  
   
      
       Text text1 = new Text(); 
text1.setText("1");  
text1.setX(60); 
text1.setY(70);
   text1.setFill(Color.WHITE);
      text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));  
      
      
  Text text =new Text ();
  text.setText("because your kids deserve the knowleodge ");
  text.setX(50);
  text.setY(300);
  text.setFill(Color.DARKORANGE);
  text.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.REGULAR, 20));
  
  
  Text text2 =new Text ();
  text2.setText("KIDS WORLD");
  text2.setX(50);
  text2.setY(250);
  text2.setFill(Color.WHITE);
  text2.setFont(Font.font("Helvetica", FontWeight.LIGHT, FontPosture.REGULAR, 50));
        
  
        Rectangle rectangle = new Rectangle(); 
rectangle.setX(0); 
rectangle.setY(150);
rectangle.setWidth(600);
rectangle.setHeight(200);
rectangle.setFill(Color.BEIGE);


 ImageView imageView = new ImageView("https://img.freepik.com/premium-vector/set-cute-wild-animals-cartoon-style_338371-476.jpg?w=996.png");
imageView.setX(30);
imageView.setY(400);
imageView.setFitHeight(350);
imageView.setFitWidth(650);
 imageView.setPreserveRatio(true);

Line line = new Line();
        line.setStartX(1); 
        line.setStartY(140.0f);
        line.setEndX(600);
        line.setEndY(140.0f);
         line.setFill(Color.DARKCYAN);

        
        
       

Group root = new Group(circle, rectangle,text1,imageView,line,text,text2);
        
        Scene scene = new Scene(root, 600, 800);

        primaryStage.setTitle("lab2_cover");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
