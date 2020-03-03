abstract class Vehicle
{
    abstract void show();
}
class Car extends Vehicle
{
    public void show()
    {
        System.out.println("Starts with key");
    }
}
class Scooter extends Vehicle
{    public void show()
    {
     System.out.println("Starts with kick");
    }
    public static void main(String[] args)
    {
        Car c =new Car();
        c.show();
        Scooter S=new Scooter();
        S.show();
    }
}


