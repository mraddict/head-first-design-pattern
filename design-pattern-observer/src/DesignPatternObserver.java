
public class DesignPatternObserver
{
	public static void main( String [] args )
	{
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay( weatherData );
		
		weatherData.setMeasurements( 24 , 65 , 70.4f );
	}

}