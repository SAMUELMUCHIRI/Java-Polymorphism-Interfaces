package base;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String make , String model , int year , double speed , int numDoors)
    {
        super(make , model ,  year ,  speed);
        this.numDoors = numDoors;

    }

    public int getNumDoors()
    {
        return numDoors;
    }

    @Override
    public void describe()
    {
        System.out.println("\t Vehicle \n\t Make :\t"+super.getMake()+"\n\tModel :\t"+super.getModel()+"\n\tSpeed :\t"+super.getSpeed()+"\n\tYear :\t"+super.getYear()+"\n\tNumDoors :\t"+numDoors);
    }
}
