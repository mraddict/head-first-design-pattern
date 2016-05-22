
public class GumballMachine
{
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine( int numGumballs )
	{
		soldOutState = new SoldOutState( this );
		noQuarterState = new NoQuarterState( this );
		hasQuarterState = new HasQuarterState( this );
		soldState = new SoldState( this );
		winnerState = new WinnerState( this );
		
		this.count = numGumballs;
		
		if ( numGumballs > 0 )
		{
			state = noQuarterState;
		}
	}
	
	public void insertQuarter()
	{
		state.insertQuater();
	}
	
	public void ejectQuarter()
	{
		state.ejectQuater();
	}

	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}
	
	public void refill( int count )
	{
		this.count += count;
		System.out.println( "The gumball machine was just refilled; it's new count is %d" );
		
		state.refill();
	}
	
	public void setState( State state )
	{
		this.state = state;
	}
	
	public State getState()
	{
		return state;
	}
	
	public void releaseBall()
	{
		System.out.println( "A gumball comes rolling out the slot..." );
		
		if ( count != 0 )
		{
			count -= 1;
		}
	}
	
	int getCount()
	{
		return count;
	}
	
	public State getSoldOutState()
	{
		return soldOutState;
	}
	
	public State getNoQuarterState()
	{
		return noQuarterState;
	}
	
	public State getHasQuarterState()
	{
		return hasQuarterState;
	}
	
	public State getSoldState()
	{
		return soldState;
	}
	
	public State getWinnerState()
	{
		return winnerState;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer();
		
		result.append( "Gumball Machine" );
		result.append( "\nInventory: " + count + " gumball" );
		
		if ( count != 1 )
		{
			result.append( "s" );
		}
		
		result.append( "\n" );
		
		result.append( "Machine is " + state + "\n" );
		
		return result.toString();
	}
}