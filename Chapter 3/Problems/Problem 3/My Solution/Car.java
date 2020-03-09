public class Car
{
    private double fuel;
    private double efficiency;

    public Car(double anEfficiency)
    {
        fuel = 0;
        efficiency = anEfficiency / 100;
    }

    void addGas(double gas)
    {
        fuel = gas;
    }

    void drive(double km)
    {
        fuel = fuel - (efficiency * km);
    }

    double getGasInTank()
    {
        return fuel;
    }
}
