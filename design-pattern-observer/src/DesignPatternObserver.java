
public class DesignPatternObserver
{
	public static void main( String [] args )
	{
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay( weatherData );
		
		weatherData.setMeasurements( 50 , 51 , 52.3f );
	}

}