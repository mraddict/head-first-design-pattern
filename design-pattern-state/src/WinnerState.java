
public class WinnerState implements State
{
	GumballMachine gumballMachine;

	public WinnerState( GumballMachine gumballMachine )
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "Please wait, we're already giving you a gumball" );
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "Please wait, we're already giving you al gumball" );
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
		System.out.println( "Turing again doesn't get you another gumball" );
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		gumballMachine.releaseBall();
		
		if ( gumballMachine.getCount() == 0 )
		{
			gumballMachine.setState( gumballMachine.getSoldOutState() );
		}
		else
		{
			gumballMachine.releaseBall();
			
			System.out.println( "YOU'RE A WINNER! You got two gumballs for your quater" );

			if ( gumballMachine.getCount() > 0 )
			{
				gumballMachine.setState( gumballMachine.getNoQuarterState() );
			}
			else
			{
				System.out.println( "Oops, out of gumballs" );
			}
				
		}
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "dispending two gumballs for your quarter, because YOU'RE A WINNER";
	}
}