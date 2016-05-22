
public class NoQuarterState implements State
{
	GumballMachine gumballMachine;

	public NoQuarterState( GumballMachine gumballMachine )
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "You inserted a quarter" );
		
		gumballMachine.setState( gumballMachine.getHasQuarterState() );
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		
		System.out.println( "You haven't inserted a quarter" );
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
		System.out.println( "You turrned, but there't no quarter" );
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		System.out.println( "You need to pay first" );
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "waiting for quarter";
	}
}