import java.util.*;

public abstract class State
{
    private Context Context = null;
    
    public State(Context Context)
    {
        this.Context = Context;
    }
    
    public Context GetContext()
    {
        return this.Context;
    }
    public abstract StateType GetState();

    public int AcceptRequest(Map<String, Object> Request)
    {
        return 1;
    }

    public int ProcessRequest(Map<String, Object> Request)
    {
        return 1;
    }  
    
    public int AccessResponse(Map<String, Object> Response)
    {
        return 1;
    }  
    
    public int ProcessResponse(Map<String, Object> Response)
    {
        return 1;
    }
    
    public int Finish()
    {
        return 1;
    }
    
}