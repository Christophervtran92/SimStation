package simstation;

import mvc.AppFactory;
import mvc.Command;
import mvc.Model;

public class SimulationFactory implements AppFactory{

    public Model makeModel() { return new Simulation(); }   //Waiting on simulation class

    public String[] getEditCommands() {
        return new String[]{"Start", "Suspend", "Resume", "Stop", "Stats"};
    }

    //Creating the commands; waiting on the Command classes
    public Command makeEditCommand(Model model, String type) {
        if(type == "Start")
            return new StartCommand(model);
        else if(type == "Suspend")
            return new SuspendCommand(model);
        else if(type == "Resume")
            return new ResumeCommand(model);
        else if(type == "Stop")
            return new StopCommand(model);
        else if(type == "Stats")
            return new StatsCommand(model);
        return null;
    }

    //Title of the window
    public String getTitle() { return "Simstation"; }   //Perhaps this should be overwritten for each sim

    public String[] getHelp() {
        return new String[] {"Simstation for multiple simualtions."};   //Overwritten for each sim
    }

    public String about() { return "SimStation\n by Haruna Yamakawa, Christopher Tran, and Gabriel Tenocelotl"; }
}



