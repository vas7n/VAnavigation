package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class View3 extends BaseController implements Initializable {

    public static final String URL_FXML = "view3.fxml";


    @FXML
    public Button btnView1;

    @FXML
    public Button btnView2;

    @FXML
    public Button btnBack;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnView1.setOnAction(event -> {
            Main.getNavigation().Navigate(View1.URL_FXML);
        });

        btnView2.setOnAction(event -> {
            Main.getNavigation().Navigate(View2.URL_FXML);
        });

        btnBack.setOnAction(event -> {
            Main.getNavigation().GoBack();
        });
    }
}
