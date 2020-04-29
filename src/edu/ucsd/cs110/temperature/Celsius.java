package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float currVal = this.getValue();
        Celsius returnVal = new Celsius(currVal);;
        return returnVal;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit converted = new Fahrenheit(this.getValue()*9/5 + 32);
        return converted;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " C";
    }
}