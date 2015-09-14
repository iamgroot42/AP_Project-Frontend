package application;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;

public class Controller
{
	@FXML private TabPane t;
    @FXML private Tab t1;
    @FXML private Tab t2;
    @FXML private Tab t3;
    @FXML private TextField email_x;
    @FXML private TextField name_x;
    @FXML private TextField mob_x;
    @FXML private TextArea addc_x;
    @FXML private ChoiceBox<String> pref1_x;
    @FXML private ChoiceBox<String> pref2_x;
    @FXML private ChoiceBox<String> pref3_x;
    @FXML private TextField pin_x;
    @FXML private TextField fname_x;
    @FXML private TextArea addp_x;
    @FXML private ChoiceBox<String> nation_x;
    @FXML private RadioButton genderm_x;
    @FXML private RadioButton genderf_x;
    @FXML private ChoiceBox<String> category_x;
    @FXML private RadioButton phyy_x;
    @FXML private RadioButton phyn_x;
    @FXML private DatePicker dob_x;
    @FXML private RadioButton wary_x;
    @FXML private RadioButton warn_x;
    @FXML private RadioButton stream1_x;
    @FXML private RadioButton stream2_x;
    @FXML private RadioButton stream3_x;
    @FXML Label error_t1;
    @FXML private Label email_x2;
    @FXML private Label name_x2;
    @FXML private Label addc_x2;
    @FXML private Label mob_x2;
    @FXML private Label phd_x2;
    @FXML private Label pref1_x2;
    @FXML private Label pref2_x2;
    @FXML private Label pref3_x2;
    @FXML private Label gender_x2;
    @FXML private Label category_x2;
    @FXML private Label phy_x2;
    @FXML private Label dob_x2;
    @FXML private Label war_x2;
    @FXML private Label fname_x2;
    @FXML private Label nation_x2;
    @FXML private Label addp_x2;
    //Tab 2:
    @FXML private TextField x_board_y;
    @FXML private TextField x_marks_y;
    @FXML private TextField xii_board_y;
    @FXML private TextField xii_marks_y;
    @FXML private ChoiceBox<Integer> x_year_y;
    @FXML private ChoiceBox<Integer> xii_year_y;
    @FXML private Label x_board_yl;
    @FXML private Label x_marks_yl;
    @FXML private Label xii_board_yl;
    @FXML private Label xii_marks_yl;
    @FXML private Label x_year_yl;
    @FXML private Label xii_year_yl;
    @FXML private TextField grad_degree_y;
    @FXML private TextField grad_dept_y;
    @FXML private TextField grad_coll_y;
    @FXML private TextField grad_univ_y;
    @FXML private TextField grad_city_y;
    @FXML private ChoiceBox<String> grad_state_y;
    @FXML private ChoiceBox<Integer> grad_year_y;
    @FXML private Label grad_degree_yl;
    @FXML private Label grad_dept_yl;
    @FXML private Label grad_coll_yl;
    @FXML private Label grad_univ_yl;
    @FXML private Label grad_city_yl;
    @FXML private Label grad_state_yl;
    @FXML private Label grad_year_yl;
    @FXML private CheckBox check1;
    @FXML private CheckBox check2;
    @FXML private CheckBox check3;
    @FXML private CheckBox check4;
    @FXML private TitledPane teb1;
    @FXML private TitledPane teb2;
    @FXML private TitledPane teb3;
    @FXML private TitledPane teb4;
    @FXML private RadioButton cgpa1b;
    @FXML private RadioButton marks1b;
    @FXML private ChoiceBox<Integer> cgpa1d;
    @FXML private TextField cgpa1;
    @FXML private TextField marks1;
    @FXML private RadioButton cgpa2b;
    @FXML private RadioButton marks2b;
    @FXML private ChoiceBox<Integer> cgpa2d;
    @FXML private TextField cgpa2;
    @FXML private TextField marks2;
    @FXML private Label cgpa1l;
    @FXML private Label cgpa2l;
    @FXML private Label uploadCVl;
    @FXML private Label uploadSOPl;
    
