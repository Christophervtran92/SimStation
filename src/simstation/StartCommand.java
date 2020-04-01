package simstation;

import mvc.Command;
import mvc.Model;

public class StartCommand extends Command{

    public StartCommand(Model m) {super(m); }

    public void execute()
    {
        Simulation sim = (Simulation)model; //Waiting on Simulation class
        sim.start();                        //Will make start command following the above
    }
}

