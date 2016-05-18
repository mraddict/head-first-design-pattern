
public class CurrentConditionDisplay implements Observer , DisplayElement
{
	private Subject subject;
	
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay( Subject subject )
	{
		this.subject = subject;
		subject.registerObserver( this );
	}

	@Override
	public void display()
	{
		// TODO Auto-generated method stub
	
		System.out.println( "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" );
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
	
		this.temperature = temp;
		this.humidity = humidity;
		
		display();
	}
	
	

}
