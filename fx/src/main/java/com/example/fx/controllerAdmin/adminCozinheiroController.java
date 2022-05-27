package com.example.fx.controllerAdmin;

import com.bd.BLL.UsersBLL;
import com.bd.DAL.Users;
import com.example.fx.loginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

public class adminCozinheiroController implements Initializable {

    ObservableList<Users> listaUser = FXCollections.observableArrayList(UsersBLL.readAllCozAtivo(true,true));

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnNew;

    @FXML
    private Button btnAtualizarCoz;

    @FXML
    private Button btnListElimCoz;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemover;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<Users, String> email;

    @FXML
    private TableColumn<Users, String> username;

    @FXML
    private TableColumn<Users, String> password;

    @FXML
    private TableView<Users> tblCozinheiro;

    @FXML
    void handleBtnEditar(ActionEvent event) {

    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnNew(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/cozinheiroRegistoAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 668 , 407);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }

    @FXML
    void handleBtnPesquisar(ActionEvent event) {

    }

    @FXML
    void handleBtnRemover(ActionEvent event) {
        Users users = tblCozinheiro.getSelectionModel().getSelectedItem();
        tblCozinheiro.getItems();
        BigInteger id = users.getIdUser();
        users.setEstado(false);
        UsersBLL.update(users);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cozinheiro");
        alert.setHeaderText("Cozinheiro removido com sucesso");
        alert.setContentText("Atualize a página");
        alert.show();
    }



    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/paginaprincipaladmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @FXML
    void handlebtnListElimCoz(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/adminEliminadoCozinheiro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }


    @FXML
    void handleBtnAtualizarCoz(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/cozinheiroAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //UsersBLL users = new UsersBLL();
        username.setCellValueFactory(new PropertyValueFactory<Users,String>("nomeuser"));
        email.setCellValueFactory(new PropertyValueFactory<Users,String>("email"));
        password.setCellValueFactory(new PropertyValueFactory<Users,String>("password"));
        tblCozinheiro.setItems(listaUser);
    }
    
}
