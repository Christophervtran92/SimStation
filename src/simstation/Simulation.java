package simstation;

import java.util.*;
import mvc.*;

public class Simulation extends Model {

    private Timer timer;
    private int clock;

    private void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ClockUpdater(), 1000, 1000);
    }

    private void stopTimer() {
        timer.cancel();
        timer.purge();
    }

    private class ClockUpdater extends TimerTask {
        public void run() {
            clock++;
            //changed();
        }
    }

    // etc.
    //Based on the information from the assignment, it says that the start() just calls the start function
    //from the agent, this is under the assumption that there is an array list of agents within Simulation
    public void start()
    {
        for(Agent a : agentList)
            a.start();
    }
    
    //Same as above.
    public void stop()
    {
        for(Agent a : agentList)
            a.stop();
    }


}
