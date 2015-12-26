package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class ProcessResponseState extends State
{
    public ProcessResponseState(Context Context)
    {
        super(Context);
    }
    public StateType GetState()
    {
        return StateType.ProcessResponse;
    }

    public int Execute(Object Request)
    {
        System.out.print("\r\n--- ProcessResponseState Execute --");
        return 1;
    }

    
}