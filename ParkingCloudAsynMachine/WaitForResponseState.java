
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
   
    public int AcceptResponse(Map<String, Object> Response)
    {
        int Result = 0;
        
        Result = GetContext().Machine.GotoState(StateType.ProcessResponse);
        if (0 != Result)
        {
            return Result;
        }
        
        return GetContext().Machine.ProcessResponse(Response);
    }
   
   
}