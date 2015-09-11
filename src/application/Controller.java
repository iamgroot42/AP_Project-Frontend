package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
	Main mane;
	int phdstream,gender,physical,war;
	
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
	
	private void save_P()
	{
		if(mane.getPersonal()==null)
		{
			String[] temp2=new String[3];
			temp2[0]=pref1_x.getValue();
			temp2[1]=pref2_x.getValue();
			temp2[2]=pref3_x.getValue();			
			Personal temp=new Personal(email_x.getText(),name_x.getText(),addc_x.getText(),mob_x.getText(),phdstream,temp2,gender,category_x.getValue(),physical,war,fname_x.getText(),nation_x.getValue(),addp_x.getText());
			mane.setPersonal(temp);
		}
		else
		{
			
		}
	}
	
	private void populate_t1()
	{
		if(mane.isT1_saved())
		{
			Personal temp=mane.getPersonal();
		}
		else
		{
			clear_t1();
		}
	}
	
	private void populate_choice_t1()
	{
		category_x.setItems(FXCollections.observableArrayList(
			    "","General", "SC", "ST", "OBC")
			);
		nation_x.setItems(FXCollections.observableArrayList(
			    "", "India","Others")
			);
	}
	
	@FXML
	public void initialize_() {	
        	t.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>()
			{	
        		@Override
				public void changed(ObservableValue<? extends Tab> tab, Tab oldTab, Tab newTab) {
					if(newTab==t1)
					{
						populate_choice_t1();
					}
					else if(newTab==t2)
					{
//						L2.setText("");
//						L3.setText("");
//						L4.setText("");
//						L5.setText("");
//						category.setText("");
//						amount.setText("");
//						date.setValue(null);
//						L6.setText("Total Budget: Rs."+mane.getBUD());
//						L7.setText("Available Budget: Rs."+mane.getAVL());
					}
					else if(newTab==t3)
					{
						//Table
//						L6.setText("Total Budget: Rs."+mane.getBUD());
//						L7.setText("Total Expense: Rs."+(mane.getBUD()-mane.getAVL()));
					}
					else if(newTab==t4)
					{	
						//Pie Chart
//						Charter();
					}
					else
					{
						
					}
			}});
//        	dump.setEditable(false);
//        	col1.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getCategory()));
//        	col2.setCellValueFactory(x -> new SimpleIntegerProperty(x.getValue().getAmount()).asObject());
//        	col3.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getDt()));
        	
	}
}
