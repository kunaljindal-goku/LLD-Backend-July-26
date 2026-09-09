package observer;

public class IPhoneUI implements WeatherSubscriber{

    public IPhoneUI(WeatherService weatherService) {
        weatherService.subscribe(this);
    }

    @Override
    public void onUpdateWeather(int newTemp) {
        System.out.println("Weather updated on Iphone = "+newTemp);
    }
}
