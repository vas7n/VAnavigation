package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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

    @FXML
    public Label lblParameter;


    private String parameterFromView2;

    public String getParameterFromView2() {
        return parameterFromView2;
    }

    public void setParameterFromView2(String parameterFromView2) {
        this.parameterFromView2 = parameterFromView2;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnView1.setOnAction(event -> {
            Main.getNavigation().load(View1.URL_FXML).Show();
        });

        btnView2.setOnAction(event -> {
            Main.getNavigation().load(View2.URL_FXML).Show();
        });

        btnBack.setOnAction(event -> {
            Main.getNavigation().GoBack();
        });
    }



    @Override
    public void PreShowing() {
        super.PreShowing();

        lblParameter.setText(getParameterFromView2());
    }
}
