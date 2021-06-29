import controller.SlotController;
import model.SlotModel;
import view.SlotView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SlotView view = new SlotView();
        SlotModel model = new SlotModel();
        SlotController controller = new SlotController(model, view);

        controller.init();
    }

}
