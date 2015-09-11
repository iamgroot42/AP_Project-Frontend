package application;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application
{
	Personal personal;
	Education education;
	Payment payment;
	Feedback feedback;
	ObjectInputStream in;
	Model model;
	boolean sop,cv;

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
	private void closer()
	{
		model.setBank(this.payment);
		model.setP(this.personal);
		model.setE(this.education);
		model.setSop(this.sop);
		model.setCv(this.cv);
	}
	
	@Override
	public void start(Stage p){
		TabPane a=null;
		this.model=new Model();
		try
		{
			FXMLLoader b=new FXMLLoader();
			b.setLocation(Main.class.getResource("View.fxml"));
			a=(TabPane)b.load();
			p.setScene(new Scene(a));
			p.setTitle("PhD Application Form");
			in=null;
//			try
//			{
//				in=new ObjectInputStream(new FileInputStream("temp.dat"));
//				model=(Model)in.readObject();
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
			p.show();
			Controller x=b.getController();
			x.setMainApp(this);
			x.initialize_();
			p.setOnCloseRequest(new EventHandler<WindowEvent>() {
		          public void handle(WindowEvent we) {
		              closer(); //Write saved data (Model object) to file 
		          }
			});  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
