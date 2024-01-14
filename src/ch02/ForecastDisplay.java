package ch02;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.2f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }



    @Override
    public void display() {
        System.out.println("방송을 보도 합니다. 마지막으로 측정된 기압은 " + lastPressure);
    }

    @Override
    public void update() {
        this.lastPressure = weatherData.getPressure();
        display();
    }
}
