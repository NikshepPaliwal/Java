package Inheritence;
public class Vehicle{
    String brandName;
    int year;
    
    public Vehicle(String brandName , int year){
        this.brandName = brandName;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("The Engine of the "+brandName+" is starting.");
    }

    public void stopEngine(){
        System.out.println("The Engine of the "+brandName+" is stoping.");
    }
}