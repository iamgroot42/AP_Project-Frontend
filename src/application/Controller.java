package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
	@FXML private TextField email_x; 
	@FXML private TextField name_x; 
	@FXML private TextField mob_x; 
	@FXML private TextField fname_x;
	@FXML private TextField pin_x;
	@FXML private TextArea addc_x;
	@FXML private TextArea addp_x;
	@FXML private RadioButton stream1_x;
	@FXML private RadioButton stream2_x;
	@FXML private RadioButton stream3_x;
	@FXML private RadioButton genderm_x;
	@FXML private RadioButton genderf_x;
	@FXML private RadioButton phyy_x;
	@FXML private RadioButton phyn_x;
	@FXML private RadioButton wary_x;
	@FXML private RadioButton warn_x;
	@FXML private ChoiceBox<String> pref1_x;
	@FXML private ChoiceBox<String> pref2_x;
	@FXML private ChoiceBox<String> pref3_x;
	@FXML private ChoiceBox<String> category_x;
	@FXML private ChoiceBox<String> nation_x;
	@FXML private DatePicker dob_x;
	@FXML private TabPane t;
	@FXML private Tab t1;
	@FXML private Tab t2;
	@FXML private Tab t3;
	@FXML private Tab t4;
	@FXML private Tab t5;
	Main mane;
	
	public void setMainApp(Main p)
	{
		this.mane=p;
	}
	
	@FXML
	public void initialize_() {	
        	t.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>()
			{	
        		@Override
				public void changed(ObservableValue<? extends Tab> tab, Tab oldTab, Tab newTab) {
					if(newTab==t1)
					{
//						L1.setText("");
//						budget.setText("");
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
					else
					{	
						//Pie Chart
//						Charter();
					}
			}});
//        	dump.setEditable(false);
//        	col1.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getCategory()));
//        	col2.setCellValueFactory(x -> new SimpleIntegerProperty(x.getValue().getAmount()).asObject());
//        	col3.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getDt()));
        	
	}
}
