import base.* ;



public class  Main{

    public static void main(String[] args)
    {
        Vehicle[] vehicleArray = new Vehicle[4];
        vehicleArray[0] = new Car("Toyota" , "Supra", 2021 ,210.06, 2);
        vehicleArray[1] = new Car("Mazda" , "Atenza", 2024 ,190.00, 4);
        vehicleArray[2] = new Truck("Mercedes" , "Actors 3340", 2022 ,110, 25000);
        vehicleArray[3] = new Truck("Volkswagen" , "MAN TGX", 2022 ,90, 190000);

        System.out.println("\nDemonstrating Polymorphism");
        for (Vehicle v : vehicleArray)
        {
            v.describe();
        }



        //Here there is upcasting since Vehicle is the super class  , and it stores a subclass of Car ;
        Vehicle upCastingCar = new Car("Toyota" , "Supra", 2021 ,210.06, 2);

        //Here down casting happens since the subclass car is referencing a superclass vehicle . Hence, the vehicle class takes the properties of car class
        Car downCastingCar =(Car) upCastingCar;
        System.out.println("\nPrinting Object after down casting");
        downCastingCar.describe();

        System.out.println("\nUsing Wrapper classes");
        System.out.println("Passing an string to wrapper class of Integer "+ Integer.parseInt("2024"));
        System.out.println("Passing an string to wrapper class of Double "+ Double.parseDouble("99.9"));
    }
}
