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
    
    static Catalogo ctlg;
    static CestaCompras cesta;
    
    private static Stage stage;
    
    private static Scene sMenu;
    private static Scene sCatalogo;
    private static Scene sPesquisa;
    private static Scene sCesta;
    private static Scene sCestaVazia;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Parent fxmlCatalogo = FXMLLoader.load(getClass().getResource("FXMLCatalogo.fxml"));
        Parent fxmlPesquisa = FXMLLoader.load(getClass().getResource("FXMLPesquisa.fxml"));
        Parent fxmlCesta = FXMLLoader.load(getClass().getResource("FXMLCesta.fxml"));
        Parent fxmlCestaVazia = FXMLLoader.load(getClass().getResource("FXMLCestaVazia.fxml"));
        
        sMenu = new Scene(fxmlMenu);
        sCatalogo = new Scene(fxmlCatalogo);
        sPesquisa = new Scene(fxmlPesquisa);
        sCesta = new Scene(fxmlCesta);
        sCestaVazia = new Scene(fxmlCestaVazia);
        
        primaryStage.setScene(sMenu);
        stage.setWidth(900);
        stage.setHeight(650);
        stage.setResizable(false);
        stage.setTitle("Tribal HQs");
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
            case "cesta":
                stage.setScene(sCesta);
                break;
            case "cestaVazia":
                stage.setScene(sCestaVazia);
                break;
        }
    }
    
    // RECEBE O ID DO PRODUTO
    public static void addCarrinho(int id){
        cesta.add(new ItemCesta(ctlg.ctlg.get(id), 1), ctlg.ctlg.get(id));
        System.out.println("Adicionado: " +id);
    }

    public static void main(String[] args){
        launch(args);  
    } 
}
