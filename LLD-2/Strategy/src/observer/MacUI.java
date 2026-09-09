package observer;

public class MacUI implements WeatherSubscriber{

    public MacUI(WeatherService weatherService) {
        weatherService.subscribe(this);
    }

    @Override
    public void onUpdateWeather(int newTemp) {
        System.out.println("Weather updated on MacUI = "+newTemp);
    }
}
