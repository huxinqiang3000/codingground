package ParkingCloud.Device.ConfigStateSyn.StateMachine;

import java.util.*;

public class StateMachine extends State
{
    
    private State CurrentState = null;
    
    
    public StateMachine()
    {
        
    }

    public abstract StateType GetState();

    public int DoReqeust(String DeviceIndex, String EntityUrl, java.util.Map<String, String> EntityProperty)
    {
        return 1;
    }
    
    public int DoResponse(Object Message)
    {
        return 1;
    }
    
    public int DoStop()
    {
        return 0;
    }
}