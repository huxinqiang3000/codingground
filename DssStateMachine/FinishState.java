package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class FinishState extends State
{
    public FinishState(Context Context)
    {
        super(Context);
    }
    public StateType GetState()
    {
        return StateType.Finish;
    }

    public int Execute(Object Request)
    {
        Context Context = GetContext();
        
        System.out.print("\r\n--- FinishState Execute --");
        
        return 0;
    }

    
}