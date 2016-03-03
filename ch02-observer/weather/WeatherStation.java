// package observer;
import observer.WeatherData;
import observer.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay =
            new CurrentConditionDisplay(weatherData);

        // StatisticsDisplay statisticsDisplay =
            // new StatisticsDisplay(weatherData);
        //
        // ForecastDisplay frorecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.24f);
        weatherData.setMeasurements(82, 70, 29.24f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
