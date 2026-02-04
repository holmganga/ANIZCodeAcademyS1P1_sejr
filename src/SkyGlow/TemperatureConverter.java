package SkyGlow;
//Get celsius, convert and output Fahrenheit.
// Celsius = (Fahrenheit − 32) × 5 / 9
public class TemperatureConverter {
    public double tempFahrenheit;
    //public double tempCelsius;

    //constructor
    public TemperatureConverter(double tempFahrenheit){
        this.tempFahrenheit = tempFahrenheit;
    }

    //method
    public double convertFtoC(){return (tempFahrenheit - 32) * 5/9;}
}
