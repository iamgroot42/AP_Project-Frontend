package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller
{
	@FXML private TabPane t;
    @FXML private Tab t1;
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
    @FXML private Tab t2;
    @FXML private Tab t3;
    @FXML private Tab t4;
    @FXML private Tab t5;
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
	
	public void clear_t1()
	{
		email_x.setText("");
		name_x.setText("");
		addc_x.setText("");
		mob_x.setText("");
		dob_x.setValue(null);
		fname_x.setText("");
		addp_x.setText("");
		pin_x.setText("");
		wary_x.setSelected(false);
		warn_x.setSelected(false);
		phyy_x.setSelected(false);
		phyn_x.setSelected(false);
		genderm_x.setSelected(false);
		genderf_x.setSelected(false);
		stream1_x.setSelected(false);
		stream2_x.setSelected(false);
		stream3_x.setSelected(false);
	}
	
	@FXML
	void stream1_x_f(ActionEvent event)
	{
		stream2_x.setSelected(false);
		stream3_x.setSelected(false);
		populate_cse_pref();
	}
	
	@FXML
	void stream2_x_f(ActionEvent event)
	{
		stream1_x.setSelected(false);
		stream3_x.setSelected(false);
		populate_ece_pref();
	}
	
	@FXML
	void stream3_x_f(ActionEvent event)
	{
		stream1_x.setSelected(false);
		stream2_x.setSelected(false);
		populate_bt_pref();
		
	}
	
	@FXML
	void genderf_x_f(ActionEvent event)
	{
		genderm_x.setSelected(false);
	}
	
	@FXML
	void genderm_x_f(ActionEvent event)
	{
		genderf_x.setSelected(false);
	}
	
	@FXML
	void phyn_x_f(ActionEvent event)
	{
		phyy_x.setSelected(false);
	}
	
	@FXML
	void phyy_x_f(ActionEvent event)
	{
		phyn_x.setSelected(false);
	}
	
	@FXML
	void wary_x_f(ActionEvent event)
	{
		warn_x.setSelected(false);
	}
	
	@FXML
	void warn_x_f(ActionEvent event)
	{
		wary_x.setSelected(false);
	}
	
	@FXML
    void handleb1(ActionEvent event) {
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
		if(name_x.getText().equals(""))
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
		if(fname_x.getText().equals(""))
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
		if(dob_x.getValue()==null)
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
//			save_P();
		}
    }
	
	private void save_P()
	{
		if(mane.getPersonal()==null)
		{			
			Personal temp=new Personal();
			mane.setPersonal(temp);
		}
		else
		{
			mane.getPersonal().setAdd_correspondence(addc_x.getText());
			mane.getPersonal().setAdd_permanent(addp_x.getText());
			mane.getPersonal().setCategory(category_x.getValue());
//			mane.getPersonal().setDate_of_birth(dob_x.getValue());
			mane.getPersonal().setEmail(email_x.getText());
			mane.getPersonal().setFather_name(fname_x.getText());
			mane.getPersonal().setGender(this.gender);
			mane.getPersonal().setMobile(mob_x.getText());
			mane.getPersonal().setName(name_x.getText());
			mane.getPersonal().setNationality(nation_x.getValue());
			mane.getPersonal().setPhd_stream(this.phdstream);
			mane.getPersonal().setPhysically_disabled(this.physical);
			mane.getPersonal().setPincode(pin_x.getText());
			String[] temp=new String[3];
			temp[0]=pref1_x.getValue();
			temp[1]=pref2_x.getValue();
			temp[2]=pref3_x.getValue();
			mane.getPersonal().setPreference(temp);
			mane.getPersonal().setWar_category(this.war);	
		}
	}
	
	private void populate_t1()
	{
		if(true) //Check if file contains data
		{
			Personal temp=mane.getPersonal();
			email_x.setText(temp.getEmail());
			name_x.setText(temp.getName());
			addc_x.setText(temp.getAdd_correspondence());
			mob_x.setText(temp.getMobile());
			pref1_x.setValue(temp.getPreference()[0]);
			pref2_x.setValue(temp.getPreference()[1]);
			pref3_x.setValue(temp.getPreference()[2]);
			category_x.setValue(temp.getCategory());
//			dob_x.setValue(temp.getDate_of_birth());
			fname_x.setText(temp.getFather_name());
			addp_x.setText(temp.getAdd_permanent());
			pin_x.setText(temp.getPincode());
			if(this.war)
			{
				wary_x.setSelected(true);
				warn_x.setSelected(false);
			}
			else
			{
				wary_x.setSelected(false);
				warn_x.setSelected(true);
			}
			if(this.physical)
			{
				phyy_x.setSelected(true);
				phyn_x.setSelected(false);
			}
			else
			{
				phyy_x.setSelected(false);
				phyn_x.setSelected(true);
			}
			if(this.gender) //Sexism
			{
				genderf_x.setSelected(true); 
				genderm_x.setSelected(false);
			}
			else
			{
				genderf_x.setSelected(false); 
				genderm_x.setSelected(true);
			}
			if(this.phdstream==1)
			{
				stream1_x.setSelected(true);
				stream2_x.setSelected(false);
				stream3_x.setSelected(false);
			}
			else if(this.phdstream==2)
			{
				stream1_x.setSelected(false);
				stream2_x.setSelected(true);
				stream3_x.setSelected(false);
			}
			else if(this.phdstream==3)
			{
				stream1_x.setSelected(false);
				stream2_x.setSelected(false);
				stream3_x.setSelected(true);
			}
		}
		else
		{
			clear_t1();
		}
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
	
	@FXML
	public void initialize_() {	
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
        	t.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>()
			{	
        		@Override
				public void changed(ObservableValue<? extends Tab> tab, Tab oldTab, Tab newTab) {
					if(newTab==t1)
					{
//						populate_t1();
//						clear_t1();
					}
					else if(newTab==t2)
					{
					}
					else if(newTab==t3)
					{
					}
					else if(newTab==t4)
					{	
					}
					else
					{
						
					}
			}});
        	
	}
}
