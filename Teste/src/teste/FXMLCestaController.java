/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static teste.Teste.cesta;

/**
 * FXML Controller class
 *
 * @author Hannah
 */
public class FXMLCestaController implements Initializable {
    
    CestaCompras ces;
    
    @FXML
    private ImageView ItemCesta1;
    @FXML
    private ImageView ItemCesta2;
    @FXML
    private ImageView ItemCesta3;
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
    private Button ant;
    @FXML
    private Button prox;
    @FXML
    private Label pag;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        Image item1 = new Image("produto1.jpg");
        ItemCesta1.setImage(item1);
        
        Image item2 = new Image("produto2.jpg");
        ItemCesta2.setImage(item2);
        
        Image item3 = new Image("produto3.jpg");
        ItemCesta3.setImage(item3);
        
    }    

    @FXML
    protected void aoMenuC(ActionEvent event) {
        System.out.println("You clicked me!");
        Teste.trocaTela("menu");
    }

    @FXML
    protected void pagAnt(ActionEvent event) {
    
    }

    @FXML
    protected void pagProx(ActionEvent event) {
    
    }
    
    
    @FXML
    private void realizarCompra(ActionEvent event) {
    
    }

    
    
}