    //Mini tab 1:
    @FXML private Label ece_pref1l;
    @FXML private Label ece_pref2l;
    @FXML private Label ece_pref3l;
    @FXML private Label ece_pref4l;
    @FXML private ChoiceBox<String> ece_pref1;
    @FXML private ChoiceBox<String> ece_pref2;
    @FXML private ChoiceBox<String> ece_pref3;
    @FXML private ChoiceBox<String> ece_pref4;
    //Mini tab 2:
    @FXML private TextField post_coll;
    @FXML private TextField post_city;
    @FXML private TextField post_dept;
    @FXML private TextField post_degree;
    @FXML private TextField post_thesis;
    @FXML private ChoiceBox<String> post_state;
    @FXML private ChoiceBox<Integer> post_year;
    @FXML private Label post_colll;
    @FXML private Label post_cityl;
    @FXML private Label post_deptl;
    @FXML private Label post_degreel;
    @FXML private Label post_thesisl;
    @FXML private Label post_statel;
    @FXML private Label post_yearl;
    //Mini tab 3:
    @FXML private TextField exam;
    @FXML private TextField subject;
    @FXML private ChoiceBox<Integer> other_year;
    @FXML private TextField score;
    @FXML private TextField rank;
    @FXML private Label examl;
    @FXML private Label subjectl;
    @FXML private Label other_yearl;
    @FXML private Label scorel;
    @FXML private Label rankl;
    //Mini tab 4:
    @FXML private TextField area;
    @FXML private TextField marks_other;
    @FXML private TextField score_other;
    @FXML private TextField rank_other;
    @FXML private ChoiceBox<Integer> year_other; 
    @FXML private Label areal;
    @FXML private Label marks_otherl;
    @FXML private Label score_otherl;
    @FXML private Label rank_otherl;
    @FXML private Label year_otherl; 
      
	Main mane;
	int phdstream;
	boolean gender,physical,war;
	ObservableList<String> cse_pref;
	ObservableList<String> ece_pref;
	ObservableList<String> bt_pref;
	
	public void setMainApp(Main p)
	{
		this.mane=p;
	}
	
	@FXML
	void cgpat()
	{
		cgpa1b.setSelected(true);
		marks1.setDisable(true);
		cgpa1.setDisable(false);
		cgpa1d.setDisable(false);
		marks1b.setSelected(false);
	}
	
	@FXML
	void cgpa2t()
	{
		cgpa2b.setSelected(true);
		marks2.setDisable(true);
		cgpa2.setDisable(false);
		cgpa2d.setDisable(false);
		marks2b.setSelected(false);
	}
	
	@FXML
	void markst()
	{
		marks1b.setSelected(true);
		marks1.setDisable(false);
		cgpa1.setDisable(true);
		cgpa1d.setDisable(true);
		cgpa1b.setSelected(false);
	}
	
	@FXML
	void marks2t()
	{
		marks2b.setSelected(true);
		marks2.setDisable(false);
		cgpa2.setDisable(true);
		cgpa2d.setDisable(true);
		cgpa2b.setSelected(false);
	}
	
	@FXML
	void stream1_x_f()
	{
		stream1_x.setSelected(true);
		stream2_x.setSelected(false);
		stream3_x.setSelected(false);
		populate_cse_pref();
	}
	
	@FXML
	void stream2_x_f()
	{
		stream1_x.setSelected(false);
		stream2_x.setSelected(true);
		stream3_x.setSelected(false);
		populate_ece_pref();
	}
	
	@FXML
	void stream3_x_f()
	{
		stream1_x.setSelected(false);
		stream2_x.setSelected(false);
		stream3_x.setSelected(true);
		populate_bt_pref();
	}
	
	@FXML
	void genderf_x_f()
	{
		genderf_x.setSelected(true);
		genderm_x.setSelected(false);
	}
	
	@FXML
	void genderm_x_f()
	{
		genderf_x.setSelected(false);
		genderm_x.setSelected(true);
	}
	
	@FXML
	void phyn_x_f()
	{
		phyy_x.setSelected(false);
		phyn_x.setSelected(true);
	}
	
	@FXML
	void phyy_x_f()
	{
		phyy_x.setSelected(true);
		phyn_x.setSelected(false);
	}
	
	@FXML
	void wary_x_f()
	{
		wary_x.setSelected(true);
		warn_x.setSelected(false);
	}
	
	@FXML
	void warn_x_f()
	{
		wary_x.setSelected(false);
		warn_x.setSelected(true);
	}
	
	@FXML
	void check1_f()
	{
		if(check1.isSelected())
		{
			teb1.setDisable(false);
		}
		else
		{
			teb1.setDisable(true);
		}
	}
	
