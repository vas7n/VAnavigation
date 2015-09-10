package sample;

import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * Created by Vladimir on 29.08.2015.
 */
public interface Controller {
    Node getView();
    void setView(Node view);
/*
    Stage getStage();
    void setStage(Stage stage);

    void Show();
    void Show(Controller owner);
    void ShowAndWait();
    void ShowAndWait(Controller owner);

    void Close();
*/
}
