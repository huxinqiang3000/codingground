package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public abstract class State
{
    private Context Context = null;
    
    public State(Context Context)
    {
        this.Context = Context;
    }
    
    public abstract StateType GetState();

    public int Execute(Object Request)
    {
        return 1;
    }

    public int DoStop()
    {
        return 0;
    }
    
}