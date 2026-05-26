package base;

public class Vehicle {
    private String make , model ;
    private int year;
    private double speed;

    public Vehicle(String make , String model , int year , double speed)
    {
        this.make = make ;
        this.model = model ;
        this.speed = speed ;
        this.year = year ;
    }

    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return  year;
    }
    public double getSpeed()
    {
        return speed;
    }

    public String toString()
    {
            return "\t Make\t: "+make+"\n\t Model\t: "+model+"\n\t Year\t: "+year+"\n\t Speed\t: "+speed;
    }

    public double accelerate(double amount)
    {
        this.speed+=amount;
        return speed ;
    }


    public void describe()
    {
        System.out.println("\t Vehicle \n\t Make :\t"+make+"\n\tModel :\t"+model+"\n\tSpeed :\t"+speed+"\n\tYear :\t"+year);
    }
}
