package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class View2 extends BaseController implements Initializable {

    public static final String URL_FXML = "view2.fxml";


    @FXML
    public Button btnView1;

    @FXML
    public Button btnView3;

    @FXML
    public Button btnBack;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnView1.setOnAction(event -> {
            Main.getNavigation().Navigate(View1.URL_FXML);
        });

        btnView3.setOnAction(event -> {
            Main.getNavigation().Navigate(View3.URL_FXML);
        });

        btnBack.setOnAction(event -> {
            Main.getNavigation().GoBack();
        });
    }
}
