package simstation;

import mvc.Command;
import mvc.Model;

public class StopCommand extends Command {
    
    public StopCommand(Model m) { super(m); }
    
    public void execute()
    {
        Simulation sim = (Simluation)model; //Waiting on Simulation class
        sim.stop();                         //Will make stop command following the above
    }
}
