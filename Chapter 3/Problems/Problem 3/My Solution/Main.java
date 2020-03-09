public class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car(11.8);

        myCar.addGas(20);

        myCar.drive(20);

        System.out.println("Gas in tank: " + myCar.getGasInTank());
    }
}
