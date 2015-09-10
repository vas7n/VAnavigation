package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir on 10.09.2015.
 */
public class Navigation {

    private final Stage stage;
    private final Scene scene;

    private List<Controller> controllers = new ArrayList<>();


    public Navigation(Stage stage)
    {
        this.stage = stage;
        scene = new Scene(new Pane());
        stage.setScene(scene);
    }

    public Controller Navigate(String sUrl)
    {
        try {

            //loads the fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sUrl));
            Node root = fxmlLoader.load();

            Controller controller = fxmlLoader.getController();
            controller.setView(root);

            scene.setRoot((Parent) root);
            controllers.add(controller);

            System.out.println("Add to history: " + sUrl + ". Total scenes: " + controllers.size());

            return controller;

        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void GoBack()
    {
        if (controllers.size() > 1)
        {
            controllers.remove(controllers.get(controllers.size() - 1));
            scene.setRoot((Parent) controllers.get(controllers.size() - 1).getView());
        }

        System.out.println("GoBack: " + controllers.get(controllers.size() - 1).toString() + ". Total scenes: " + controllers.size());
    }


    public void ClearHistory()
    {
        while (controllers.size() > 1)
            controllers.remove(0);

        System.out.println("ClearHistory. Total scenes: " + controllers.size());
    }
}
