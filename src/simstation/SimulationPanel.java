package simstation;

import mvc.AppFactory;
import mvc.AppPanel;

public class SimulationPanel extends AppPanel{


    public SimulationPanel(AppFactory factory) {
        super(factory);
    }

    public static void main(String[] args) {
        AppPanel panel = new SimulationPanel(new SimulationFactory());
        panel.display();
    }
}
