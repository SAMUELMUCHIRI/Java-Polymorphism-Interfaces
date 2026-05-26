package base;

public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String make , String model , int year , double speed , double payloadCapacity)
    {
        super(make , model ,  year ,  speed);
        this.payloadCapacity = payloadCapacity;

    }

    public double  getPayloadCapacity()
    {
        return payloadCapacity;
    }

    @Override
    public void describe()
    {
        System.out.println("\t Vehicle \n\t Make :\t"+super.getMake()+"\n\tModel :\t"+super.getModel()+"\n\tSpeed :\t"+super.getSpeed()+"\n\tYear :\t"+super.getYear()+"\n\tPayload :\t"+payloadCapacity);
    }
}
