package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius returnVal = new Celsius((this.getValue() - 32) * 5 / 9);
        return returnVal;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit returnVal = new Fahrenheit(this.getValue());
        return returnVal;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " F";
    }
}