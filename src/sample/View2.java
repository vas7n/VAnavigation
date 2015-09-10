package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    @FXML
    public TextField txtParameter;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnView1.setOnAction(event -> {
            Main.getNavigation().load(View1.URL_FXML).Show();
        });

        btnView3.setOnAction(event -> {
            View3 view3 = (View3)Main.getNavigation().load(View3.URL_FXML);
            view3.setParameterFromView2(txtParameter.getText());
            view3.Show();
        });

        btnBack.setOnAction(event -> {
            Main.getNavigation().GoBack();
        });
    }
}
