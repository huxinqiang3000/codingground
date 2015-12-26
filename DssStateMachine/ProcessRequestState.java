package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class ProcessingRequestState extends State
{
    public ProcessingRequestState(Context Context)
    {
        super(Context);
    }
    public StateType GetState()
    {
        return StateType.ProcessingRequest;
    }

    public int Execute(Object Request)
    {
        System.out.print("\r\n--- ProcessingRequestState Execute --");
        return 1;
    }

    
}