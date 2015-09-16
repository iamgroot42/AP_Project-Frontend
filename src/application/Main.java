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
import javafx.stage.Stage;
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
			String enrl=this.model.getEnrollment_number();
			File dir = new File("UserFiles");
			if (!dir.exists()) {
				if (dir.mkdir()) {
					System.out.println("Directory is created! (one time)");
				} else {
					System.out.println("Failed to create directory!");
				}
			}
			File dir2 = new File("UserFiles"+File.separator+enrl);
			if (!dir2.exists()) {
				if (dir2.mkdir()) {
					System.out.println("Directory for user is created! (one time)");
				} else {
					System.out.println("Failed to create directory for user!");
				}
			}
			ObjectOutputStream temp=new ObjectOutputStream(new FileOutputStream("UserFiles"+File.separator+enrl+File.separator+enrl+".dat"));
			File tempcv=new File("tempCV.pdf");
			File realcv=new File("UserFiles"+File.separator+enrl+File.separator+enrl+"_CV.pdf");
			File tempsop=new File("tempSOP.pdf");
			File realsop=new File("UserFiles"+File.separator+enrl+File.separator+enrl+"_SOP.pdf");
			tempcv.renameTo(realcv);
			tempsop.renameTo(realsop);
			this.model.setEnrollment_number("PotatoLAND");
			this.model.setTimestamp(LocalDate.now());
			temp.writeObject(this.model);
			if(this.model.getP()==null) System.out.println("F*CK");
			if(this.model==null) System.out.println("Double F*CK");
			temp.close();
		} catch (IOException e) {
			System.out.println("Could not write to file");
			e.printStackTrace();
		}
	}
	
	public void final_closer()
	{
		try {
			ObjectOutputStream temp=new ObjectOutputStream(new FileOutputStream("temp.dat"));
			this.model.setTimestamp(LocalDate.now());
			temp.writeObject(this.model);
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
	
	public static void main(String[] args) {
		launch(args);
	}
}
