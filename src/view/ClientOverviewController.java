package view;

import controller.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Adresse;
import model.Client;

//import util.DateUtil;


public class ClientOverviewController {
	
	private MainApp mainApp;

	public void setMainApp(MainApp mainApp) {
	    this.mainApp = mainApp;
	 // Add observable list data to the table
	    clientTable.setItems(mainApp.getClientData());
	}
	 
	Adresse adresse = new Adresse();

	@FXML
	private Button bAjouter;
	@FXML
	private Button bModifier;
	@FXML
	private Button bSupprimer;
	@FXML
	private MenuItem fClient;
	@FXML
	private MenuItem fRepresentant;
	@FXML
	private MenuItem fProspect;

	@FXML
	private MenuItem aClient;
	@FXML
	private MenuItem aRepresentant;
	@FXML
	private MenuItem aProspect;
	@FXML
	private MenuItem mClient;
	@FXML
	private MenuItem mRepresentant;
	@FXML
	private MenuItem mProspect;
	
	@FXML
    private MenuItem fSave;
    @FXML
    private MenuItem fSaveAs;
    @FXML
    private MenuItem fOpen;
	
	@FXML
	private TextField tfEnseigne;
	@FXML
	private TextField tfSiret;
	@FXML
	private TextField tfNum;
	@FXML
	private TextField tfVoie;
	@FXML
	private TextField tfLibelle;
	@FXML
	private TextField tfComplement;
	@FXML
	private TextField tfBoite;
	@FXML
	private TextField tfCP;
	@FXML
	private TextField tfVille;
	@FXML
	private TextField tfPays;
	@FXML
	private TextField tfCivilite;
	@FXML
	private TextField tfNom;
	@FXML
	private TextField tfPrenom;
	@FXML
	private TextField tfFonction;
	@FXML
	private TextField tfTel;
	@FXML
	private TextField tfMail;
	@FXML
	private TextField tfIdClient;
	@FXML
	private TextField tfIdRepresentant;
	@FXML
	private TextField tfCommande;
	
	@FXML
	private TableView<Client> clientTable;
	@FXML
	private TableColumn<Client, Integer> tcId;
	@FXML
	private TableColumn<Client, String> tcEnseigne;
	@FXML
	private TableColumn<Client, String> tcNom;
	@FXML
	private TableColumn<Client, String> tcPrenom;
	@FXML
	private TableColumn<Client, String> tcTel;
	@FXML
	private TableColumn<Client, String> tcMail;
	@FXML
	private TableColumn<Client, Integer> tcNbCom;
	
	
	
	

	@FXML
	private void handleclient(){
		mainApp.showClientOverview();
	}
	@FXML
	private void handlerepresentant(){
		mainApp.showrepresentantOverview();
	}
	@FXML
	private void handleprospect(){
		mainApp.showprospectOverview();
	}
	
