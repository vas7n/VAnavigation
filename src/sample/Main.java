package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    private static Navigation navigation;

    public static Navigation getNavigation()
    {
        return navigation;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        navigation = new Navigation(primaryStage);

        primaryStage.setTitle("VA navigation");
        primaryStage.show();

        //navigate to first view
        Main.getNavigation().load(View1.URL_FXML).Show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
