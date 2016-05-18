import java.util.ArrayList;

public class WeatherData implements Subject 
{
	private ArrayList observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o)
	{
		// TODO Auto-generated method stub
	
		observers.add( o );
	}

	@Override
	public void removeObserver(Observer o)
	{
		// TODO Auto-generated method stub
	
		int i = observers.indexOf( o );
		
		if ( i >= 0 )
		{
			observers.remove( i );
		}
	}

	@Override
	public void notifyObserver()
	{
		// TODO Auto-generated method stub
	
		for ( int i = 0 ; i < observers.size() ; i++ )
		{
			Observer o = ( Observer )( observers.get( i ) );
			o.update( getTemperature() , getHumidity() , getPressure() );
		}
	}
	
	public void measurementsChanged()
	{
		notifyObserver();
	}
	
	public void setMeasurements( float temperature , float humidity , float pressure )
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
