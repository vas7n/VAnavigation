package sample;

import javafx.scene.Node;

/**
 * Created by Vladimir on 10.09.2015.
 */
public class BaseController implements Controller {

    private Node view;

    @Override
    public Node getView() {
        return view;
    }

    @Override
    public void setView (Node view){
        this.view = view;
    }
}
