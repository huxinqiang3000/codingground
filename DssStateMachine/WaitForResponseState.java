package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class WaitForResponseState extends State
{
    public WaitForResponseState(Context Context)
    {
        super(Context);
    }
    public StateType GetState()
    {
        return StateType.WaitForResponse;
    }

    public int Execute(Object Request)
    {
        System.out.print("\r\n--- WaitForResponseState Execute --");
        return 1;
    }

    
}