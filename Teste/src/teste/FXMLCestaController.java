/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.cesta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Hannah
 */
public class FXMLCestaController implements Initializable {

    @FXML
    private ImageView ItemCesta1;
    @FXML
    private ImageView ItemCesta2;
    @FXML
    private ImageView ItemCesta3;
    private ImageView ItemCesta4;
    @FXML
    private Label nome1;
    @FXML
    private Label autor1;
    @FXML
    private Label estoque1;
    @FXML
    private Label nome2;
    @FXML
    private Label autor2;
    @FXML
    private Label estoque2;
    @FXML
    private Label nome3;
    @FXML
    private Label autor3;
    @FXML
    private Label estoque3;
    @FXML
    private Label preco1;
    @FXML
    private Label preco2;
    @FXML
    private Label preco3;
    @FXML
    private ComboBox<?> qtd1;
    @FXML
    private ComboBox<?> qtd2;
    @FXML
    private ComboBox<?> qtd3;
    @FXML
    private Button menu;
    @FXML
    private Button delivery;
    @FXML
    private Button ant;
    @FXML
    private Button prox;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //if (cesta.getItens().isEmpty()){
            
        //}
        
        Image item1 = new Image("produto1.jpg");
        ItemCesta1.setImage(item1);
        
        Image item2 = new Image("produto2.jpg");
        ItemCesta2.setImage(item2);
        
        Image item3 = new Image("produto3.jpg");
        ItemCesta3.setImage(item3);
        
    }    
    
}
