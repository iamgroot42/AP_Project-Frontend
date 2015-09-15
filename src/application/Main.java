package application;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class Main extends Application
{
	ObjectInputStream in;
	private Model model;
	
	public Model getModel()
	{
		return this.model;
	}
	
	public void closer()
	{
		try {
			ObjectOutputStream temp=new ObjectOutputStream(new FileOutputStream("temp.dat"));
			this.model.setTimestamp(LocalDate.now());
			this.model.setEnrollment_number("Random_Potato"); //Look into this later
			temp.writeObject(this.model);
			if(this.model.getP()==null) System.out.println("F*CK");
			if(this.model==null) System.out.println("Double F*CK");
			temp.close();
		} catch (IOException e) {
			System.out.println("Could not write to file");
			e.printStackTrace();
		}
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
			try
			{
				in=new ObjectInputStream(new FileInputStream("temp.dat"));
				model=(Model)in.readObject();
				System.out.println("File Loaded");
				System.out.println("File was last open at "+model.getTimestamp());
			}
			catch(Exception e)
			{
				System.out.println("Nothing to Load");
			}
			p.show();
			Controller x=b.getController();
			x.setMainApp(this);
			x.initialize_();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void uploadCV()
	{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Testing Potato");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		Stage lol=new Stage();
		fileChooser.showOpenDialog(lol);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
