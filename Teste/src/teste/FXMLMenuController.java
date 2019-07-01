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
import javafx.scene.control.Label;
import static teste.Teste.cesta;

/**
 *
 * @author Cliente
 */
public class FXMLMenuController implements Initializable {

    @FXML
    private Label logo;
    
    @FXML
    private Button bCatalogo;

    @FXML
    private Button bPesquisar;
    
    @FXML
    private Button bCesta;
    @FXML
    private Button bEntrega;
    
    @FXML
    protected void botaoCatalogo(ActionEvent event) {
        System.out.println("You clicked me!");
        Teste.trocaTela("catalogo");
    }
    
    @FXML
    protected void botaoPesquisar(ActionEvent event) {
        System.out.println("You clicked me!");
        Teste.trocaTela("pesquisa");
    }
    
    @FXML
    protected void botaoCesta(ActionEvent event) {
        System.out.println("You clicked me!");
        if (cesta.getItens().isEmpty()){
            Teste.trocaTela("cestaVazia");
        }else{
            Teste.trocaTela("cesta"); 
        }
    }
    
    @FXML
    protected void botaoEntrega(ActionEvent event) {
        System.out.println("You clicked me!");
        Teste.trocaTela("entrega");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
