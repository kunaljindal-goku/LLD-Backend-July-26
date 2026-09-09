package observer;

public class Client {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService(30);
        IPhoneUI kunalIphone = new IPhoneUI(weatherService);
        MacUI kunalMac = new MacUI(weatherService);

        weatherService.unsubscribe(kunalIphone);


        weatherService.updateTemp();
    }
}
