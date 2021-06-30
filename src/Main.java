import com.fasterxml.jackson.databind.ObjectMapper;
import controller.SlotController;
import language.Language;
import model.SlotModel;
import view.SlotView;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SlotView view = new SlotView();
        SlotModel model = new SlotModel();
        SlotController controller = new SlotController(model, view);
        controller.init();


    }

}
