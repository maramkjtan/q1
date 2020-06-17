package com.maram.maram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaramApplication extends Application{

	public static void main(String[] args) {
		SpringApplication.run(MaramApplication.class, args);
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader l= new FXMLLoader(getClass().getResource(""));
        l.setControllerFactory(SpringApplication.run(MaramApplication.class)::getBean);
        Pane p= new Pane();
        Scene s = new Scene(p);
        primaryStage.setTitle("Spring boot");
        primaryStage.setScene(s);
        primaryStage.show();
        
    }

}
