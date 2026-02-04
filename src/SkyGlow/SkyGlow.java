package SkyGlow;

public class SkyGlow {
    public static void main(String[] args){ converter();}

    public static void converter(){

        //Fahrenheit temperature
        TemperatureConverter F1 = new TemperatureConverter(50);

        System.out.println("Temperaturen er " + F1.tempFahrenheit + " Fahrenheit.");

        //Fahrenheit to Celsius conversion
        double C1 = F1.convertFtoC();

        System.out.println("Det er " + C1 + " Celsius.");


    }
}
