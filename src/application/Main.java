package application;

import java.io.BufferedReader;

//@author : Anshuman Suri : 2014021
//Please read the README.md before testing the applciation 
	
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
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
		BufferedReader enrI=null;
		BufferedWriter enrO=null;
		try {
			try
			{
				enrI=new BufferedReader(new FileReader("enrol.txt"));
				int yoda=Integer.parseInt(enrI.readLine());
				yoda+=1;
				this.model.setEnrollment_number(String.valueOf(yoda));
				enrI.close();
				enrO=new BufferedWriter(new FileWriter("enrol.txt"));
				enrO.write(String.valueOf(yoda));
				enrO.close();
			}
			catch(Exception e)
			{
				enrO=new BufferedWriter(new FileWriter("enrol.txt"));
				enrO.write("1");
				enrO.close();
				this.model.setEnrollment_number("1");
			}
//			this.model.setEnrollment_number("PotatoLAND");
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
			this.model.setTimestamp(LocalDate.now());
			temp.writeObject(this.model);
			if(this.model.getP()==null) System.out.println("F*CK");
			if(this.model==null) System.out.println("Double F*CK");
			temp.close();
			TXT_Record_Maker();
			//Delete temporary .dat file :
			boolean flux=new File("temp.dat").delete();
			if(flux)
			{
				System.out.println("Succcessfully deleted temp.dat file");
			}
			boolean flux2=tempcv.delete();
			if(flux2)
			{
				System.out.println("Succcessfully deleted temp_CV.dat file");
			}
			boolean flux3=tempsop.delete();
			if(flux3)
			{
				System.out.println("Succcessfully deleted temp_SOP.dat file");
			}
		} catch (IOException e) {
			System.out.println("Could not write to file");
			e.printStackTrace();
		}
	}
	
	private void TXT_Record_Maker()
	{
		BufferedWriter nada= null;
	      try
	      {
	    	  nada=new BufferedWriter(new FileWriter("UserFiles"+File.separator+this.model.getEnrollment_number()+File.separator+this.model.getEnrollment_number()+".txt"));
	    	  Personal x=this.model.getP();
	    	  Education y=this.model.getE();
	    	  String yolo;
	    	  nada.write("Enrollment Number : "+this.model.getEnrollment_number()+"\n");
	    	  nada.write("Timestamp : "+this.model.getTimestamp()+"\n\n");
	    	  nada.write("PERSONAL DETAILS:\n");
	    	  nada.write("Email : "+x.getEmail()+"\n");
	    	  nada.write("Name : "+x.getName()+"\n");
	    	  nada.write("Address of Correspondence : "+x.getAdd_correspondence()+"\n");
	    	  nada.write("Mobile : "+x.getMobile()+"\n");
	    	  if(x.getPhd_stream()==1) yolo="Computer Science";
	    	  else if(x.getPhd_stream()==2) yolo="Electronics and Communication";
	    	  else yolo="Computational Biology";
	    	  nada.write("PhD Stream : "+yolo+"\n");
	    	  nada.write("PhD Preference 1 : "+x.getPreference()[0]+"\n");
	    	  nada.write("PhD Preference 2 : "+x.getPreference()[1]+"\n");
	    	  nada.write("PhD Preference 3 : "+x.getPreference()[2]+"\n");
	    	  if(x.getGender()) yolo="Female";
	    	  else yolo="Male";
	    	  nada.write("Gender : "+yolo+"\n");
	    	  nada.write("Category : "+x.getCategory()+"\n");
	    	  if(x.getPhysically_disabled()) yolo="Yes";
	    	  else yolo="No";
	    	  nada.write("Physically Disabled : "+yolo+"\n");
	    	  nada.write("Date of Birth : "+x.getDate_of_birth().toString()+"\n");
	    	  if(x.getWar_category()) yolo="Yes";
	    	  else yolo="No";
	    	  nada.write("Children/War Widows of Defence Personnel wounded/killed in war : "+yolo+"\n");
	    	  nada.write("Father's Name : "+x.getFather_name()+"\n");
	    	  nada.write("Nationality : "+x.getNationality()+"\n");
	    	  nada.write("Permanent Address : "+x.getAdd_permanent()+"\n");
	    	  nada.write("Pincode : "+x.getPincode()+"\n");
	    	  nada.write("\n");
	    	  nada.write("SCHOOLING DETAILS:\n");
	    	  nada.write("Xth Board : "+y.getX_board()+"\n");
	    	  nada.write("Xth Marks : "+y.getX_marks()+"\n");
	    	  nada.write("Year of Passing Xth : "+y.getX_year()+"\n");
	    	  nada.write("XIIth Board : "+y.getXii_board()+"\n");
	    	  nada.write("XIIth Marks : "+y.getXii_marks()+"\n");
	    	  nada.write("Year of Passing XIIth : "+y.getXii_year()+"\n");
	    	  nada.write("\n");
	    	  nada.write("GRADUATION DETAILS:\n");
	    	  nada.write("Degree : "+y.getDegree()+"\n");
	    	  nada.write("Department/Discipline : "+y.getDepartment()+"\n");
	    	  nada.write("College : "+y.getCollege()+"\n");
	    	  nada.write("University : "+y.getUniversity()+"\n");
	    	  nada.write("City : "+y.getCity()+"\n");
	    	  nada.write("State : "+y.getState()+"\n");
	    	  nada.write("Year of Graduation : "+y.getGraduation_year()+"\n");
	    	  if(y.isType()==1){
	    		  if(y.isDrop()) yolo="10";
	    		  else yolo="4";
	    		  nada.write("CGPA : "+y.getGraduation_marks()+"/"+yolo+"\n");
	    	  }
	    	  else if(y.isType()==2)
	    	  {
	    		  nada.write("Marks : "+y.getGraduation_marks()+"%\n");
	    	  }
	    	  nada.write("\n");
	    	  if(y.getEce_phd())
	    	  {
	    		  nada.write("ECE PhD\n");
	    		  nada.write("Preference 1 : "+y.getE().getPreferences()[0]+"\n");
	    		  nada.write("Preference 2 : "+y.getE().getPreferences()[1]+"\n");
	    		  nada.write("Preference 3 : "+y.getE().getPreferences()[2]+"\n");
	    		  nada.write("Preference 4 : "+y.getE().getPreferences()[3]+"\n");
	    		  nada.write("\n");
	    	  }
	    	  if(y.getPost_graduate())
	    	  {
	    		  nada.write("POST GRADUATION\n");
	    		  nada.write("College : "+y.getPG().getCollege()+"\n");
	    		  nada.write("City : "+y.getPG().getCity()+"\n");
	    		  nada.write("State : "+y.getPG().getState()+"\n");
	    		  nada.write("Department/Discipline : "+y.getPG().getDepartment()+"\n");
	    		  nada.write("Thesis title : "+y.getPG().getTitle()+"\n");
	    		  nada.write("Year of Post-Graduation : "+y.getPG().getYear()+"\n");
	    		  if(y.getPG().isType()==1){
		    		  if(y.getPG().isDrop()) yolo="10";
		    		  else yolo="4";
		    		  nada.write("CGPA : "+y.getPG().getMarks()+"/"+yolo+"\n");
		    	  }
		    	  else if(y.getPG().isType()==2)
		    	  {
		    		  nada.write("Marks : "+y.getPG().getMarks()+"%\n");
		    	  }
	    		  nada.write("\n");
	    	  }
	    	  if(y.getOther_degree())
	    	  {
	    		  nada.write("OTHER DEGREE\n");
	    		  nada.write("Exam Name : "+y.getOD().getExam_name()+"\n");
	    		  nada.write("Subject : "+y.getOD().getSubject()+"\n");
	    		  nada.write("Year : "+y.getOD().getYear()+"\n");
	    		  nada.write("Score : "+y.getOD().getScore()+"\n");
	    		  nada.write("Rank : "+y.getOD().getRank()+"\n");
	    		  nada.write("\n");
	    	  }
	    	  if(y.getGiven_gate())
	    	  {
	    		  nada.write("Area : "+y.getG().getArea()+"\n");
	    		  nada.write("Year : "+y.getG().getYear()+"\n");
	    		  nada.write("Marks : "+y.getG().getMarks()+"/100\n");
	    		  nada.write("Score : "+y.getG().getScore()+"\n");
	    		  nada.write("Rank : "+y.getG().getRank()+"\n");
	    		  nada.write("\n");
	    	  }
	    	  nada.write("Achievements :"+y.getAchievements()+"\n");
	    	  nada.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	         System.out.println("Could not make .txt file");
	      }
	}
	
	public void temp_closer()
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
