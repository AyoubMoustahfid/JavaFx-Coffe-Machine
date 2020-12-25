package application;

import java.util.ArrayList;

import application.coffemachine.controllers.TechnicianController;
import application.coffemachine.models.Technician;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController {
	@FXML
	private Button addBtn;
	
	@FXML
	private TextField idInput;
	
	@FXML
	private TextField nameInput;
	
	@FXML
	private TextField phoneInput;
	
	@FXML
	private TextField idRefInput;
	
	@FXML
	private TextField accessCodeInput;
	
	
	// ++++++++++++ CONNANT +++++++++++++++++=
	// ----------- INSERT ALL TABLE COLUMN ----------------
	
	@FXML
	private TableView<Technician> table;
	
	@FXML 
	private TableColumn<Technician, Integer> idTechnicien;
	int id = Integer.parseInt(idTechnicien.getText());
	
	
	@FXML
	private TableColumn<Technician, String> nameColumn;
	
	@FXML 
	private TableColumn<Technician, String> phoneColumn;
	
	@FXML
	private TableColumn<Technician, String> idRefColumn;
	
	@FXML
	private TableColumn<Technician, String> accessCodeColumn;
	

    
    @FXML
    public void AddTechnician() throws Exception {
    	
    	ArrayList<Technician> technicians = new ArrayList<Technician>();
    	
    	long id = Long.parseLong(idInput.getText());
    	String nameTech = nameInput.getText();
    	String phoneTech = phoneInput.getText();
    	String idRefTech = idRefInput.getText();
    	String accessCodeTech = accessCodeInput.getText();
    	
    	idTechnicien.setCellValueFactory(new PropertyValueFactory<>("id"));
    	nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
    	idRefColumn.setCellValueFactory(new PropertyValueFactory<>("idRef"));
    	accessCodeColumn.setCellValueFactory(new PropertyValueFactory<>("accessCode"));
    	
    	
    	Technician technician = new Technician(id, nameTech, phoneTech, idRefTech, accessCodeTech);
    	TechnicianController technicianController = new TechnicianController();
    	
    	technicianController.AddTechnician(technicians, technician);
       
    }

}
 