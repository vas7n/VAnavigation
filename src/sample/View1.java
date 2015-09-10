package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class View1 extends BaseController implements Initializable {

    public static final String URL_FXML = "view1.fxml";


    @FXML
    public Button btnView2;

    @FXML
    public Button btnView3;

    @FXML
    public Button btnBack;

    @FXML
    public Button btnClear;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnView2.setOnAction(event -> {
            Main.getNavigation().load(View2.URL_FXML).Show();
        });

        btnView3.setOnAction(event -> {
            Main.getNavigation().load(View3.URL_FXML).Show();
        });

        btnBack.setOnAction(event -> {
            Main.getNavigation().GoBack();
        });

        btnClear.setOnAction(event -> {
            Main.getNavigation().ClearHistory();
        });
    }
}
