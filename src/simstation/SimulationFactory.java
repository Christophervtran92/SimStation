package simstation;

import mvc.AppFactory;
import mvc.Command;
import mvc.Model;

public class SimulationFactory implements AppFactory {
    @Override
    public Model makeModel() {
        return null;
    }

    @Override
    public String[] getEditCommands() {
        return new String[0];
    }

    @Override
    public Command makeEditCommand(Model model, String type) {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String[] getHelp() {
        return new String[0];
    }

    @Override
    public String about() {
        return null;
    }
}