	@FXML
	private void formulairerepresentant(){
		mainApp.showFormulaireRepresentant();
	}
	@FXML
	private void formulaireprospect(){
		mainApp.showFormulaireProspect();
	}
	@FXML
	private void formulaireclient(){
		mainApp.showFormulaireClient(null);
				
		
	}
	

	
/**
 * Fills all text fields to show details about the person.
 * If the specified person is null, all text fields are cleared.
 *
 * @param person the person or null
 */
private void showClientDetails(Client client) {
    if (client != null) {
        // Fill the labels with info from the person object.
    	
    	tfEnseigne.setText(client.getEnseigne());
        tfSiret.setText(client.getSiret());
        tfCivilite.setText(client.getCivilite());
        tfPrenom.setText(client.getPrenom());
        tfNom.setText(client.getNom());
        tfFonction.setText(client.getFonction());
        tfTel.setText(client.getTel());
        tfMail.setText(client.getEmail());
        tfCommande.setText(client.getNbCommande().toString());
        
        tfIdClient.setText(client.getIdentifiantC().toString());
        
        tfPays.setText(client.getAdresse().getPays());
        tfNum.setText(client.getAdresse().getNum().toString());
    	tfVoie.setText(client.getAdresse().getVoie());
    	tfLibelle.setText(client.getAdresse().getNomVoie());
    	tfComplement.setText(client.getAdresse().getComplement());
    	tfBoite.setText(client.getAdresse().getBp().toString());
        tfCP.setText(client.getAdresse().getCp().toString());
        tfVille.setText(client.getAdresse().getVille());
        
        
    	
        //tfIdRepresentant.setText(client.getRepresentant().getIdentifiantR().toString());

      
            
       
    } else {
        // Client is null, remove all the text.
    	
    	tfEnseigne.setText("");
        tfSiret.setText("");
    	
    	tfNum.setText("");
    	tfVoie.setText("");
    	tfLibelle.setText("");
    	tfComplement.setText("");
    	tfBoite.setText("");
        tfCP.setText("");
        tfVille.setText("");
        tfPays.setText("");

        tfCivilite.setText("");
        tfPrenom.setText("");
        tfNom.setText("");
        tfFonction.setText("");
        tfTel.setText("");
        tfMail.setText("");
        tfCommande.setText("");
        
        tfIdClient.setText("");
        //tfIdRepresentant.setText("");
    }
}

/**
 * The constructor.
 * The constructor is called before the initialize() method.
 * @return 
 */
public ClientOverviewController() {
}

/**
 * Initializes the controller class. This method is automatically called
 * after the fxml file has been loaded.
 */


@FXML
private void initialize() {
    // Initialize the client table with the columns.
    tcPrenom.setCellValueFactory(cellData -> (cellData.getValue()).prenomProperty());
    tcNom.setCellValueFactory(cellData -> (cellData.getValue()).nomProperty());
    tcId.setCellValueFactory(cellData -> (cellData.getValue()).identifiantCProperty().asObject());
    tcTel.setCellValueFactory(cellData -> (cellData.getValue()).telProperty());
    tcMail.setCellValueFactory(cellData -> (cellData.getValue()).emailProperty());
    tcNbCom.setCellValueFactory(cellData -> (cellData.getValue()).nbCommandeProperty().asObject());
    tcEnseigne.setCellValueFactory(cellData -> (cellData.getValue()).enseigneProperty());
    
    
 // Clear person details.
    showClientDetails(null);
 // Listen for selection changes and show the client details when changed.
    clientTable.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> showClientDetails(newValue));
    
    
    
}
/**
 * Called when the user clicks on the delete button.
 */
@FXML
private void handleDeleteClient() {
    int selectedIndex = clientTable.getSelectionModel().getSelectedIndex();
    if (selectedIndex >= 0) {
        clientTable.getItems().remove(selectedIndex);
    } else {
        // Nothing selected.
        Alert alert = new Alert(AlertType.WARNING);
        alert.initOwner(mainApp.getPrimaryStage());
        alert.setTitle("No Selection");
        alert.setHeaderText("No client Selected");
        alert.setContentText("Please select a client in the table.");

        alert.showAndWait();
    }

}

@FXML
private void handleEditClient() {
    Client selectedClient = clientTable.getSelectionModel().getSelectedItem();
    if (selectedClient != null) {
        mainApp.showFormulaireClient(selectedClient);
        showClientDetails(selectedClient);
        }

    	else {
        // Nothing selected.
        Alert alert = new Alert(AlertType.WARNING);
        alert.initOwner(mainApp.getPrimaryStage());
        alert.setTitle("No Selection");
        alert.setHeaderText("No CLient Selected");
        alert.setContentText("Please select a client in the table.");

        alert.showAndWait();
    }
}
/**
 * Called when the user clicks the new button. Opens a dialog to edit
 * details for a new person.
 */
@FXML
private void handleNewClient() {
    Client tempClient = new Client();
    boolean okClicked = mainApp.showFormulaireClient(tempClient);
    
    if (okClicked) {
    	
        mainApp.getClientData().add(tempClient);
    }
}


}




