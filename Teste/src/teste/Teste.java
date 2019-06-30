/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Cliente
 */
public class Teste extends Application {
    
    Catalogo ctlg;
    
    private static Stage stage;
    
    private static Scene sMenu;
    private static Scene sCatalogo;
    private static Scene sPesquisa;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Parent fxmlCatalogo = FXMLLoader.load(getClass().getResource("FXMLCatalogo.fxml"));
        Parent fxmlPesquisa = FXMLLoader.load(getClass().getResource("FXMLPesquisa.fxml"));
        
        sMenu = new Scene(fxmlMenu);
        sCatalogo = new Scene(fxmlCatalogo);
        sPesquisa = new Scene(fxmlPesquisa);
        
        primaryStage.setScene(sMenu);
        primaryStage.show();      
    }
    
    public static void trocaTela(String s){
        switch(s){
            case "menu":
                stage.setScene(sMenu);
                break;
            case "catalogo":
                stage.setScene(sCatalogo);
                break;
            case "pesquisa":
                stage.setScene(sPesquisa);
                break;
        }
    }
    
    // RECEBE O ID DO PRODUTO
    public static void addCarrinho(int id){
        System.out.println("Adicionado: " +id);
    }

    public static void main(String[] args){
        launch(args);  
    } 
}
