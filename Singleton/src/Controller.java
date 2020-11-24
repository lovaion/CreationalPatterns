import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Label scrittaNumero;
    public Button singletonButton;
    public Label singletonView;
    public Label numberToShow;
    public Button addNum;

    public MySingleton singleton = null;
    public void generateSingleton(ActionEvent actionEvent) {
            singleton = MySingleton.getInstance();
            singletonView.setVisible(true);
            addNum.setVisible(true);
            numberToShow.setVisible(true);
            numberToShow.setText("0");
            scrittaNumero.setVisible(true);

    }

    public void plusNumber(ActionEvent actionEvent) {
        singleton.plusNum();
        numberToShow.setText(String.valueOf(singleton.getNum()));
    }

    public void initialize(){
        addNum.setVisible(false);
        numberToShow.setVisible(false);
        scrittaNumero.setVisible(false);
    }
}
