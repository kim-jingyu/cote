package theory.main;

import theory.framework.Controller;
import theory.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c = new FirstController();
        c.execute();
    }
}
