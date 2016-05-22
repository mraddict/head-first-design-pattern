import java.util.Random;

public class HasQuarterState implements State
{
	Random randomWinner = new Random( System.currentTimeMillis() );
	GumballMachine gumballMachine;

	public HasQuarterState( GumballMachine gumballMachine )
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "You can't insert another quarter" );
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "Quarter returned" );
		gumballMachine.setState( gumballMachine.getNoQuarterState() );
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
		System.out.println( "You turned" );
		
		int winner = randomWinner.nextInt( 10 );
		
		if ( ( winner == 0 ) && ( gumballMachine.getCount() > 1 ) )
		{
			gumballMachine.setState( gumballMachine.getWinnerState() );
		}
		else
		{
			gumballMachine.setState( gumballMachine.getSoldState() );
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		System.out.println( "No gumball dispensed" );
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "waiting for turn of crank";
	}
}