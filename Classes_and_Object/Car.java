package Classes_and_Object;
public class Car {
    String  brandName, model;
    int year;
    public Car(String brandName, String model , int year){
        this.brandName = brandName;
        this.model = model;
        this.year = year;
    }
    public void diaplayInfo(){
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
