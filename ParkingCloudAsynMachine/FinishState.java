
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

    public int Finish()
    {
        return 0;
    }

    
}