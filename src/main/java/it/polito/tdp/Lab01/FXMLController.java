package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;
import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco = new Parole();

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private URL location;

    @FXML
    private Button btnCancella;
    
    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempi;

    @FXML
    void doInsert(ActionEvent event) {
    	txtResult.clear();
    	txtTempi.clear();
    	String p = txtParola.getText();
    	elenco.addParola(p);
    	for (int i=0;i<elenco.getElenco().size();i++) {
    		txtResult.appendText(elenco.getElenco().get(i)+"\n");
    		txtTempi.appendText(""+System.nanoTime()+"\n");
    	}
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    }

    @FXML
    void doCancella(ActionEvent event) {
    	String p = txtParola.getText();
    	elenco.cancella(p);
    	txtResult.clear();
    	for (int i=0;i<elenco.getElenco().size();i++) {
    		txtResult.appendText(elenco.getElenco().get(i)+"\n");
    	}
    	txtParola.clear();
    }
    
    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
