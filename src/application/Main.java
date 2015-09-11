package application;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	boolean t1_saved,t2_saved,t3_saved,t4_saved;

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

	public boolean isT1_saved() {
		return t1_saved;
	}

	public void setT1_saved(boolean t1_saved) {
		this.t1_saved = t1_saved;
	}

	public boolean isT2_saved() {
		return t2_saved;
	}

	public void setT2_saved(boolean t2_saved) {
		this.t2_saved = t2_saved;
	}

	public boolean isT3_saved() {
		return t3_saved;
	}

	public void setT3_saved(boolean t3_saved) {
		this.t3_saved = t3_saved;
	}

	public boolean isT4_saved() {
		return t4_saved;
	}

	public void setT4_saved(boolean t4_saved) {
		this.t4_saved = t4_saved;
	}

	@Override
	public void start(Stage p){
		TabPane a=null;
		try
		{
			FXMLLoader b=new FXMLLoader();
			b.setLocation(Main.class.getResource("View.fxml"));
			a=(TabPane)b.load();
			p.setScene(new Scene(a));
			p.setTitle("PhD Application Form");
			p.show();
			Controller x=b.getController();
			x.setMainApp(this);
			x.initialize_();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
