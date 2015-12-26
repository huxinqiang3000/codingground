package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class WaitForRequestState extends State
{
    public WaitForRequestState(Context Context)
    {
        super(Context);
    }
    public StateType GetState()
    {
        return StateType.WaitForRequest;
    }

    public int Execute(Object Request)
    {
        System.out.print("\r\n--- WaitForRequestState Execute --");
        return 1;
    }

    
}