	@FXML
	void check2_f()
	{
		if(check2.isSelected())
		{
			teb2.setDisable(false);
		}
		else
		{
			teb2.setDisable(true);
		}
	}
	
	@FXML
	void check3_f()
	{
		if(check3.isSelected())
		{
			teb3.setDisable(false);
		}
		else
		{
			teb3.setDisable(true);
		}
	}
	
	@FXML
	void check4_f()
	{
		if(check4.isSelected())
		{
			teb4.setDisable(false);
		}
		else
		{
			teb4.setDisable(true);
		}
	}
		
	private boolean schooling()
	{
		boolean temp=true;
		if(x_board_y.getText().equals(""))
		{
			temp=false;
			x_board_yl.setTextFill(Color.RED);
		}
		else
		{
			x_board_yl.setTextFill(Color.BLACK);
		}
		try
		{
			float x=Float.parseFloat(x_marks_y.getText());
			if(x<0 || x>100)
			{
				x_marks_yl.setTextFill(Color.RED);
				temp=false;
			}
			else
			{
				x_marks_yl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			x_marks_yl.setTextFill(Color.RED);
			temp=false;
		}
		if(xii_board_y.getText().equals(""))
		{
			temp=false;
			xii_board_yl.setTextFill(Color.RED);
		}
		else
		{
			xii_board_yl.setTextFill(Color.BLACK);
		}
		try
		{
			float x=Float.parseFloat(xii_marks_y.getText());
			if(x<0 || x>100)
			{
				xii_marks_yl.setTextFill(Color.RED);
				temp=false;
			}
			else
			{
				xii_marks_yl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			xii_marks_yl.setTextFill(Color.RED);
			temp=false;
		}
		return temp;
	}
	
	private boolean graduation()
	{
		boolean temp=true;
		if(grad_degree_y.getText().equals(""))
		{
			grad_degree_yl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			grad_degree_yl.setTextFill(Color.BLACK);
		}
		if(grad_dept_y.getText().equals(""))
		{
			grad_dept_yl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			grad_dept_yl.setTextFill(Color.BLACK);
		}
		if(grad_coll_y.getText().equals(""))
		{
			grad_coll_yl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			grad_coll_yl.setTextFill(Color.BLACK);
		}
		if(grad_univ_y.getText().equals(""))
		{
			grad_univ_yl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			grad_univ_yl.setTextFill(Color.BLACK);
		}
		if(grad_city_y.getText().equals(""))
		{
			grad_city_yl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			grad_city_yl.setTextFill(Color.BLACK);
		}
		if(cgpa1b.isSelected())
		{
			try
			{
				float x=Float.parseFloat(cgpa1.getText());
				if(x<0 || x>cgpa1d.getValue())
				{
					temp=false;
					cgpa1l.setTextFill(Color.RED);
				}
				else
				{
					cgpa1l.setTextFill(Color.BLACK);
				}
			}
			catch(Exception e)
			{
				temp=false;
				cgpa1l.setTextFill(Color.RED);
			}
		}
		if(marks1b.isSelected())
		{
			try
			{
				float x=Float.parseFloat(marks1.getText());
				if(x<0 || x>100)
				{
					temp=false;
					cgpa1l.setTextFill(Color.RED);
				}
				else
				{
					cgpa1l.setTextFill(Color.BLACK);
				}
			}
			catch(Exception e)
			{
				temp=false;
				cgpa1l.setTextFill(Color.RED);
			}
		}
		return temp;
	}
	
	private boolean teb1_check()
	{
		boolean temp=true;
		if(ece_pref1.getValue().equals("----"))
		{
			temp=false;
			ece_pref1l.setTextFill(Color.RED);
		}
		else
		{
			ece_pref1l.setTextFill(Color.BLACK);
		}
		if(ece_pref2.getValue().equals("----"))
		{
			temp=false;
			ece_pref2l.setTextFill(Color.RED);
		}
		else
		{
			ece_pref2l.setTextFill(Color.BLACK);
		}
		if(ece_pref3.getValue().equals("----"))
		{
			temp=false;
			ece_pref3l.setTextFill(Color.RED);
		}
		else
		{
			ece_pref3l.setTextFill(Color.BLACK);
		}
		return temp;
	}
	
	private boolean teb2_check()
	{
		boolean temp=true;
		if(post_coll.getText().equals(""))
		{
			temp=false;
			post_colll.setTextFill(Color.RED);
		}
		else
		{
			post_colll.setTextFill(Color.BLACK);
		}
		if(post_city.getText().equals(""))
		{
			temp=false;
			post_cityl.setTextFill(Color.RED);
		}
		else
		{
			post_cityl.setTextFill(Color.BLACK);
		}
		if(post_dept.getText().equals(""))
		{
			temp=false;
			post_deptl.setTextFill(Color.RED);
		}
		else
		{
			post_deptl.setTextFill(Color.BLACK);
		}
		if(post_degree.getText().equals(""))
		{
			temp=false;
			post_degreel.setTextFill(Color.RED);
		}
		else
		{
			post_degreel.setTextFill(Color.BLACK);
		}
		if(post_thesis.getText().equals(""))
		{
			temp=false;
			post_thesisl.setTextFill(Color.RED);
		}
		else
		{
			post_thesisl.setTextFill(Color.BLACK);
		}
		if(post_state.getValue().equals("----"))
		{
			temp=false;
			post_statel.setTextFill(Color.RED);
		}
		else
		{
			post_statel.setTextFill(Color.BLACK);
		}
		if(post_year.getValue().equals("----"))
		{
			temp=false;
			post_yearl.setTextFill(Color.RED);
		}
		else
		{
			post_yearl.setTextFill(Color.BLACK);
		}
		if(cgpa2b.isSelected())
		{
			try
			{
				float x=Float.parseFloat(cgpa2.getText());
				if(x<0 || x>cgpa2d.getValue())
				{
					temp=false;
					cgpa2l.setTextFill(Color.RED);
				}
				else
				{
					cgpa2l.setTextFill(Color.BLACK);
				}
			}
			catch(Exception e)
			{
				temp=false;
				cgpa1l.setTextFill(Color.RED);
			}
		}
		if(marks2b.isSelected())
		{
			try
			{
				float x=Float.parseFloat(marks2.getText());
				if(x<0 || x>100)
				{
					temp=false;
					cgpa2l.setTextFill(Color.RED);
				}
				else
				{
					cgpa2l.setTextFill(Color.BLACK);
				}
			}
			catch(Exception e)
			{
				temp=false;
				cgpa2l.setTextFill(Color.RED);
			}
		}
		return temp;
	}
	
	private boolean teb3_check()
	{
		boolean temp=true;
		if(exam.getText().equals(""))
		{
			examl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			examl.setTextFill(Color.BLACK);
		}
		if(subject.getText().equals(""))
		{
			subjectl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			subjectl.setTextFill(Color.BLACK);
		}
		try
		{
			int x=Integer.parseInt(score.getText());
			if(x<0)
			{
				scorel.setTextFill(Color.RED);
				temp=false;
			}
			else
			{
				scorel.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			scorel.setTextFill(Color.RED);
			temp=false;
		}
		try
		{
			int x=Integer.parseInt(rank.getText());
			if(x<0)
			{
				rankl.setTextFill(Color.RED);
				temp=false;
			}
			else
			{
				rankl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			rankl.setTextFill(Color.RED);
			temp=false;
		}
		if(other_year.getValue().equals("----"))
		{
			other_yearl.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			other_yearl.setTextFill(Color.BLACK);
		}
		return temp;
	}
	
	private boolean teb4_check()
	{
		boolean temp=true;
		if(area.getText().equals(""))
		{
			temp=false;
			areal.setTextFill(Color.RED);
		}
		else
		{
			areal.setTextFill(Color.BLACK);
		}
		if(year_other.getValue().equals("----"))
		{
			temp=false;
			year_otherl.setTextFill(Color.RED);
		}
		else
		{
			year_otherl.setTextFill(Color.BLACK);
		}
		try
		{
			float x=Float.parseFloat(marks_other.getText());
			if(x<0 || x>100)
			{
				temp=false;
				marks_otherl.setTextFill(Color.RED);
			}
			else
			{
				marks_otherl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			marks_otherl.setTextFill(Color.RED);
			temp=false;
		}
		try
		{
			float x=Float.parseFloat(score_other.getText());
			if(x<0 || x>100)
			{
				temp=false;
				score_otherl.setTextFill(Color.RED);
			}
			else
			{
				score_otherl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			score_otherl.setTextFill(Color.RED);
			temp=false;
		}
		try
		{
			int x=Integer.parseInt(rank_other.getText());
			if(x<0 || x>100)
			{
				temp=false;
				rank_otherl.setTextFill(Color.RED);
			}
			else
			{
				rank_otherl.setTextFill(Color.BLACK);
			}
		}
		catch(Exception e)
		{
			rank_otherl.setTextFill(Color.RED);
			temp=false;
		}
		return temp;
	}
	
	@FXML
	void handleb2()
	{
		boolean temp=true;
		boolean temp2;
		temp2=schooling(); temp=temp && temp2;
		temp2=graduation(); temp=temp && temp2;
		//ToDo : Fix problem with TitlePanes not going RED
		if(check1.isSelected()) {temp2=teb1_check(); if(!temp2){ teb1.setTextFill(Color.RED);} else{teb1.setTextFill(Color.BLACK);}temp=temp && temp2;}
		if(check2.isSelected()) {temp2=teb2_check(); if(!temp2){ teb2.setTextFill(Color.RED);} else{teb2.setTextFill(Color.BLACK);}temp=temp && temp2;}
		if(check3.isSelected()) {temp2=teb3_check(); if(!temp2){ teb3.setTextFill(Color.RED);} else{teb3.setTextFill(Color.BLACK);}temp=temp && temp2;}
		if(check4.isSelected()) {temp2=teb4_check(); if(!temp2){ teb4.setTextFill(Color.RED);} else{teb4.setTextFill(Color.BLACK);}temp=temp && temp2;}
		//Check for uploaded file
		if(temp)
		{
			//write objects of subclasses individually
			saveE();
			System.out.println("Writing new Education");
		}
	}
	
	@FXML
    void handleb1() {
		boolean temp=true;
		boolean random=false;
		if(email_x.getText().equals(""))
		{
			email_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			email_x2.setTextFill(Color.BLACK);
		}
		if(name_x.getText().equals("") || name_x.getText().matches(".*\\d+.*"))
		{
			name_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			name_x2.setTextFill(Color.BLACK);
		}
		if(addc_x.getText().equals(""))
		{
			addc_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			addc_x2.setTextFill(Color.BLACK);
		}
		if(mob_x.getText().equals(""))
		{
			mob_x2.setTextFill(Color.RED); 
			temp=false;
		}
		else
		{
			mob_x2.setTextFill(Color.BLACK); 
		}
		if(fname_x.getText().equals("") || fname_x.getText().matches(".*\\d+.*"))
		{
			fname_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			fname_x2.setTextFill(Color.BLACK);
		}
		if(addp_x.getText().equals(""))
		{
			addp_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			addp_x2.setTextFill(Color.BLACK);
		}
		random=false;
		if(stream1_x.isSelected()) random=true;
		if(stream2_x.isSelected()) random=true;
		if(stream3_x.isSelected()) random=true;
		if(!random)
		{
			phd_x2.setTextFill(Color.RED);
			temp=false;
			stream1_x.setSelected(false);
			stream2_x.setSelected(false);
			stream3_x.setSelected(false);
		}
		else
		{
			phd_x2.setTextFill(Color.BLACK);
		}
		random=false;
		if(genderm_x.isSelected()) random=true;
		if(genderf_x.isSelected()) random=true;
		if(!random)
		{
			gender_x2.setTextFill(Color.RED);
			temp=false;
			genderm_x.setSelected(false);
			genderf_x.setSelected(false);
		}
		else
		{
			gender_x2.setTextFill(Color.BLACK);
		}
		random=false;
		if(phyy_x.isSelected()) random=true;
		if(phyn_x.isSelected()) random=true;
		if(!random)
		{
			phy_x2.setTextFill(Color.RED);
			temp=false;
			phyy_x.setSelected(false);
			phyn_x.setSelected(false);
		}
		else
		{
			phy_x2.setTextFill(Color.BLACK);
		}
		random=false;
		if(wary_x.isSelected()) random=true;
		if(warn_x.isSelected()) random=true;
		if(!random)
		{
			war_x2.setTextFill(Color.RED);
			temp=false;
			wary_x.setSelected(false);
			warn_x.setSelected(false);
		}
		else
		{
			war_x2.setTextFill(Color.BLACK);
		}
		if(category_x.getValue().equals("----"))
		{
			category_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			category_x2.setTextFill(Color.BLACK);
		}
		if(nation_x.getValue().equals("----"))
		{
			nation_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			nation_x2.setTextFill(Color.BLACK);
		}
		if(dob_x.getValue()==null || dob_x.getValue().compareTo(LocalDate.now())>0)
		{
			dob_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			dob_x2.setTextFill(Color.BLACK);
		}
		if(pref1_x.getValue().equals("----"))
		{
			pref1_x2.setTextFill(Color.RED);
			temp=false;
		}
		else
		{
			pref1_x2.setTextFill(Color.BLACK);
		}
		if(temp)
		{
			save_P();
			System.out.println("Writing new Personal");
		}
    }
	
	private void save_P()
	{
		Personal tempo=new Personal();
		if(genderm_x.isSelected()) this.gender=true;
		else this.gender=false;
		if(phyy_x.isSelected()) this.physical=true;
		else this.physical=false;
		if(wary_x.isSelected()) this.war=true;
		else this.war=false;
		if(stream1_x.isSelected()) this.phdstream=1;
		else if(stream2_x.isSelected()) this.phdstream=2;
		else this.phdstream=3;
		tempo.setAdd_correspondence(addc_x.getText());
		tempo.setAdd_permanent(addp_x.getText());
		tempo.setCategory(category_x.getValue());
		tempo.setDate_of_birth(dob_x.getValue());
		tempo.setEmail(email_x.getText());
		tempo.setFather_name(fname_x.getText());
		tempo.setGender(this.gender);
		tempo.setMobile(mob_x.getText());
		tempo.setName(name_x.getText());
		tempo.setNationality(nation_x.getValue());
		tempo.setPhd_stream(this.phdstream);
		tempo.setPhysically_disabled(this.physical);
		tempo.setPincode(pin_x.getText());
		String[] temp=new String[3];
		temp[0]=pref1_x.getValue();
		temp[1]=pref2_x.getValue();
		temp[2]=pref3_x.getValue();
		tempo.setPreference(temp);
		tempo.setWar_category(this.war);	
		System.out.println("Updated new");
		mane.getModel().setP(tempo);
		mane.closer();
	}
	
	private void saveE()
	{
		Education tempo=new Education();
		tempo.setX_board(x_board_y.getText());
		tempo.setX_marks(Float.parseFloat(x_marks_y.getText()));
	    tempo.setX_year(x_year_y.getValue());
		tempo.setXii_board(xii_board_y.getText());
		tempo.setXii_marks(Float.parseFloat(xii_marks_y.getText()));
		tempo.setXii_year(xii_year_y.getValue());
		tempo.setDegree(grad_degree_y.getText());
		tempo.setDepartment(grad_dept_y.getText());
		tempo.setCollege(grad_coll_y.getText());
		tempo.setUniversity(grad_univ_y.getText());
		tempo.setCity(grad_city_y.getText());
		tempo.setState(grad_state_y.getValue());
		tempo.setGraduation_year(grad_year_y.getValue());
//		if(cgpa1b.isSelected())
		boolean one,two,three,four;
		one=check1.isSelected();
		two=check2.isSelected();
		three=check3.isSelected();
		four=check4.isSelected();
		tempo.setEce_phd(one);
		tempo.setPost_graduate(two);
		tempo.setOther_degree(three);
		tempo.setGiven_gate(four);
		if(one)
		{
			ECE p=new ECE();
			String[] nada={ece_pref1.getValue(),ece_pref2.getValue(),ece_pref3.getValue(),ece_pref4.getValue()};
			p.setPreferences(nada);
			tempo.setE(p);
		}
		if(two)
		{
			Post_Graduate p=new Post_Graduate();
			p.setCollege(post_coll.getText());
			p.setCity(post_city.getText());
			p.setState(post_state.getValue());
			p.setDepartment(post_dept.getText());
			p.setDegree(post_degree.getText());
			p.setTitle(post_thesis.getText());
			p.setYear(post_year.getValue());
			tempo.setPG(p);
		}
		if(three)
		{
			Other_Degree p=new Other_Degree();
			p.setExam_name(exam.getText());
			p.setSubject(subject.getText());
			p.setYear(other_year.getValue());
			p.setScore(Integer.parseInt(score.getText()));
			p.setRank(Integer.parseInt(rank.getText()));
			tempo.setOD(p);
		}
		if(four)
		{
			Gate p=new Gate();
			p.setArea(area.getText());
			p.setYear(other_year.getValue());
			p.setMarks(Float.parseFloat(marks_other.getText()));
			p.setScore(Float.parseFloat(score_other.getText()));
			p.setRank(Integer.parseInt(rank_other.getText()));
			tempo.setG(p);
		}	
		//Save file
		mane.getModel().setE(tempo);
		mane.closer();
	}
	
	private void populate_t1()
	{
		if(mane.getModel().getP()!=null) 
		{
			System.out.println("This must be my lucky day");
			Personal temp=mane.getModel().getP();
			email_x.setText(temp.getEmail());
			name_x.setText(temp.getName());
			addc_x.setText(temp.getAdd_correspondence());
			mob_x.setText(temp.getMobile());
			pref1_x.setValue(temp.getPreference()[0]); //Not working :(
			pref2_x.setValue(temp.getPreference()[1]);
			pref3_x.setValue(temp.getPreference()[2]);
			category_x.setValue(temp.getCategory());
			int nada=temp.getPhd_stream();
			System.out.println(nada);
			if(nada==1) {stream1_x.setSelected(true); stream1_x_f();}
			else if(nada==2) {stream2_x.setSelected(true); stream2_x_f();}
			else {stream3_x.setSelected(true); stream3_x_f();}
			dob_x.setValue(temp.getDate_of_birth());
			fname_x.setText(temp.getFather_name());
			addp_x.setText(temp.getAdd_permanent());
			pin_x.setText(temp.getPincode());
			if(temp.getWar_category()) {wary_x.setSelected(true); wary_x_f();}
			else {warn_x.setSelected(true); warn_x_f();}
			if(temp.getPhysically_disabled()) {phyy_x.setSelected(true); phyy_x_f();}
			else {phyn_x.setSelected(true); phyn_x_f();}
			if(temp.getGender()) {genderf_x.setSelected(true); genderf_x_f();} //Sexism
			else {genderm_x.setSelected(true); genderm_x_f();}
		}
		System.out.println("Maybe not..f**k you");
	}
	
	private void populate_t2()
	{
		if(mane.getModel().getE()!=null) 
		{
			System.out.println("This must be my lucky day");
			Education temp=mane.getModel().getE();
			x_board_y.setText(temp.getX_board());
			x_marks_y.setText(String.valueOf(temp.getX_marks()));
			x_year_y.setValue(temp.getX_year());
			xii_board_y.setText(temp.getXii_board());
			xii_marks_y.setText(String.valueOf(temp.getXii_marks()));
			xii_year_y.setValue(temp.getXii_year());
			grad_degree_y.setText(temp.getDegree());
			grad_dept_y.setText(temp.getDepartment());
			grad_coll_y.setText(temp.getCollege());
			grad_univ_y.setText(temp.getUniversity());
			grad_city_y.setText(temp.getCity());
			grad_state_y.setValue(temp.getState());
			grad_year_y.setValue(temp.getGraduation_year());
			if(temp.getEce_phd()){check1.setSelected(true); check1_f();}
			if(temp.getPost_graduate()){check2.setSelected(true); check2_f();}
			if(temp.getOther_degree()){check3.setSelected(true);check3_f();}
			if(temp.getGiven_gate()){check4.setSelected(true); check4_f();}
		}
		System.out.println("Maybe not..f**k you");
	}
	
	private void populate_cse_pref()
	{
		pref1_x.setItems(cse_pref);
		pref2_x.setItems(cse_pref);
		pref3_x.setItems(cse_pref);
		pref1_x.getSelectionModel().select(0);
		pref2_x.getSelectionModel().select(0);
		pref3_x.getSelectionModel().select(0);
	}
	
	private void populate_ece_pref()
	{
		pref1_x.setItems(ece_pref);
		pref2_x.setItems(ece_pref);
		pref3_x.setItems(ece_pref);
		pref1_x.getSelectionModel().select(0);
		pref2_x.getSelectionModel().select(0);
		pref3_x.getSelectionModel().select(0);
	}
	
	private void populate_bt_pref()
	{
		pref1_x.setItems(bt_pref);	
		pref2_x.setItems(bt_pref);	
		pref3_x.setItems(bt_pref);	
		pref1_x.getSelectionModel().select(0);
		pref2_x.getSelectionModel().select(0);
		pref3_x.getSelectionModel().select(0);
	}
	
	private void populate_choice_t1()
	{
		category_x.setItems(FXCollections.observableArrayList(
			    "----","General", "SC", "ST", "OBC")
			);
		category_x.getSelectionModel().select(0);
		nation_x.setItems(FXCollections.observableArrayList(
			    "----", "India","Others")
			);
		nation_x.getSelectionModel().select(0);
		pref1_x.setItems(FXCollections.observableArrayList(
			    "----"));
		pref2_x.setItems(FXCollections.observableArrayList(
			    "----"));
		pref3_x.setItems(FXCollections.observableArrayList(
			    "----"));
		pref1_x.getSelectionModel().select(0);
		pref2_x.getSelectionModel().select(0);
		pref3_x.getSelectionModel().select(0);
	}
	
	private void populate_tab2_choices()
	{
		cgpa1d.setItems(FXCollections.observableArrayList(4,10));
		cgpa1d.getSelectionModel().select(0);
		cgpa2d.setItems(FXCollections.observableArrayList(4,10));
		cgpa2d.getSelectionModel().select(0);
		ece_pref1.setItems(FXCollections.observableArrayList("----","Advanced Signal Processing","Statistical Signal Processing","Digital VLSI Design",
				"Analog CMOS design","Digital Communications","Communication Networks","Linear systems","Introduction to Robotics",
				"RF Circuit design","Antennas and Propagation","Embedded Systems"));
		ece_pref1.getSelectionModel().select(0);
		ece_pref2.setItems(FXCollections.observableArrayList("----","Advanced Signal Processing","Statistical Signal Processing","Digital VLSI Design",
				"Analog CMOS design","Digital Communications","Communication Networks","Linear systems","Introduction to Robotics",
				"RF Circuit design","Antennas and Propagation","Embedded Systems"));
		ece_pref2.getSelectionModel().select(0);
		ece_pref3.setItems(FXCollections.observableArrayList("----","Advanced Signal Processing","Statistical Signal Processing","Digital VLSI Design",
				"Analog CMOS design","Digital Communications","Communication Networks","Linear systems","Introduction to Robotics",
				"RF Circuit design","Antennas and Propagation","Embedded Systems"));
		ece_pref3.getSelectionModel().select(0);
		ece_pref4.setItems(FXCollections.observableArrayList("----","Advanced Signal Processing","Statistical Signal Processing","Digital VLSI Design",
				"Analog CMOS design","Digital Communications","Communication Networks","Linear systems","Introduction to Robotics",
				"RF Circuit design","Antennas and Propagation","Embedded Systems"));
		ece_pref4.getSelectionModel().select(0);
	}
	
	@FXML
	public void initialize_() {	
		teb1.setDisable(true);
		teb2.setDisable(true);
		teb3.setDisable(true);
		teb4.setDisable(true);
		cse_pref=FXCollections.observableArrayList(
			    "----","Artificial Intelligence and Robotics - CSE","Biophysics - CB","Compilers - CSE","Computer Architecture and Systems Design - csE",
			    "Computer Graphics - CSE","Computer Vision - CSE","Image Analysis and Biometrics - CSE","Information Management and Data Engineering - CSE",
			    "Machine Learning - CSE","Massively Parallel Systems - CSE","Mobile Computing and Networking Applications - CSE",
			    "Program Analysis - CSE","Security and Privacy - CSE","Signal and Image Processing - CSE","Software Engineering - CSE",
			    "Theoretical Computer Science - CSE","Wireless Networks - CSE");
		ece_pref=FXCollections.observableArrayList(
			    "----","Computer Architecture and Systems Design - ECE","Controls and Robotics - ECE","Digital and Analog VLSI Systems Design - ECE",
			    "Electromagnetics - ECE","Embedded and VLSI systems design - ECE","Embedded Systems - ECE","Fiber-Wireless Architectures - ECE",
			    "Machine Learning - ECE","OFDM based Optical Access Networks - ECE","Optical Wireless Communication Systems - ECE",
			    "RF and mixed signal electronics - ECE","Signal and Image Processing - ECE","Wireless Communication - ECE",
			    "Wireless Networks - ECE");
		bt_pref=FXCollections.observableArrayList(
			    "----","Biophysics - CB","Structural Biology - CB","Systems Biology - CB");
			populate_choice_t1(); 
			populate_tab2_choices();
			populate_t1(); //Load Personal details from file    	
			populate_t2(); //Load Education details from file
	}
	
	@FXML
	void uploadCV()
	{
		
	}
	
	@FXML
	void uploadSOP()
	{
		
	}
}
