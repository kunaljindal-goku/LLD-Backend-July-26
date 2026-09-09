package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

    int temp;
    private List<WeatherSubscriber> subscribers;

    public WeatherService(int temp) {
        this.temp = temp;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(WeatherSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(WeatherSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void updateTemp() {
        temp += 5;
        notifyAllSubs(temp);
    }

    private void notifyAllSubs(int temp) {
        for(WeatherSubscriber subscriber: subscribers) {
            subscriber.onUpdateWeather(temp);
        }
    }
}
